package com.app.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.dao.StudentDaoImpl;
import com.app.model.Student;

public class StudentJdbcXmlConfigTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/app/test/config.xml");
		StudentDaoImpl studentDao = context.getBean("studentDao", StudentDaoImpl.class);
		
		//Insert Student
		Student student = new Student();
		student.setRollNo(1);
		student.setName("Sachin");
		student.setMarks("78");
		student.setCity("Mumbai");
		studentDao.save(student);
		System.out.println("Inserted: "+student);
		
		// Update student: name, marks and city
//		Student student = new Student();
//		student.setRollNo(1);
//		student.setName("Roshan");
//		student.setMarks("88");
//		student.setCity("Pune");
//		studentDao.update(student);
//		System.out.println("student updated");

		// Delete student
//		studentDao.delete(1);
//		System.out.println("student deleted");

		// Get Student by roll no
//		Student student = studentDao.get(1);
//		System.out.println(student);
		
		//get all student
		List<Student> students=studentDao.getAll();
		for(Student s : students) {
			System.out.println(s);
		}
	}

}
