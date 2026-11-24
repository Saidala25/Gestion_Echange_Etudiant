package com.example.service;

import com.example.model.Responsable;
import com.example.model.UniversitePartenaire;
import com.example.model.Utilisateur;
import java.util.List;

/**
 * PROPRIÉTAIRE : Personne B.
 * Gestion des comptes et des universités par l'administrateur.
 * Utilise UtilisateurDao (déjà fourni, rien à attendre de A).
 */
public class AdminService {

    public List<Utilisateur> listerUtilisateurs() {
        throw new UnsupportedOperationException("À implémenter par B");
    }

    /** Crée un compte responsable (mot de passe haché avec BCrypt). */
    public Responsable creerResponsable(Responsable responsable) {
        throw new UnsupportedOperationException("À implémenter par B");
    }

    /** Active ou désactive un compte. */
    public void changerActivation(Long utilisateurId, boolean actif) {
        throw new UnsupportedOperationException("À implémenter par B");
    }

    public List<Utilisateur> listerUniversites() {
        throw new UnsupportedOperationException("À implémenter par B");
    }

    public UniversitePartenaire creerUniversite(UniversitePartenaire universite) {
        throw new UnsupportedOperationException("À implémenter par B");
    }
}
