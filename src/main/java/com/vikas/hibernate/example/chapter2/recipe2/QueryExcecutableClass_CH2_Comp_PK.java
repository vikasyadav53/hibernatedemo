package com.vikas.hibernate.example.chapter2.recipe2;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class QueryExcecutableClass_CH2_Comp_PK {

	public void test() {
		Employee emp = new Employee(1L, 1L, "Joseph Ottinger");
		Session session = SessionManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();

		emp = new Employee(1L, 2L, "Joseph Fernandiz");
		session = SessionManager.getSessionFactory().openSession();
		tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();

		Employee emp1 = new Employee(1L, 2L);
		session = SessionManager.getSessionFactory().openSession();
		tx = session.beginTransaction();
		emp = (Employee) session.get(Employee.class, emp1);
		tx.commit();
		session.close();

		System.out.println("Employee Name: " + emp.getName());

	}

}
