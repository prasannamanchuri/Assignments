package com.capgemeni.assignment8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
 
public class OddLengthsRemoveif {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(
                Arrays.asList("abc", "ab", "cde", "defg", "abcd", "eee"));      
         
        Predicate<String> filter = str -> (str.length()==3);
         
        System.out.println("Original ArrayList          : " + arrayList);
        boolean value = arrayList.removeIf(filter);
        System.out.println("Returned value : " + value);
        System.out.println("ArrayList after removeIf()  : " + arrayList);
    }
}