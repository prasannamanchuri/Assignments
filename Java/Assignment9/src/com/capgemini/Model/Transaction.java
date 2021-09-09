package com.capgemini.Model;
public class Transaction
{
	private Trades trade;
	private int year;
	private int value;
	public Transaction(Trades trade,int year,int value) {
		super();
		this.trade=trade;
		this.year=year;
		this.value=value;
	}
	public Trades getTrade() {
		return trade;
	}
	public void setTrade(Trades trade) {
		this.trade = trade;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [trade=" + trade + ", year=" + year + ", value=" + value + "]";
	}
	
}