package com.app.javaBasedConfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public Address getAddress() {
		Address address = new Address("baker street","London");
		return address;	
	}

	@Bean(name = "student",autowire = Autowire.NO)
	public Student getStudentBean() {
		Student student = new Student("Sachin","87");
		return student;
	}
}
//@Autowire annotated dependency spring provides setter getter internally,
//if we provides setter then our setter will be consider
//autowire no will not call setAddress() it will directly inject object in student bean
//byType calls setAddress() if setter is available
//byName wont call setAddress() because it wires based on name of bean presents in config file