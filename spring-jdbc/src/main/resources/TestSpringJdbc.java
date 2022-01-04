package edu.aspire.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.app.model.Student;

import edu.aspire.config.SpringJdbcConfig;
import edu.aspire.daos.EmployeeDao;
import edu.aspire.model.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={SpringJdbcConfig.class})
public class TestSpringJdbc {
	@Autowired
	ApplicationContext context;
	@Test
	public void testSpringJdbc() {
		
	
		StudentDaoImpl studentDao = context.getBean("studentDaoImpl",StudentDaoImpl.class);
		Student student = new Student();
		student.setRollNo(1);
		student.setName("Roshan");
		student.setMarks("98");
		student.setCity("Pune");
		studentDao.save(student);
		System.out.println("Record inserted successfully...");
	}
}
