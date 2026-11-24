package com.example.dao;

import com.example.model.Document;
import java.util.List;

public class DocumentDaoImpl extends GenericDaoImpl<Document> implements DocumentDao {

    public DocumentDaoImpl() {
        super(Document.class);
    }

    @Override
    public List<Document> findByCandidatureId(Long candidatureId) {
        return executeRead(session ->
                session.createQuery("from Document d where d.candidature.id = :id", Document.class)
                        .setParameter("id", candidatureId)
                        .getResultList());
    }
}
