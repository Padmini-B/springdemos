package com.springdemos.springcore1.beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore1/beanscopes/config.xml");
		
		Address address=(Address)context.getBean("address");
		
		System.out.println("1st object hashcode = "+address);
		
		Address address2=(Address)context.getBean("address");
		
		System.out.println("2nd object hashcode = "+address2.hashCode());
	
		Address address3=(Address)context.getBean("address");
		
		System.out.println("3rd object hashcode = "+address3.hashCode());

	}
}
