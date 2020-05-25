package com.vikas.hibernate.example.chapter1.models;

import java.math.BigDecimal;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class QueryExecutableClass_XMLMAPPING {

	public static void execute() {
		Session session = SessionManager.getSessionFactory().openSession();
	    Transaction tx = session.beginTransaction();
	    Publisher publisher = new Publisher();
	    publisher.setCode("apress");
	    publisher.setName("Apress");
	    publisher.setAddress("233 Spring Street, New York, NY 10013");

	    Book book = new Book();
	    book.setIsbn("9781484201282");
	    book.setName("Hibernate Recipes");
	    book.setPrice(new BigDecimal("44.00"));
	    book.setPublishdate(Date.valueOf("2014-10-10"));
	    book.setPublisher(publisher);

	    session.persist(book);

	    tx.commit();
	    session.close();

	}

}
