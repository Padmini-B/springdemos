package com.springdemos.springcore1.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore1/autowiring/config.xml");
		
		Employee employee=(Employee)context.getBean("emp");
		
		System.out.println(employee);

	}
}
