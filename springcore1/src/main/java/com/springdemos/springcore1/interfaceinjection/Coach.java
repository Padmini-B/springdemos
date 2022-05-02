package com.springdemos.springcore1.interfaceinjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Coach {
	@Value("1003")
	private int id;
	
	@Value("William")
	private String name;

	@Autowired
	@Qualifier("cricket")
	private Sport sport1;
	
	@Autowired
	@Qualifier("basketBall")
	private Sport sport2;

	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", sport1=" + sport1.play() + ", sport2=" + sport2.play() + "]";
	}
}
