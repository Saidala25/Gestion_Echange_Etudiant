package com.example.model;

import java.time.LocalDate;
import java.util.List;

public class Offre {
    private Long id;
    private String titre;
    private String description;
    private LocalDate datePublication;

    private Responsable responsable;
    private UniversitePartenaire universite;
    private List<Candidature> candidatures;
}
