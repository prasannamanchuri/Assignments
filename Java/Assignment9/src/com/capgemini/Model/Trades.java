package com.capgemini.Model;
public class Trades
{
	private String name;
	private String city;
	public Trades(String name,String city) {
		super();
		// TODO Auto-generated constructor stub
		this.name=name;
		this.city=city;
		
	}
	@Override
	public String toString() {
		return "Trades [name=" + name + ", city=" + city + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}