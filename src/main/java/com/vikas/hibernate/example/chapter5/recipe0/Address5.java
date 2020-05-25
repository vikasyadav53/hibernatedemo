package com.vikas.hibernate.example.chapter5.recipe0;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address5 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@OneToOne(mappedBy="address5")
	Customer5 customer5;
	@Column
	String address;
	@Column
	String city;
	public Address5() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer5 getCustomer5() {
		return customer5;
	}
	public void setCustomer5(Customer5 customer5) {
		this.customer5 = customer5;
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
