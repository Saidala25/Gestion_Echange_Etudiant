package com.example.dao;

import com.example.model.Offre;
import java.util.List;

public interface OffreDao extends GenericDao<Offre> {

    /** Offres ayant ce statut (StatutConstants.OUVERTE / FERMEE), les plus récentes d'abord. */
    List<Offre> findByStatut(String statut);

    /** Recherche par mot du titre (insensible à la casse). */
    List<Offre> searchByTitre(String motCle);

    /** Offres gérées par un responsable. */
    List<Offre> findByResponsableId(Long responsableId);
}
