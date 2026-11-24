package com.example.dao;

import com.example.model.Utilisateur;
import java.util.List;

public class UtilisateurDaoImpl extends GenericDaoImpl<Utilisateur> implements UtilisateurDao {

    public UtilisateurDaoImpl() {
        super(Utilisateur.class);
    }

    @Override
    public Utilisateur findByEmail(String email) {
        return executeRead(session ->
                session.createQuery("from Utilisateur u where u.email = :email", Utilisateur.class)
                        .setParameter("email", email)
                        .uniqueResult());
    }

    @Override
    public List<Utilisateur> findByRole(String role) {
        // type_utilisateur est la colonne discriminante : on filtre avec type()
        return executeRead(session ->
                session.createNativeQuery(
                                "select * from utilisateur where type_utilisateur = :role", Utilisateur.class)
                        .setParameter("role", role)
                        .getResultList());
    }
}
