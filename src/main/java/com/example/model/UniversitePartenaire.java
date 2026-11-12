
package com.example.model;

import java.util.List;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
@DiscriminatorValue("UNIVERSITE_PARTENAIRE")
public class UniversitePartenaire extends Utilisateur {

	@OneToMany(mappedBy = "universite")
	private List<Offre> offresProposees;

    public UniversitePartenaire() {
        super();
    }

    public UniversitePartenaire(String nom, String email, String motDePasse) {
        super(nom, email, motDePasse);
    }

    public List<Offre> getOffresProposees() {
        return offresProposees;
    }

    public void setOffresProposees(List<Offre> offresProposees) {
        this.offresProposees = offresProposees;
    }
}
