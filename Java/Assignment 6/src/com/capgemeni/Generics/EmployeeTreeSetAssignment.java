package com.capgemeni.Generics;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.capgemeni.Model.Employee;
import com.capgemeni.Model.Product;

public class EmployeeTreeSetAssignment {

	public static void main(String[] args)
	{
		
        System.out.println("select one option on which u need to print emp detailsin sorted manner");
        System.out.println("a) Id");
        System.out.println("b) empName");
        System.out.println("c) dept");
        System.out.println("d) salary");
        System.out.println("enter your choice");
        Scanner sc=new Scanner(System.in);
        String ch=sc.next();
        switch(ch) 
        {
        case "a":
        	TreeSet<Employee>employees = new TreeSet<Employee>(new IdComparator());
            employees.add(new Employee(1, "Raj","sales",60000));
            employees.add(new Employee(1, "Pras","HR",100000));
            employees.add(new Employee(4, "bhanu","lnd",80000));
            employees.add(new Employee(2, "lali","BU",200000));
            employees.add(new Employee(7, "rajla","IT",150000));
            System.out.println("Employee list sorted by Id");
            System.out.println("-------------------------------------------");
            for(Employee e: employees)
    		{
    			System.out.print(e.getEmpId()+" "+e.getEmpName()+" "+e.getDept()+" "+e.getSalary());
    			System.out.println();
    		}
        	break;
        case "b":
        	TreeSet<Employee>employees1 = new TreeSet<Employee>(new NameComparator());
            employees1.add(new Employee(1, "Raj","sales",60000));
            employees1.add(new Employee(1, "Pras","HR",100000));
            employees1.add(new Employee(4, "bhanu","lnd",80000));
            employees1.add(new Employee(2, "lali","BU",200000));
            employees1.add(new Employee(7, "rajla","IT",150000));
            System.out.println("Employee list sorted by Name");
            System.out.println("-------------------------------------------");
            for(Employee e: employees1)
    		{
    			System.out.print(e.getEmpId()+" "+e.getEmpName()+" "+e.getDept()+" "+e.getSalary());
    			System.out.println();
    		}
        	
       	   break;
        case "c":
        	TreeSet<Employee>employees2 = new TreeSet<Employee>(new DeptComparator());
            employees2.add(new Employee(1, "Raj","sales",60000));
            employees2.add(new Employee(1, "Pras","HR",100000));
            employees2.add(new Employee(4, "bhanu","lnd",80000));
            employees2.add(new Employee(2, "lali","BU",200000));
            employees2.add(new Employee(7, "rajla","IT",150000));
            System.out.println("Employee list sorted by Dept");
            System.out.println("-------------------------------------------");
            for(Employee e: employees2)
    		{
    			System.out.print(e.getEmpId()+" "+e.getEmpName()+" "+e.getDept()+" "+e.getSalary());
    			System.out.println();
    		}
        	
        	break;
        case "d":
        	TreeSet<Employee>employees3 = new TreeSet<Employee>(new SalaryComparator());
            employees3.add(new Employee(1, "Raj","sales",60000));
            employees3.add(new Employee(1, "Pras","HR",100000));
            employees3.add(new Employee(4, "bhanu","lnd",80000));
            employees3.add(new Employee(2, "lali","BU",200000));
            employees3.add(new Employee(7, "rajla","IT",150000));
            System.out.println("Employee list sorted by Salary");
            System.out.println("-------------------------------------------");
            for(Employee e: employees3)
    		{
    			System.out.print(e.getEmpId()+" "+e.getEmpName()+" "+e.getDept()+" "+e.getSalary());
    			System.out.println();
    		}
        	
        	
        	break;
        default:
        	System.out.println("select only valid options");
        
        }
		
    }

}
class IdComparator implements Comparator<Employee>
{

	public int compare(Employee e1, Employee e2)
	{
		return e1.getEmpId()-e2.getEmpId();
	}
}

class NameComparator implements Comparator<Employee>
{
	public int compare( Employee e1, Employee e2)
	{
		return e1.getEmpName().compareTo(e2.getEmpName());
	}
}
class SalaryComparator implements Comparator<Employee>
{

	public int compare(Employee e1, Employee e2)
	{
		return (int) (e1.getSalary()-e2.getSalary());
	}
}
class DeptComparator implements Comparator<Employee>
{
	public int compare( Employee e1, Employee e2)
	{
		return e1.getDept().compareTo(e2.getDept());
	}
}
