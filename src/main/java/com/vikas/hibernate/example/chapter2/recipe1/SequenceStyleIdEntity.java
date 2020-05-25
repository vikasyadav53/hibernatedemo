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
public class SequenceStyleIdEntity {
	
	@Id
	@GeneratedValue(generator="IDGen")
	@GenericGenerator(strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", name="IDGen", 
	parameters= {
		@Parameter(name= "sequence_name",value="seq_id_gen"),
		@Parameter(name="optimizer", value="pooled"),
		@Parameter(name="initial_value", value="1000"),
		@Parameter(name="increment_size", value="10")
	})
	public Long id;
	
	
	@Column
	public String field;

}
