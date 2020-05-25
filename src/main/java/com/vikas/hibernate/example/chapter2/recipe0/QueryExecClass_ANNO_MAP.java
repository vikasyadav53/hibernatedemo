package com.vikas.hibernate.example.chapter2.recipe0;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class QueryExecClass_ANNO_MAP {
	
	
	public void execute() { 
		Product product = new Product();
        product.setSku(1234l);
        product.setTitle("XBox");
        product.setDescription("Gaming");
        
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(product);
        tx.commit();
        session.close();
	}

}
