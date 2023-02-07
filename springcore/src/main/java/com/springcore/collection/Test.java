package com.springcore.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext con	=new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");

	Emp emp1=(Emp)con.getBean("emp1");
	System.out.println(emp1.getName());
	System.out.println(emp1.getPhones());
	System.out.println(emp1.getAddresses());
	System.out.println(emp1.getCourses());
	
	}

}
