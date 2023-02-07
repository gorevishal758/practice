package com.springcore.lifecycle;
// we can call init and dstroy method using bean life cycle i.e by using method , using interface , using annotation


// Here we use interface
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {

	private double price;

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		//here we can write init code
		System.out.println("Taking Pepsi :init");
		
	}

	@Override
	public void destroy() throws Exception {  // using interface
		// destroy
		System.out.println("CALL distroy method");
		
	}
	
	
}
