package com.vikas.hibernate.example.chapter5.recipe0;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Publisher2 {
	@Id
	@GeneratedValue()
	Long id ;
	@Column(nullable=false)
	String name;
	@Column(nullable=false)
	String address;
	@OneToMany
	List<Book2> books;
	public Publisher2() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Book2> getBooks() {
		return books;
	}
	public void setBooks(List<Book2> books) {
		this.books = books;
	}
	
	
	
	
}
