package com.app.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainConstructor {

		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("com/app/constructor/bean.xml");
			System.out.println("in main");
			Student stud = context.getBean("student",Student.class);
			
			System.out.println(stud);
		}

	

}
