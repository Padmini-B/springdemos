package com.springdemos.springcore1.cart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/springdemos/springcore1/cart/config.xml");
		
		Cart cart=(Cart)context.getBean("cart");
		
		System.out.println(cart);
		
	}
}
