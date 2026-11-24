package com.example.util;

/**
 * Clés communes pour la session HTTP et les rôles.
 * A écrit ces valeurs à la connexion, B (et le filtre) les lit.
 *
 * Usage : session.setAttribute(SessionConstants.UTILISATEUR, utilisateur);
 */
public class SessionConstants {

    // Clés de session
    public static final String UTILISATEUR = "utilisateur"; // objet Utilisateur connecté
    public static final String ROLE = "role";               // l'un des rôles ci-dessous

    // Rôles (identiques aux @DiscriminatorValue des entités)
    public static final String ROLE_ETUDIANT = "ETUDIANT";
    public static final String ROLE_RESPONSABLE = "RESPONSABLE";
    public static final String ROLE_ADMINISTRATEUR = "ADMINISTRATEUR";
    public static final String ROLE_UNIVERSITE = "UNIVERSITE_PARTENAIRE";

    private SessionConstants() {
    }
}
