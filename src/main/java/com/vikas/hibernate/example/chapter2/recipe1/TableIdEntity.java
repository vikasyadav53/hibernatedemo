package com.vikas.hibernate.example.chapter2.recipe1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class TableIdEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@TableGenerator(name="tableIdentifiers")
	public Long id;
	
	@Column
	public String field;

}
