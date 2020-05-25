package com.vikas.hibernate.example.chapter5.recipe0;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Book2 {
	@Id
	@GeneratedValue()
	Long id;
	@Column(nullable=false)
	String title;
	@Column(nullable=false)
	BigDecimal price;
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinTable(name="publisher_book")
	Publisher2 publisher;
	public Book2() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Publisher2 getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher2 publisher) {
		this.publisher = publisher;
	}
	
	
	
	

}
