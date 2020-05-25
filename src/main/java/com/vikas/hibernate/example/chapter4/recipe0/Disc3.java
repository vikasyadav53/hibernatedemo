package com.vikas.hibernate.example.chapter4.recipe0;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.EqualsAndHashCode;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@EqualsAndHashCode
public class Disc3 {
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.TABLE)
	Long id;
	@Column(nullable = false)
	String name;
	@Column(nullable = false)
	int price;

	public Disc3() {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
