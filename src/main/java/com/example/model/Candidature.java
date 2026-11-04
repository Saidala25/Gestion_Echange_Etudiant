package com.example.model;

import java.time.LocalDate;
import java.util.List;

public class Candidature {
    private Long id;
    private LocalDate dateCandidature;
    private String statut;

    private Etudiant etudiant;
    private Offre offre;
    private List<Document> documents;
    private Responsable responsableValidateur;
}
