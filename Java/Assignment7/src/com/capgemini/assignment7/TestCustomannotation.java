package com.capgemini.assignment7;

//Creating annotation  
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test {
	int value();
}

//Applying annotation  
class Hello {
	@Test(value = 10)
	public void sayHello() {
		System.out.println("hello annotation");
	}
}

//Accessing annotation  
class TestCustomannotation {
	public static void main(String args[]) throws Exception {

		Hello h = new Hello();
		Method m = h.getClass().getMethod("sayHello");

		Test a = m.getAnnotation(Test.class);
		System.out.println("value is: " + a.value());
	}
}