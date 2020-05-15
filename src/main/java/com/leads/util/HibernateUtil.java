package com.leads.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    //XML based configuration
    private static SessionFactory sessionFactory;

    public static SessionFactory buildSessionFactory() {

        // Creating Configuration Instance & Passing Hibernate Configuration File
        Configuration configObj = new Configuration();

        configObj.configure("hibernate.cfg.xml");

        // Since Hibernate Version 4.x, ServiceRegistry Is Being Used
        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();

        // Creating Hibernate HibernateUtil Instance
        return configObj.buildSessionFactory(serviceRegistryObj);
    }

    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null) sessionFactory = buildSessionFactory();
        return sessionFactory;
    }

}
