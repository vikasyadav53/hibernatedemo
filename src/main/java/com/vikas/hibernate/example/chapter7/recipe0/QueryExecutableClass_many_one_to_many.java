package com.vikas.hibernate.example.chapter7.recipe0;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class QueryExecutableClass_many_one_to_many {

	public void unidirectionalOneToMany() {
		Session session = SessionManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Book3 book1 = new Book3();
		book1.setTitle("First title");
		Chapter1 chapter1 = new Chapter1();
		chapter1.setTitle("first chapter");
		chapter1.setContent("here's some text");
		book1.getChapters().add(chapter1);

		Chapter1 chapter2 = new Chapter1();
		chapter1.setTitle("second chapter");
		chapter1.setContent("here's some text for chapter2");
		book1.getChapters().add(chapter2);
		session.save(book1);
		tx.commit();
		session.close();
		session = SessionManager.openSession();
		tx = session.beginTransaction();
		Book3 book = (Book3) session.byId(Book3.class).load(book1.getId());
		tx.commit();
		session.close();

	}

	public void bidirectionalOneToMany() {
		Session session = SessionManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		Book4 book2 = new Book4();
		book2.setTitle("First title");
		Chapter2 chapter2 = new Chapter2();
		chapter2.setTitle("first chapter");
		chapter2.setContent("here's some text");
		chapter2.setBook4(book2);
		book2.getChapters().add(chapter2);
		session.save(book2);
		tx.commit();
		session.close();
		session = SessionManager.openSession();
		tx = session.beginTransaction();
		Book4 book = (Book4) session.byId(Book4.class).load(book2.getId());
		tx.commit();
		session.close();
	}

}
