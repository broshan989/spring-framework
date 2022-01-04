package com.app.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // bean of the Student class is created with name student as no name of the bean is mentioned with component
public class Student {
	@Value("Roshan")
	private String name;
	@Value("87")
	private String marks;
	
	@Autowired
	private Address address;
	
	public Student() {
		System.out.println("in student no args ctor");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("in set address");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	
	
}
