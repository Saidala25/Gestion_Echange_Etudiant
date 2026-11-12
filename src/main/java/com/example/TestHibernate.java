package com.example;

import com.example.util.HibernateUtil;

//Classe de test : vérifie la connexion à MySQL et la création des tables.

public class TestHibernate {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory();
        System.out.println("Hibernate OK, tables créées.");
        HibernateUtil.shutdown();
    }
}