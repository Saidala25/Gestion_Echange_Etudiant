package com.example.dao;

import com.example.model.Candidature;
import java.util.List;

public interface CandidatureDao extends GenericDao<Candidature> {

    /** Candidatures d'un étudiant (documents déjà chargés). */
    List<Candidature> findByEtudiantId(Long etudiantId);

    /** Candidatures reçues pour une offre (documents déjà chargés). */
    List<Candidature> findByOffreId(Long offreId);

    /** Vrai si l'étudiant a déjà postulé à cette offre. */
    boolean existsByEtudiantAndOffre(Long etudiantId, Long offreId);
}
