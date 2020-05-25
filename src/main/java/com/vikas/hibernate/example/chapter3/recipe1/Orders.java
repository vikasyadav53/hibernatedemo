package com.vikas.hibernate.example.chapter3.recipe1;

public class Orders {
	
	private Long id;
	private Contact weekdayContact;
	private Contact holidayContact;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Contact getWeekdayContact() {
		return weekdayContact;
	}
	public void setWeekdayContact(Contact weekdayContact) {
		this.weekdayContact = weekdayContact;
	}
	public Contact getHolidayContact() {
		return holidayContact;
	}
	public void setHolidayContact(Contact holidayContact) {
		this.holidayContact = holidayContact;
	}

}
