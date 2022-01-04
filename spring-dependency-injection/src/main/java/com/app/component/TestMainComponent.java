package com.app.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainComponent {

		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("com/app/component/bean.xml");
			System.out.println("in main");
			Student stud = context.getBean("student",Student.class);
			
			System.out.println(stud);
		}

	

}
