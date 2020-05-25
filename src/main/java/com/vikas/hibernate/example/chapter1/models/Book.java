package com.vikas.hibernate.example.chapter1.models;

import java.math.BigDecimal;
import java.sql.Date;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Book {
	private String isbn;
	private String name;
	private Date publishdate;
	private BigDecimal price;
	private Publisher publisher;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(Date publishdate) {
		this.publishdate = publishdate;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	
	

}
