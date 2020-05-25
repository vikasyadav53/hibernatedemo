package com.vikas.hibernate.example.chapter5.recipe0;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer4 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(nullable = false)
	String name;

	@OneToOne(cascade=CascadeType.PERSIST)
	private Address4 address4;

	public Customer4() {
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

	public Address4 getAddress4() {
		return address4;
	}

	public void setAddress4(Address4 address4) {
		this.address4 = address4;
	}

}
