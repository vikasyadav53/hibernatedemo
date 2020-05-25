package com.vikas.hibernate.example.chapter4.recipe0;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionManager {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration config = new Configuration().configure("hibernate_ch4.cfg.xml");
			ServiceRegistry serviceReg = new StandardServiceRegistryBuilder().applySettings(config.getProperties())
					.build();
			return config.buildSessionFactory(serviceReg);
		} catch (Exception ex) {
			ex.printStackTrace();

			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static Session openSession() {
		return getSessionFactory().openSession();
	}
	
	public static void deleteAll(String type) {
        Session session = openSession();
        Transaction tx = session.beginTransaction();
        List elements = session.createQuery("from " + type + " b").list();
        for (Object o : elements) {
            session.delete(o);
        }
        tx.commit();
        session.close();
    }
}
