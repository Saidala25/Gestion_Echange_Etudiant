package com.example.service;

import com.example.model.Candidature;
import com.example.model.Document;
import java.util.List;

/**
 * PROPRIÉTAIRE : Personne A.
 * Les signatures ci-dessous sont le CONTRAT : ne pas les changer sans prévenir l'autre.
 * B appelle listerParOffre et changerStatut depuis l'espace responsable.
 */
public class CandidatureService {

    /**
     * Dépose une candidature (statut EN_ATTENTE, date = aujourd'hui) avec ses documents.
     * Règles : offre OUVERTE, date limite non dépassée, pas déjà postulé.
     * @throws IllegalStateException si une règle n'est pas respectée
     */
    public Candidature deposer(Long etudiantId, Long offreId, List<Document> documents) {
        throw new UnsupportedOperationException("À implémenter par A");
    }

    /** Candidatures d'un étudiant, avec leurs documents. */
    public List<Candidature> listerParEtudiant(Long etudiantId) {
        throw new UnsupportedOperationException("À implémenter par A");
    }

    /** Candidatures reçues pour une offre, avec leurs documents. */
    public List<Candidature> listerParOffre(Long offreId) {
        throw new UnsupportedOperationException("À implémenter par A");
    }

    /**
     * Change le statut (StatutConstants.ACCEPTEE ou REFUSEE) et enregistre le responsable validateur.
     */
    public Candidature changerStatut(Long candidatureId, String statut, Long responsableId) {
        throw new UnsupportedOperationException("À implémenter par A");
    }
}
