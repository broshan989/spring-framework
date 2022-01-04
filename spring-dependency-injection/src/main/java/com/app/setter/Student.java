package com.app.setter;

public class Student {
	private String name;
	private String marks;
	private Address address;
	
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
		System.out.println("in setter of address of student");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	
	
}
