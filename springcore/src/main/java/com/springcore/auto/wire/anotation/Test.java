package com.springcore.auto.wire.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
	ApplicationContext con=	new ClassPathXmlApplicationContext("com/springcore/auto/wire/anotation/autoconfig.xml");

		Employee e1=con.getBean("emp1",Employee.class); 	// if we use this no need to typecast
	
		System.out.println(e1);
	}

}
