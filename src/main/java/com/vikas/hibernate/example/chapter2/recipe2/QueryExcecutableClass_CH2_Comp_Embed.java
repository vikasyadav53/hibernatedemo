package com.vikas.hibernate.example.chapter2.recipe2;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class QueryExcecutableClass_CH2_Comp_Embed {

	public void test() {
		Book book = new Book(14, 3026, 517, 7, "Beginning Hibernate");
		Session session = SessionManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(book);
		tx.commit();
		session.close();
		
		
		/*ISBN isbn = new ISBN(14, 3026, 517, 7);
		session = SessionManager.getSessionFactory().openSession();
		tx = session.beginTransaction();
		book = (Book) session.load(Book.class, isbn);
		tx.commit();
		session.close();*/

		System.out.println("Book Name: " + book.getTitle());

	}

}
