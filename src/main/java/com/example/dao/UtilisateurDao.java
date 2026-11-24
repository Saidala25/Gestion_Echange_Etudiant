package com.example.dao;

import com.example.model.Utilisateur;
import java.util.List;

public interface UtilisateurDao extends GenericDao<Utilisateur> {

    /** Renvoie l'utilisateur ayant cet email, ou null. */
    Utilisateur findByEmail(String email);

    /** Liste les utilisateurs d'un rôle (voir SessionConstants.ROLE_*). */
    List<Utilisateur> findByRole(String role);
}
