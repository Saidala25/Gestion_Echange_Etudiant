package com.example;

import com.example.util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory();
        System.out.println("Hibernate OK, tables créées.");
        HibernateUtil.shutdown();
    }
}