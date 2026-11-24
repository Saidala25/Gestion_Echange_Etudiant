package com.example.service;

import com.example.model.Etudiant;
import com.example.model.Utilisateur;

/**
 * PROPRIÉTAIRE : Personne A.
 * Les signatures ci-dessous sont le CONTRAT : ne pas les changer sans prévenir l'autre.
 */
public class UtilisateurService {

    /**
     * Crée un compte étudiant : refuse un email déjà utilisé, hache le mot de passe (BCrypt).
     * @throws IllegalArgumentException si l'email existe déjà ou si un champ est vide
     */
    public Etudiant inscrire(Etudiant etudiant) {
        throw new UnsupportedOperationException("À implémenter par A");
    }

    /**
     * Vérifie email + mot de passe.
     * @return l'utilisateur si les identifiants sont corrects et le compte actif, sinon null
     */
    public Utilisateur authentifier(String email, String motDePasse) {
        throw new UnsupportedOperationException("À implémenter par A");
    }
}
