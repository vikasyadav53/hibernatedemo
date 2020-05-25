package com.vikas.hibernate.example.chapter2.recipe2;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class QueryExcecutableClass_CH2_Comp_XML {

	public void test() {
		EmployeeXml emp = new EmployeeXml("1", "1", "Joseph Ottinger");
		Session session = SessionManager.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();

		emp = new EmployeeXml("1", "2", "Joseph Fernandiz");
		session = SessionManager.getSessionFactory().openSession();
		tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();

		EmployeeXml emp1 = new EmployeeXml("1", "2");
		session = SessionManager.getSessionFactory().openSession();
		tx = session.beginTransaction();
		emp = (EmployeeXml) session.get(EmployeeXml.class, emp1);
		tx.commit();
		session.close();

		System.out.println("Employee Name: " + emp.getName());

	}

}
