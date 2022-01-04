package com.app.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("newAddress") //bean of Address class is created with name newAddress
public class Address {
	@Value("Laxmi Road")
	private String street;
	
	@Value("Pune")
	private String city;
		
public Address() {
	System.out.println("in Address no args ctor");
}	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String street, String city) {
//		super();
//		System.out.println("in Address ctor");
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
	
}
