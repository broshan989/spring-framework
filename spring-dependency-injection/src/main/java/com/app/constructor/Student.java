package com.app.constructor;

public class Student {
	private String name;
	private String marks;
	private Address address;
	
	
	//for address calls to its setter in class Student
	public Student(String name, String marks) {
		super();
		System.out.println("in student ctor 2 args");
		this.name = name;
		this.marks = marks;	
	}
	//constructor for constructor based DI
	public Student(String name, String marks, Address address) {
		super();
		System.out.println("in student ctor 3 args");
		this.name = name;
		this.marks = marks;
		this.address = address;
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
