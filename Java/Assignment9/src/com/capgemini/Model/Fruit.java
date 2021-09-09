package com.capgemini.Model;
public class Fruit
{
	private String name;
	private String color;
	private int calories;
	private int price;
	public Fruit(String name,String color,int calories,int price)
	{
	        //super();
	        this.name = name;
	        this.color = color;
	        this.calories = calories;
	        this.price=price;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public int getCalories()
	{
		return calories;
	}
	public void setCalories(int calories)
	{
		this.calories = calories;
	}
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
}