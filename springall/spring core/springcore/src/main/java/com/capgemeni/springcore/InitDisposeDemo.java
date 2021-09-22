package com.capgemeni.springcore;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDisposeDemo {
	public static void main( String[] args )
    {
      ConfigurableApplicationContext context = 
      new ClassPathXmlApplicationContext("init.xml");
      InitDisposeService cust = (InitDisposeService)context.getBean("InitDisposeService");
      System.out.println(cust);
      context.close();
    }
}
