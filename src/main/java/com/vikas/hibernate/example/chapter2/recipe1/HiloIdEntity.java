package com.vikas.hibernate.example.chapter2.recipe1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

//@Entity
@Getter @Setter
public class HiloIdEntity {
	@Id
	@GeneratedValue(generator="hilo")
	public Long id;
	
	@Column
	public String field;
	
	
}
