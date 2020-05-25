package com.vikas.hibernate.example.chapter3.recipe1;

public class Contact {

	private long id;
	private String recipient;
	private String phone;
	private String address;

	public Contact() {
	}

	public Contact(String recipient, String phone, String address) {
		super();
		this.recipient = recipient;
		this.phone = phone;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
