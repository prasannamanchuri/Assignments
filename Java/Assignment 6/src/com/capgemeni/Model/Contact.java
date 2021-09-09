package com.capgemeni.Model;

import java.util.Comparator;

public class Contact implements Comparator<Contact>{
	private long phoneNumber;
	private String name;
	private String email;
	private Gender gender;
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Contact(long phoneNumber, String name, String email, Gender gender) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ "]";
	}
	@Override
	public int compare(Contact o1, Contact o2) {
		return Long.compare(o1.getPhoneNumber(), o2.getPhoneNumber());
	}
	
}
