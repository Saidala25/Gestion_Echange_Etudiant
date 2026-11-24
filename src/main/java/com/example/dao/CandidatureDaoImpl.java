package com.example.dao;

import com.example.model.Candidature;
import java.util.List;

public class CandidatureDaoImpl extends GenericDaoImpl<Candidature> implements CandidatureDao {

    public CandidatureDaoImpl() {
        super(Candidature.class);
    }

    // "left join fetch" charge les documents tout de suite : la JSP peut les afficher
    // sans LazyInitializationException (la session est fermée après le DAO).

    @Override
    public List<Candidature> findByEtudiantId(Long etudiantId) {
        return executeRead(session ->
                session.createQuery(
                                "select distinct c from Candidature c left join fetch c.documents "
                                        + "where c.etudiant.id = :id order by c.dateCandidature desc",
                                Candidature.class)
                        .setParameter("id", etudiantId)
                        .getResultList());
    }

    @Override
    public List<Candidature> findByOffreId(Long offreId) {
        return executeRead(session ->
                session.createQuery(
                                "select distinct c from Candidature c left join fetch c.documents "
                                        + "where c.offre.id = :id order by c.dateCandidature desc",
                                Candidature.class)
                        .setParameter("id", offreId)
                        .getResultList());
    }

    @Override
    public boolean existsByEtudiantAndOffre(Long etudiantId, Long offreId) {
        Long nb = executeRead(session ->
                session.createQuery(
                                "select count(c) from Candidature c "
                                        + "where c.etudiant.id = :e and c.offre.id = :o", Long.class)
                        .setParameter("e", etudiantId)
                        .setParameter("o", offreId)
                        .getSingleResult());
        return nb != null && nb > 0;
    }
}
