package com.vikas.hibernate.example.chapter3.recipe2;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

@Entity
@DynamicUpdate
@DynamicInsert
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(generator="customergen")
	@GenericGenerator(name="customergen", strategy="increment")
	@Column(name="id")
	private long id;
	
	@Column
	private String name;
	
	@ElementCollection(targetClass=Address.class, fetch=FetchType.EAGER)
	@JoinTable(name="Address", joinColumns=@JoinColumn(name="Customer_ID"))
	private Set<Address> contacts;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Address> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Address> contacts) {
		this.contacts = contacts;
	}
	
	

}
