package com.example.service;

import com.example.model.Offre;
import java.util.List;

/**
 * PROPRIÉTAIRE : Personne B.
 * Les signatures ci-dessous sont le CONTRAT : ne pas les changer sans prévenir l'autre.
 * A en a besoin pour afficher les offres aux étudiants : B la livre en premier.
 */
public class OffreService {

    /** Offres au statut OUVERTE (et dont la date limite n'est pas dépassée), les plus récentes d'abord. */
    public List<Offre> listerOuvertes() {
        throw new UnsupportedOperationException("À implémenter par B");
    }

    /** Renvoie l'offre ou null si elle n'existe pas. */
    public Offre trouverParId(Long id) {
        throw new UnsupportedOperationException("À implémenter par B");
    }

    /** Enregistre une nouvelle offre (statut OUVERTE, datePublication = aujourd'hui). */
    public Offre creer(Offre offre) {
        throw new UnsupportedOperationException("À implémenter par B");
    }

    /** Met à jour une offre existante. */
    public Offre modifier(Offre offre) {
        throw new UnsupportedOperationException("À implémenter par B");
    }

    /** Passe l'offre au statut FERMEE. */
    public void fermer(Long id) {
        throw new UnsupportedOperationException("À implémenter par B");
    }
}
