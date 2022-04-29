package com.springdemos.springcore1.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	@PostConstruct
	public void hi() {
		System.out.println("Inside hi method......");
	}

	@PreDestroy
	public void bye() {
		System.out.println("Inside Destroy method......");
	}

}
