package com.capgemeni.assignment1;
import java.util.*;
public class Uservalidte {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		validate();
	        
	}
	        
	    

	public static void validate()
	{
	String username, password;
    int count=0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter username:");
    username=sc.next();
    System.out.println("Enter password:");
    password=sc.next();
    for(int i=0;i<3;i++)
    {
		 if(username.equals("pra") && password.equals("man"))
         {
		 System.out.println("welcome"+username);
		 break;
         }
		 else
		 {
	
		  count++;
	
		  
		  System.out.println("re enter correct details");
		  System.out.println("Enter username:");
		    username = sc.next();
		    System.out.println("Enter password:");
		    password = sc.next();
		
		 }
	}
    if(count>=3)
    {
    	System.out.println("contact admin");
    }
	
}
}

	    
	

	
	        


