package com.springdemos.springcore1.interfaceinjection;

import org.springframework.stereotype.Component;

@Component
public class BasketBall implements Sport {
	@Override
	public String play()
	{
		return "Playing Basketball";
	}
}
