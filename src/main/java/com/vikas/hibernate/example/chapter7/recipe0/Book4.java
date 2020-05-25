package com.vikas.hibernate.example.chapter7.recipe0;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book4 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String title;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "book4")
	Set<Chapter2> chapters = new HashSet();

	public Book4() {
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

	public Set<Chapter2> getChapters() {
		return chapters;
	}

	public void setChapters(Set<Chapter2> chapters) {
		this.chapters = chapters;
	}

}
