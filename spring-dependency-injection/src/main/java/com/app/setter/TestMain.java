package com.app.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/app/setter/bean.xml");
		System.out.println("in main");
		Student stud = context.getBean("student",Student.class);
		
		System.out.println(stud);
	}

}
