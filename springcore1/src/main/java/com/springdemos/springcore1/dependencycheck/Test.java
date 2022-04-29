package com.springdemos.springcore1.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore1/dependencycheck/config.xml");
		
		Prescription pres=(Prescription)context.getBean("prescription");
		
		System.out.println(pres);
	}
}
