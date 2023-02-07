package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {
	ApplicationContext c=	new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
	A temp=(A) c.getBean("aref");
	System.out.println(temp.getX());
	
	System.out.println(temp.getOb().getY());
	
	System.out.println(temp);
	}

}
