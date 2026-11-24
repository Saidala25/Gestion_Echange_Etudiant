package com.example.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("ETUDIANT")
public class Etudiant extends Utilisateur {

    @OneToMany(mappedBy = "etudiant")
    private List<Candidature> candidatures;

    public Etudiant() {
        super();
    }

    public Etudiant(String nom, String email, String motDePasse) {
        super(nom, email, motDePasse);
    }


    public List<Candidature> getCandidatures() {
        return candidatures;
    }

    public void setCandidatures(List<Candidature> candidatures) {
        this.candidatures = candidatures;
    }
}
