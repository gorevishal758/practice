package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started........" );
        // spring jdbc =>jdbcTemplete
       //ApplicationContext con= new ClassPathXmlApplicationContext("com/spring/jdbc/confi.xml");
        ApplicationContext con= new AnnotationConfigApplicationContext(JdbcConfig.class);
		/*// normal way 
		 * JdbcTemplate template =con.getBean("jdbcTemplate",JdbcTemplate.class);
		 * 
		 * //insert query String
		 * query="insert into student(id,name,city) values (?,?,?)"; //fire query int
		 * res = template.update(query,32,"vishal","wardha");
		 * System.out.println("number of record inserted.."+res);
		 */
       StudentDao studentDao = con.getBean("studentDao",StudentDao.class);
		/*
		 * //insert 
		 * Student stu=new Student(); stu.setId(55);stu.setName("Bhushan");
		 * stu.setCity("pune");
		 * 
		 * int insert = studentDao.insert(stu);
		 * 
		 * System.out.println("Student Added succesfullly"+insert);
		 */
		 
       
       
		/*// update
		 * Student s= new Student(); s.setId(32); s.setName("jethalal");
		 * s.setCity("Mumbai"); int change = studentDao.change(s);
		 * System.out.println("Data Change Successfully"+change);
		 */
       
      
		/*
		 * //delete int delete = studentDao.delete(32);
		 * System.out.println("Data delete successfully "+delete);
		 */
		/*
		 * Student student = studentDao.getStudent(55);
		 * System.out.println("select successfully"+student);
		 */
       
       List <Student> s=studentDao.getAllStudent();
       for(Student s1:s)
       {
    	   System.out.println("printing..."+s1);
       }
    }
}
