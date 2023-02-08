package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
//If we dont want to use xml configuration then use this method
@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"}) // for @Component
public class JdbcConfig {
@Bean(name={"ds"})
public DataSource getDataSource()
{
	DriverManagerDataSource ds=new DriverManagerDataSource();
	ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:3306/newspringjdbc");
	ds.setUsername("root");
	ds.setPassword("Vishal@1996");
	return ds;
	
}
@Bean(name={"jdbcTemplate"})
public JdbcTemplate getTemplate()
{
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	jdbcTemplate.setDataSource(getDataSource());
	return jdbcTemplate;
}
// we replace this code by using autowiring @Component  annotation at StudentDaoImpl class
/*
 * @Bean(name={"studentDao"}) public StudentDao getStudentDao() { StudentDaoImpl
 * studentDao=new StudentDaoImpl(); studentDao.setJdbcTemplate(getTemplate());
 * return studentDao; }
 */
	
}
