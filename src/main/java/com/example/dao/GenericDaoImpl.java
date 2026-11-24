package com.example.dao;

import com.example.util.HibernateUtil;
import java.util.List;
import java.util.function.Function;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Implémentation Hibernate des opérations de base.
 * Les DAO spécifiques héritent de cette classe et ajoutent leurs requêtes
 * en utilisant executeRead (lecture) ou executeWrite (écriture).
 */
public abstract class GenericDaoImpl<T> implements GenericDao<T> {

    private final Class<T> type;

    protected GenericDaoImpl(Class<T> type) {
        this.type = type;
    }

    /** Exécute une lecture dans une session qui est fermée ensuite. */
    protected <R> R executeRead(Function<Session, R> action) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return action.apply(session);
        }
    }

    /** Exécute une écriture dans une transaction (rollback en cas d'erreur). */
    protected <R> R executeWrite(Function<Session, R> action) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            try {
                R result = action.apply(session);
                tx.commit();
                return result;
            } catch (RuntimeException e) {
                if (tx.isActive()) {
                    tx.rollback();
                }
                throw e;
            }
        }
    }

    @Override
    public T save(T entity) {
        return executeWrite(session -> {
            session.persist(entity);
            return entity;
        });
    }

    @Override
    public T update(T entity) {
        return executeWrite(session -> session.merge(entity));
    }

    @Override
    public void delete(Long id) {
        executeWrite(session -> {
            T entity = session.find(type, id);
            if (entity != null) {
                session.remove(entity);
            }
            return null;
        });
    }

    @Override
    public T findById(Long id) {
        return executeRead(session -> session.find(type, id));
    }

    @Override
    public List<T> findAll() {
        return executeRead(session ->
                session.createQuery("from " + type.getSimpleName(), type).getResultList());
    }
}
