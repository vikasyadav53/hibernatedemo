package com.vikas.hibernate.example.chapter2.recipe2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class ISBN implements Serializable {
	
	@Column(name="group_number")
	int group;
	int titleRef;
	int publisher;
	int checkDigit;
	
	public ISBN() {
		
	}
	
	public ISBN(int titleGroup, int group, int publisher, int checkDigit) {
		this.titleRef = titleGroup;
		this.group = group;
		this.publisher = publisher;
		this.checkDigit= checkDigit;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getTitleRef() {
		return titleRef;
	}

	public void setTitleRef(int titleRef) {
		this.titleRef = titleRef;
	}

	public int getPublisher() {
		return publisher;
	}

	public void setPublisher(int publisher) {
		this.publisher = publisher;
	}

	public int getCheckDigit() {
		return checkDigit;
	}

	public void setCheckDigit(int checkDigit) {
		this.checkDigit = checkDigit;
	}
	
	

}
