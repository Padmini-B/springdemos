package com.springdemos.springcore1.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore1/propertyplaceholder/config.xml");
		
		MyDAO mydao=(MyDAO)context.getBean("mydao");
		
		System.out.println(mydao);
		
	}
}
