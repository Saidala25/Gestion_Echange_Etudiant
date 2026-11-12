package com.example.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "candidature")
public class Candidature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateCandidature;

    private String statut;

    @ManyToOne
    @JoinColumn(name = "etudiant_id", nullable = false)
    private Etudiant etudiant;

    // Plusieurs candidatures peuvent concerner une même offre
    @ManyToOne
    @JoinColumn(name = "offre_id", nullable = false)
    private Offre offre;

    // Une candidature peut contenir plusieurs documents
    @OneToMany(mappedBy = "candidature",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Document> documents;

    // Responsable qui traite la candidature (facultatif au début)
    @ManyToOne
    @JoinColumn(name = "responsable_validateur_id")
    private Responsable responsableValidateur;

    // Constructeur vide
    public Candidature() {
    }

    // Constructeur avec les informations principales
    public Candidature(LocalDate dateCandidature, String statut) {
        this.dateCandidature = dateCandidature;
        this.statut = statut;
    }

    // Getters et Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateCandidature() {
        return dateCandidature;
    }

    public void setDateCandidature(LocalDate dateCandidature) {
        this.dateCandidature = dateCandidature;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Offre getOffre() {
        return offre;
    }

    public void setOffre(Offre offre) {
        this.offre = offre;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public Responsable getResponsableValidateur() {
        return responsableValidateur;
    }

    public void setResponsableValidateur(Responsable responsableValidateur) {
        this.responsableValidateur = responsableValidateur;
    }
}
