package com.capgemeni.assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@FunctionalInterface
interface Consumer<T> {
    void accept(T t);
    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
}

@FunctionalInterface
interface Supplier<T> {
    /**
     * Gets a result.
     * @return a result
     */
    T get();
}

@FunctionalInterface
interface Predicate<T> {
  boolean test(T t);
}

public class ConsumerTest {
	 
    public static void main(String[] args) {
    	System.out.println("consumer---------------");
    	Consumer<String> consumer = ConsumerTest::consumerPrintNames;
        consumer.accept("C++");
        consumer.accept("Java");
        consumer.accept("Python");
        consumer.accept("Ruby On Rails");
        System.out.println("Supplier-----------");
        List<String> names = new ArrayList<String>();
        names.add("Harry");
        names.add("Daniel");
        names.add("Lucifer");       
        names.add("April O' Neil");
 
        names.stream().forEach((item)-> {
        	supplierPrintNames(()-> item);
        });
        System.out.println("Predicate-------------");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println(collect);
    }
 
    private static void consumerPrintNames(String name) {       
        System.out.println(name);
    }
    
    private static void supplierPrintNames(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }
}
