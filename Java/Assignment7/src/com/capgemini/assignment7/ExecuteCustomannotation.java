package com.capgemini.assignment7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute {
	int sequence();
}

public class ExecuteCustomannotation {
	@Execute(sequence = 3)
	public void method1() {
		System.out.println("hello annotation3");
	}

	@Execute(sequence = 1)
	public void method2() {
		System.out.println("hello annotation3");
	}

	@Execute(sequence = 2)
	public void method3() {
		System.out.println("hello annotation3");
	}

	public static void main(String args[]) throws Exception {
		ExecuteCustomannotation h = new ExecuteCustomannotation();
		Method m1 = h.getClass().getMethod("method1");
		Method m2 = h.getClass().getMethod("method2");
		Method m3 = h.getClass().getMethod("method3");
		Execute e1 = m2.getAnnotation(Execute.class);
		System.out.println("sequence is: " + e1.sequence());
		Execute e2 = m3.getAnnotation(Execute.class);
		System.out.println("sequence is: " + e2.sequence());
		Execute e = m1.getAnnotation(Execute.class);
		System.out.println("sequence is: " + e.sequence());
	}
}
