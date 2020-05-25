package com.vikas.hibernate.example.chapter3.recipe2;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

import org.hibernate.annotations.Parent;

import lombok.EqualsAndHashCode;

@Embeddable
@Table(name = "Address")
@EqualsAndHashCode
public class Address {
	@Column
	private String address1;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String zip;
	@Parent
	private Customer parent;
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public Customer getParent() {
		return parent;
	}
	public void setParent(Customer parent) {
		this.parent = parent;
	}
	
	
}
