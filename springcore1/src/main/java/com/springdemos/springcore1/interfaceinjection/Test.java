package com.springdemos.springcore1.interfaceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore1/interfaceinjection/config.xml");

		Coach ch = (Coach) context.getBean("coach");

		System.out.println(ch);
	}
}
