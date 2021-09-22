package com.capgemeni.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainlifecycle {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      Lifecycle  obj = (Lifecycle ) context.getBean("Lifecycle");
      obj.getMessage();
      context.registerShutdownHook();
   }
}