package com.vikas.hibernate.example.chapter3.recipe1;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class QueryExecutableClass_Component_XML {

	public void test() {
		Session session = SessionManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Orders order = new Orders();
		order.setWeekdayContact(new Contact("Srinivas Guruzu", "100 Main Street", "454, 555, 1212"));
		order.setHolidayContact(new Contact("Joseph Ottinger", "P. O. Box 0", "978, 555, 1212"));
		session.persist(order);
		tx.commit();
		session.close();

	}

}
