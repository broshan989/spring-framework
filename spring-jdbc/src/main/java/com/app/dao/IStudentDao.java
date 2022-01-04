package com.app.dao;



import java.util.List;

import com.app.model.Student;

public interface IStudentDao {
	public void save(Student student);

	public void update(Student student);

	public void delete(int rollNo);

	public Student get(int rollNo);
	
	public List<Student> getAll();
}
