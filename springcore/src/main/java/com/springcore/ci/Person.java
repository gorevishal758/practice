package com.springcore.ci;

public class Person {
	private String name;
	private  int id;
	private Certi certi;
	public Person() {
		super();
		
	}
	
	public Person(String name, int id ,Certi certi) {
		super();
		this.name = name;
		this.id = id;
		this.certi=certi;
	}
	
	@Override
	public String toString() {
		return this.name+" : "+this.id+" "+"{"+this.certi.name+"}";
	}

}
