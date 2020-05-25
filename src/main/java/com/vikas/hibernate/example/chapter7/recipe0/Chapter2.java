package com.vikas.hibernate.example.chapter7.recipe0;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Chapter2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String title;
	@Column
	String content;
	@ManyToOne()
	Book4 book4;

	public Chapter2() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Book4 getBook4() {
		return book4;
	}

	public void setBook4(Book4 book4) {
		this.book4 = book4;
	}

}
