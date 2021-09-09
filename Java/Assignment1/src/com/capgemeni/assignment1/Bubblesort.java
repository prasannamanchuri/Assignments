package com.capgemeni.assignment1;
public class Bubblesort {  
    public static void main(String[] args) {  
    int[] a = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};  
    for(int i=0;i<10;i++)  
    {  
        for (int j=0;j<10;j++)  
        {  
            if(a[i]<a[j])  
            {  
                int temp = a[i];  
                a[i]=a[j];  
                a[j] = temp;   
            }  
        }  
    }  
    System.out.println("Printing Sorted List ...");  
    for(int i=0;i<10;i++)  
    {  
        System.out.println(a[i]);  
    }  
}  
}  