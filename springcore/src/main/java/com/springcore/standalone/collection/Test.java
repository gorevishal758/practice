package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	 ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneconfig.xml");
	 
	 Person p =con.getBean("person1",Person.class);
	System.out.println(p);
	System.out.println(p.getFriends().getClass().getName());
	System.out.println("**********************************");
	System.out.println(p.getFess());
	System.out.println(p.getFess().getClass().getName());
	System.out.println("##########################");
	System.out.println(p.getProp());
	System.out.println(p.getProp().getClass().getName());
	
}
}
