package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.app.model.Student;
@Repository("studentDao")
public class StudentDaoImpl implements IStudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
		
	public void save(Student student) {
		String query="INSERT INTO STUDENTS(ROLLNO, NAME, MARKS, CITY) VALUES(?,?,?,?)"; 
		Object[] data = {student.getRollNo(),student.getName(),student.getMarks(),student.getCity()};
		jdbcTemplate.update(query, data);
	}

	public void update(Student student) {
		String query="UPDATE STUDENTS SET NAME=?, CITY=?, MARKS=? WHERE ROLLNO=?";
		Object[] data= {student.getName(),student.getCity(),student.getMarks(),student.getRollNo()};
		jdbcTemplate.update(query,data);

	}

	public void delete(int rollNo) {
		String query="delete from students where rollno=?";
		jdbcTemplate.update(query, rollNo);

	}

	public Student get(int rollNo) {
		String query="select * from students where rollno=?";
		RowMapper<Student> rowMapper=new StudentRowMapper();
		Student student = jdbcTemplate.queryForObject(query, rowMapper, rollNo);
		return student;
	}

	@Override
	public List<Student> getAll() {
		String query="select * from students";
		List<Student> studentList=jdbcTemplate.query(query, new StudentRowMapper());;
		return studentList;
	}

}
