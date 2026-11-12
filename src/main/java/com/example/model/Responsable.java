
package com.example.model;

import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
@DiscriminatorValue("RESPONSABLE")
public class Responsable extends Utilisateur {

    @OneToMany(mappedBy = "responsable")
    private List<Offre> offresGerees;

    @OneToMany(mappedBy = "responsableValidateur")
    private List<Candidature> candidaturesTraitees;

    public Responsable() {
        super();
    }

    public Responsable(String nom, String email, String motDePasse) {
        super(nom, email, motDePasse);
    }

    public List<Offre> getOffresGerees() {
        return offresGerees;
    }

    public void setOffresGerees(List<Offre> offresGerees) {
        this.offresGerees = offresGerees;
    }

    public List<Candidature> getCandidaturesTraitees() {
        return candidaturesTraitees;
    }

    public void setCandidaturesTraitees(List<Candidature> candidaturesTraitees) {
        this.candidaturesTraitees = candidaturesTraitees;
    }
}
