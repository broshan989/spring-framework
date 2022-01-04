package com.app.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.Config;
import com.app.dao.StudentDaoImpl;
import com.app.model.Student;

/*
 * @Author Roshan Bhoge
 * CREATE TABLE STUDENTS(ROLLNO INT PRIMARY KEY, NAME VARCHAR(20), MARKS VARCHAR(20),CITY VARCHAR(20));
 */

public class StudentJdbcTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		StudentDaoImpl studentDao = (StudentDaoImpl)context.getBean("studentDao");
		
		// Insert Student
		Student student = new Student();
		student.setRollNo(1);
		student.setName("Roshan");
		student.setMarks("98");
		student.setCity("Pune");
		studentDao.save(student);
		System.out.println("Record inserted successfully...");

		// Update student: name, marks and city
//		Student student = new Student();
//		student.setRollNo(1);
//		student.setName("Virat");
//		student.setMarks("88");
//		student.setCity("Mumbai");
//		studentDao.update(student);
//		System.out.println("student updated");

		// Delete student
//		studentDao.delete(1);
//		System.out.println("student deleted");

		// Get Student by roll no
//		Student student = studentDao.get(1);
//		System.out.println(student);

		// Get all students
		List<Student> students = studentDao.getAll();
		for (Student s : students) {
			System.out.println(s);
		}
	}

}
