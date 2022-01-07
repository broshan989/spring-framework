package com.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.model.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();
		student.setRollNo(rs.getInt("rollno"));
		student.setName(rs.getString("name"));
		student.setMarks(rs.getString("marks"));
		student.setCity(rs.getString("city"));
		return student;
	}

}
