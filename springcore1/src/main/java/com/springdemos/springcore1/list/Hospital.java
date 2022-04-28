package com.springdemos.springcore1.list;

import java.util.List;

public class Hospital {
	String name;
	List<String> departments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", departments=" + departments + "]";
	}
}
