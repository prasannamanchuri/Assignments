package com.capgemeni.assignment10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Textfile {
	

    public static void main(String[] args) {
    	int count=0;
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\PMANCHUR\\prasanna\\Java11Assignments_StudentList.txt"));


            while(scanner.hasNext())
            {
                String line = scanner.next();

                String lineAfterTrim = line.trim();
             
                System.out.println(lineAfterTrim);
   
                count=count+1;
            }
            System.out.println("No of students are:"+count);


        } 

        catch (FileNotFoundException e) {

            e.printStackTrace();
        }

    }

}