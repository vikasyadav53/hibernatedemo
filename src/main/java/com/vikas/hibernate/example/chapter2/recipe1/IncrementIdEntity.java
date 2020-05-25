package com.vikas.hibernate.example.chapter2.recipe1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

//@Entity
@Setter @Getter
public class IncrementIdEntity {
	@Id
	@GeneratedValue(generator="increment")
	public Long id;
	
	
	@Column
	public String field;

}
