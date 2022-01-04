package com.app.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainAnnotation {

		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("com/app/annotation/bean.xml");
			System.out.println("in main");
			Student stud = context.getBean("student",Student.class);
			
			System.out.println(stud);
		}

}
