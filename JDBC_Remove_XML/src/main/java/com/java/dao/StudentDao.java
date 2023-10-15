package com.java.dao;

import java.util.List;

import com.java.entites.Student;

public interface StudentDao 
{
	int insert(Student student);

	public int change(Student student);
	
	public int delete(int studentId);
	
	public Student getStudent(int studentId);
	
	public List<Student> getAllStudent();
}
