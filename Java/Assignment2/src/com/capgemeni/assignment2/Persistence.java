package com.capgemeni.assignment2;

public abstract class Persistence {
	public abstract void persist();
	public static void main(String args[])
	{
		Filepersistence f=new Filepersistence ();
		f.persist();
		Databasepersistence d=new Databasepersistence ();
		d.persist();
		
	}

}
class Filepersistence extends Persistence{
	public void persist()
	{
		System.out.println("data is saved in file");
	}

}
class Databasepersistence extends Persistence {
	public void persist()
	{
		System.out.println("data is saved in database");
	}

}

