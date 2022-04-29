package com.springdemos.springcore1.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore1/set/config.xml");
		
		CarDealer cd=(CarDealer)context.getBean("cardealer");
		
		System.out.println(cd);
		
		System.out.println(cd.getModels().getClass());
	}
}
