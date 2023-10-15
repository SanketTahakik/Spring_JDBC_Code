package com.java;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.java.dao.StudentDao;
import com.java.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.java.dao"})
public class jdbcConfig 
{
	@Bean(name = {"ds"})
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("1523");
		
		return ds;
	}
	
	@Bean(name = {"jdbcTemplate"})
	public JdbcTemplate geTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
	}
//	
//	@Bean(name = {"studentDao"})
//	public StudentDao getStudentDao()
//	{
//		StudentDaoImpl studentDao = new StudentDaoImpl();
//		studentDao.setJdbcTemplate(geTemplate());
//		
//		return studentDao;
//	}
}
