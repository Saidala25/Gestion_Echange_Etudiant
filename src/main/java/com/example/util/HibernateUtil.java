package com.example.util;

import java.io.InputStream;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration cfg = new Configuration().configure();

            // Lit db.local.properties (mot de passe local), s'il existe
            try (InputStream in = HibernateUtil.class.getClassLoader()
                    .getResourceAsStream("db.local.properties")) {
                if (in != null) {
                    Properties p = new Properties();
                    p.load(in);
                    p.forEach((k, v) -> cfg.setProperty(k.toString(), v.toString()));
                }
            }
            return cfg.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }

    public static void shutdown() {
        SESSION_FACTORY.close();
    }
}