package com.example.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("ETUDIANT")
public class Etudiant extends Utilisateur {

    @OneToMany(mappedBy = "etudiant")
    private List<Candidature> candidatures;

    // Constructeur vide
    public Etudiant() {
        super();
    }

    // Constructeur avec paramètres
    public Etudiant(String nom, String email, String motDePasse) {
        super(nom, email, motDePasse);
    }

    // Getter et Setter

    public List<Candidature> getCandidatures() {
        return candidatures;
    }

    public void setCandidatures(List<Candidature> candidatures) {
        this.candidatures = candidatures;
    }
}
