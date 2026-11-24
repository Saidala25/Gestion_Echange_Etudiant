package com.example.dao;

import com.example.model.Offre;
import java.util.List;

public class OffreDaoImpl extends GenericDaoImpl<Offre> implements OffreDao {

    public OffreDaoImpl() {
        super(Offre.class);
    }

    @Override
    public List<Offre> findByStatut(String statut) {
        return executeRead(session ->
                session.createQuery(
                                "from Offre o where o.statut = :statut order by o.datePublication desc",
                                Offre.class)
                        .setParameter("statut", statut)
                        .getResultList());
    }

    @Override
    public List<Offre> searchByTitre(String motCle) {
        return executeRead(session ->
                session.createQuery(
                                "from Offre o where lower(o.titre) like :mot order by o.datePublication desc",
                                Offre.class)
                        .setParameter("mot", "%" + motCle.toLowerCase() + "%")
                        .getResultList());
    }

    @Override
    public List<Offre> findByResponsableId(Long responsableId) {
        return executeRead(session ->
                session.createQuery(
                                "from Offre o where o.responsable.id = :id order by o.datePublication desc",
                                Offre.class)
                        .setParameter("id", responsableId)
                        .getResultList());
    }
}
