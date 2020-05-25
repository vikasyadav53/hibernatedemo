package com.vikas.hibernate.example.chapter2.recipe1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.Getter;
import lombok.Setter;

@Entity

@Getter @Setter
public class EnhancedTableIdEntity {
	
	@Id
	@GeneratedValue(generator="TableIdGen")
	@GenericGenerator(strategy="org.hibernate.id.enhanced.TableGenerator",name="TableIdGen",
	parameters= {
			@Parameter(name="table_name", value="enhanced_hibernate_sequence"),
			@Parameter(name="segment_value", value="id"),
			@Parameter(name="optimizer", value="pooled"),
			@Parameter(name="initial_value", value="1000"),
			@Parameter(name="increment_size", value="10")
	})
	public Long id;
	
	@Column
	public String field;
	
	

}
