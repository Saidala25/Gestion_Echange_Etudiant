
package com.example.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "offre")
public class Offre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;

    @Column(length = 2000)
    private String description;

    private LocalDate datePublication;

    // Plusieurs offres peuvent être gérées par un responsable
    @ManyToOne
    @JoinColumn(name = "responsable_id", nullable = false)
    private Responsable responsable;

    // Plusieurs offres peuvent appartenir à une université
    @ManyToOne
    @JoinColumn(name = "universite_id", nullable = false)
    private UniversitePartenaire universite;

    // Une offre peut recevoir plusieurs candidatures
    @OneToMany(mappedBy = "offre")
    private List<Candidature> candidatures = new ArrayList<>();

    // Constructeur vide
    public Offre() {
    }

    // Constructeur avec les informations principales
    public Offre(String titre, String description, LocalDate datePublication) {
        this.titre = titre;
        this.description = description;
        this.datePublication = datePublication;
    }

    // Getters et Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public UniversitePartenaire getUniversite() {
        return universite;
    }

    public void setUniversite(UniversitePartenaire universite) {
        this.universite = universite;
    }

    public List<Candidature> getCandidatures() {
        return candidatures;
    }

    public void setCandidatures(List<Candidature> candidatures) {
        this.candidatures = candidatures;
    }
}
