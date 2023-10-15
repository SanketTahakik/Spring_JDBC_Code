package com.java;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.java.dao.StudentDao;
import com.java.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("My program started......");
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/java/config.xml");
//    	JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//    	
//    	// insert
//    	String query = "insert into student(id, name, city) values(?, ?, ?)";
//    	
//    	// fire
//    	int result = template.update(query, 444, "Najan Mahadev", "Nagar");
//    	
//    	System.out.println("number of record inserted.." + result);
//    	
//    	video 32  INSERT
    	
    	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
    	
//    	Student student = new Student();
//    	student.setId(333);
//    	student.setName("Najan Mahadev");
//    	student.setCity("Nagar");
//    	
//    	int result = studentDao.insert(student);
    	
//    	System.out.println("Student added.."+ result);
    	
    	// video 33 UPDATE
    	
//    	Student student = new Student();
//    	student.setId(333);
//    	student.setName("Shubham");
//    	student.setCity("Kokan");
//    	int result = studentDao.change(student);
//    	
//    	System.out.println("data changed" + result);
    	
    	// video 35 DELETE
    	
//    	int result = studentDao.delete(333);
//    	System.out.println("deleted " + result);
//    	
//    	Student student = studentDao.getStudent(222);
//    	System.out.println(student);
    	
    	
    	// video 38 select * from student;
    	List<Student> students = studentDao.getAllStudent();
    	for(Student s : students)
    	{
    		System.out.println(s);
    	}
    }
}
