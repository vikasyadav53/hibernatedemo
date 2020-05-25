package com.vikas.hibernate.example.chapter5.recipe0;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ReaderErrata1 {
	@Id
	@GeneratedValue()
	Long id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	Book1 book;
	
	@Temporal(TemporalType.TIMESTAMP)
	Date submitted;
	
	@Column(nullable=false)
	String content;	

	public ReaderErrata1() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Book1 getBook() {
		return book;
	}

	public void setBook(Book1 book) {
		this.book = book;
	}

	public Date getSubmitted() {
		return submitted;
	}

	public void setSubmitted(Date submitted) {
		this.submitted = submitted;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}
