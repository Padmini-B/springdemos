package com.springdemos.springcore1.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore1/stereotype/annotations/config.xml");

		Coach ch = (Coach) context.getBean("supercoach");

		System.out.println(ch);
		System.out.println(ch.hashCode());

		Coach ch1 = (Coach) context.getBean("supercoach");
		System.out.println(ch1.hashCode());
	}
}
