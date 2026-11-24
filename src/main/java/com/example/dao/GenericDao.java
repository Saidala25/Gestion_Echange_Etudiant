package com.example.dao;

import java.util.List;

/** Opérations de base communes à tous les DAO. */
public interface GenericDao<T> {

    T save(T entity);

    T update(T entity);

    void delete(Long id);

    T findById(Long id);

    List<T> findAll();
}
