package com.springdemos.springcore1.lifecycle.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore1/lifecycle/annotations/config.xml");
		
		context.registerShutdownHook();
		
		Patient patient=(Patient)context.getBean("patient");
		
		System.out.println(patient);
	}
}
