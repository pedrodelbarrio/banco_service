package com.fpmislata.banco_service.persistence.dao.impl.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static void buildSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }

    public static SessionFactory getSessionFactory() {

        return sessionFactory;
    }

    public static void closeSessionFactory() {
        sessionFactory.close();
    }

}
