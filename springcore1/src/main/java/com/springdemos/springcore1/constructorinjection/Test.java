package com.springdemos.springcore1.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore1/constructorinjection/config.xml");
		
		Address address=(Address)context.getBean("address");
		
		System.out.println("1st object hashcode = "+address);
		
	}
}
