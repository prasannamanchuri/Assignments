package com.capgemini.spring.model;

public class Address {
	private String city;
	private String state;
	private String country;
	private int zopcode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZopcode() {
		return zopcode;
	}
	public void setZopcode(int zopcode) {
		this.zopcode = zopcode;
	}
	public Address(String city, String state, String country, int zopcode) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.zopcode = zopcode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", zopcode=" + zopcode + "]";
	}
	


}
