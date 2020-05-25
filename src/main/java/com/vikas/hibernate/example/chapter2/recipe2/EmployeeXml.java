package com.vikas.hibernate.example.chapter2.recipe2;

import java.io.Serializable;

public class EmployeeXml implements Serializable{

	private String department;

	private String idCard;

	private String name;
	
	public EmployeeXml() {
		
	}
	
	public EmployeeXml(String department, String idCard) {
		this.department = department;
		this.idCard= idCard;
	}
	
	public EmployeeXml(String department, String idCard, String name) {
		this.department = department;
		this.idCard = idCard;
		this.name= name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
