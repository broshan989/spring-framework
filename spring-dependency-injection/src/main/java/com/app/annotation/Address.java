package com.app.annotation;

public class Address {
	private String street;
	private String city;
	
	public Address() {
		System.out.println("in Address no args ctor");
	}
	public Address(String street, String city) {
		super();
		System.out.println("in Address ctor");
		this.street = street;
		this.city = city;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("in Address setStreet()");
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
	
}
