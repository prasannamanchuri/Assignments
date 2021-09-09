package com.capgemeni.Generics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LeapYearLinkedList {
	static Node root;
	static class Node{
		Date val;
		Node next;
		public Node(Date value) {
			this.val=value;
			this.next=null;
		}
	}
	public static void printNodes(Node root) {
		while(root!=null) {
			System.out.println(root.val+",....Leap Year"+isLeapYear(root.val.getYear()));
			root=root.next;
		}
	}
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Node root=new Node(sdf.parse("08-09-2021"));
		root.next=new Node(sdf.parse("08-09-2020"));
		root.next.next=new Node(sdf.parse("08-09-2019"));
		printNodes(root);
		System.out.println("DONE");
	}
	
	public static boolean isLeapYear(int year)
    {
        // flag to take a non-leap year by default
        boolean is_leap_year = false;
 
        // If year is divisible by 4
        if (year % 4 == 0) {
 
            // To identify whether it
            // is a century year or
            // not
            if (year % 100 == 0) {
               
                // Checking if year is divisible by 400
                // therefore century leap year
                if (year % 400 == 0) {
                    is_leap_year = true;
                }
 
                else {
                    is_leap_year = false;
                }
            }
 
            // Out of if loop that is Non century year
            // but divisible by 4, therefore leap year
            is_leap_year = true;
        }
 
        // We land here when corresponding if fails
        // If year is not divisible by 4
        else
 
            // Flag dealing-  Non leap-year
            is_leap_year = false;
 
        if (!is_leap_year) {
            return false;
        }
 
        else {
            return true;
        }
    }

}
