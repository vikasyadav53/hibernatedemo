package com.vikas.hibernate.example.chapter5.recipe0;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

@Entity
public class Customer5 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(nullable = false)
	String name;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="customer_address", 
		joinColumns= @JoinColumn(name="customer_id"),
		inverseJoinColumns=@JoinColumn(name="address_id"))
	private Address5 address5;

	public Customer5() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address5 getAddress5() {
		return address5;
	}

	public void setAddress5(Address5 address5) {
		this.address5 = address5;
	}

}
