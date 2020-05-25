package com.vikas.hibernate.example.chapter5.recipe0;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book1 {

	@Id
	@GeneratedValue()
	Long id;
	@Column(nullable=false)
	String title;
	
	public Book1() {
		
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
	
	
	
}
