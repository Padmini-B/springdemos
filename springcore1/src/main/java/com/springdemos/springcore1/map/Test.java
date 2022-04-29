package com.springdemos.springcore1.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore1/map/config.xml");
		
		Customer cd=(Customer)context.getBean("customer");
		
		System.out.println(cd);
		
		System.out.println(cd.getProducts().getClass());
	}
}
