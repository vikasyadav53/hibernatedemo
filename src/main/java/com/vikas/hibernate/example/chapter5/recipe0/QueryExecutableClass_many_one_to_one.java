package com.vikas.hibernate.example.chapter5.recipe0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class QueryExecutableClass_many_one_to_one {

	public void test() { // many to one using foreign key
		Session session = SessionManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Book1 book1 = new Book1();
		book1.setTitle("Hibernate Recipes");
		ReaderErrata1 re = new ReaderErrata1();
		re.setBook(book1);
		re.setContent("First chapter is too short");
		session.persist(re);
		tx.commit();
		session.close();
		session = SessionManager.openSession();
		tx = session.beginTransaction();
		ReaderErrata1 re1 = (ReaderErrata1) session.byId(ReaderErrata1.class).load(re.getId());
		tx.commit();
		session.close();
	}

	public void testJoinTable() { // Many to one using join table
		Session session = SessionManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Publisher2 publisher = new Publisher2();
		publisher.setName("Sirius Topics");
		publisher.setAddress("100 Canine Way");
		publisher.setBooks(new ArrayList<Book2>());
		Book2 book2 = new Book2();
		book2.setTitle("Now isn't the Time");
		book2.setPrice(BigDecimal.valueOf(29.99));
		publisher.getBooks().add(book2);
		session.persist(book2);
		session.persist(publisher);
		tx.commit();
		session.close();
	}

	public void testOneToOne() { // One to one using join table
		Session session = SessionManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		/*Customer4 customer4 = new Customer4();
		customer4.setName("Absalom");
		//session.persist(customer4);

		Address4 address4 = new Address4();
		address4.setAddress("100 Hebron Way");
		address4.setCity("Tel Aviv");

		address4.setCustomer4(customer4);
		customer4.setAddress4(address4);
		session.persist(customer4);

		tx.commit();
		session.close();*/
		
		session = SessionManager.getSessionFactory().openSession();
		tx = session.beginTransaction();
		Customer4 customer5 = new Customer4();
		customer5.setName("Absalom2");
		//session.persist(customer4);

		Address4 address5 = new Address4();
		address5.setAddress("100 Hebron Way2");
		address5.setCity("Tel Aviv2");

		address5.setCustomer4(customer5);
		customer5.setAddress4(address5);
		session.persist(customer5);

		tx.commit();
		session.close();

		/*session = SessionManager.getSessionFactory().openSession();
		tx = session.beginTransaction();
		Customer4 customer = (Customer4) session.byId(Customer4.class).load(customer4.getId());
		tx.commit();
		session.close();*/
	}
	
	public void testOnetoOneJoin() {
		Session session = SessionManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Customer5 customer5 = new Customer5();
		customer5.setName("Absalom");
		session.persist(customer5);
		Address5 address5 = new Address5();
		address5.setAddress("100 Hebron Way");
		address5.setCity("Tel Aviv");
		address5.setCustomer5(customer5);
		customer5.setAddress5(address5);
		tx.commit();
		session.close();
		session = SessionManager.getSessionFactory().openSession();
		tx = session.beginTransaction();
		Customer5 customer = (Customer5) session
		.byId(Customer5.class)
		.load(customer5.getId());
		//Hibernate.initialize(customer.getAddress5());
		tx.commit();
		session.close();
		//assertEquals(customer.getName(), customer5.getName());
		//assertEquals(customer.getAddress5().getAddress(),
		//customer5.getAddress5().getAddress());
	}

}
