package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	AbstractApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/lifecycle/configlifecycle.xml");
	con.registerShutdownHook(); 
	/*
	 * Samosa s=(Samosa) con.getBean("s1"); System.out.println(s);
	 * // when we use this our destroy method call
	 * 
	 * 
	 * System.out.println("***********************88");
	 * 
	 * Pepsi p1=(Pepsi) con.getBean("p1"); System.out.println(p1);
	 */
	 Example e1=(Example) con.getBean("E1");
	 System.out.println(e1);
	}

}
