package com.vikas.hibernate.example.chapter4.recipe0;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Entity
public class VideoDisc2 extends Disc2{
	
	@Column
	String director;
	@Column
	String language;
	
	public VideoDisc2() {
		
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	

}
