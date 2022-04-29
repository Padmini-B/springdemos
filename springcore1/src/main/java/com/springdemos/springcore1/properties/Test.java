package com.springdemos.springcore1.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore1/properties/config.xml");
		
		Locations ls=(Locations)context.getBean("locations");
		
		System.out.println(ls);
		
		System.out.println(ls.getDialect().getClass());
	}
}
