package com.springdemos.springcore1.constructorinjection;

public class Address {
	private int housenumber;
	private String street;
	private String city;

	public Address(int housenumber, String street, String city) {
		super();
		this.housenumber = housenumber;
		this.street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [housenumber=" + housenumber + ", street=" + street + ", city=" + city + "]";
	}

}
