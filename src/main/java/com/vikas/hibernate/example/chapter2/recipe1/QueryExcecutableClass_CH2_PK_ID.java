package com.vikas.hibernate.example.chapter2.recipe1;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class QueryExcecutableClass_CH2_PK_ID {

	String[] classNames = { "com.vikas.hibernate.example.chapter2.recipe1.AutoIdEntity",
			"com.vikas.hibernate.example.chapter2.recipe1.EnhancedTableIdEntity",
			//"com.vikas.hibernate.example.chapter2.recipe1.HiloIdEntity",
			"com.vikas.hibernate.example.chapter2.recipe1.IdentityIdEntity",
			//"com.vikas.hibernate.example.chapter2.recipe1.IncremenetdEnitity",
			//"com.vikas.hibernate.example.chapter2.recipe1.SequenceIdEntity",` --> not supoorted by Microsoft sql server
			"com.vikas.hibernate.example.chapter2.recipe1.SequenceStyleIdEntity",
			"com.vikas.hibernate.example.chapter2.recipe1.TableIdEntity",
			//"com.vikas.hibernate.example.chapter2.recipe1.UUIdEntity"
			};

	Set<Object> generatedKey = new HashSet<Object>();
	static int i = 0;
	Lock reentrantLock = new ReentrantLock();

	public void test() {
		for (String classname : classNames) {
			try {
				reentrantLock.lock();
				testGenerator(classname);

			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				reentrantLock.unlock();
			}
		}
	}

	public void testGenerator(String className) throws Exception {
		System.out.println("Testing : " + className);
		Class<?> entityType = Class.forName(className);
		Field idField = entityType.getDeclaredField("id");
		Field fieldField = entityType.getDeclaredField("field");		
		Session session = SessionManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		try {
		for (int j = 0; j < 4; j++) {
			Object o = entityType.newInstance();
			fieldField.set(o, "" + (char) ('a' + i) + (char) ('b' + j));
			session.persist(o);
			generatedKey.add(idField.get(o));
		}
		}finally {
			tx.commit();
			session.close();
		}
	}
	
	public void getGeneratedKeySize() {
		System.out.println( "Generated Key Size : " + generatedKey.size());
	}

}
