package com.vikas.hibernate.example.chapter5.recipe0;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address4 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@OneToOne
	Customer4 customer4;
	@Column
	String address;
	@Column
	String city;
	public Address4() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer4 getCustomer4() {
		return customer4;
	}
	public void setCustomer4(Customer4 customer4) {
		this.customer4 = customer4;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
}
