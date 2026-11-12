
package com.example.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ADMINISTRATEUR")
public class Administrateur extends Utilisateur {

    public Administrateur() {
        super();
    }

    public Administrateur(String nom, String email, String motDePasse) {
        super(nom, email, motDePasse);
    }
}
