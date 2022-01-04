package com.app.javaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTestMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Student student = context.getBean("getStudentBean", Student.class); // it will identify bean with method name if @Bean has no argument of name
		Student student = context.getBean("student", Student.class); //it will identify the bean using name 'student' requirement: @Bean("student") 
		System.out.println(student);
	}

}
