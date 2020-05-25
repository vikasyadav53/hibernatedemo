package com.vikas.hibernate.example.chapter2.recipe1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class AutoIdEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO) //Other possible type - IDENTITY, SEQUENCE, TABLE
	public Long id;	
	
	@Column
	public String field;

}
