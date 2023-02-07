package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCi {

	public static void main(String[] args) {
		
	ApplicationContext con=	new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
			Person p=(Person)con.getBean("person");
			System.out.println(p);
			
			Addition add=(Addition) con.getBean("add");
			add.doSum();
	}

}
