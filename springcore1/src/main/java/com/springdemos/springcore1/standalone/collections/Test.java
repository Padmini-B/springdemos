package com.springdemos.springcore1.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore1/standalone/collections/config.xml");
		
		ProductsList pl=(ProductsList)context.getBean("products");
		
		System.out.println(pl);
		
		System.out.println(pl.getProductNames().getClass());
	}
}
