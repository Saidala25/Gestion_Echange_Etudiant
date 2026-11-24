package com.example.dao;

import com.example.model.Document;
import java.util.List;

public interface DocumentDao extends GenericDao<Document> {

    List<Document> findByCandidatureId(Long candidatureId);
}
