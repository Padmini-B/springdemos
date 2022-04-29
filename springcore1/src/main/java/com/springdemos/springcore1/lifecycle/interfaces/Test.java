package com.springdemos.springcore1.lifecycle.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore1/lifecycle/interfaces/config.xml");
		
		context.registerShutdownHook();
		
		Patient patient=(Patient)context.getBean("patient");
		
		System.out.println(patient);
	}
}
