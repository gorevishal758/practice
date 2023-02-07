package operation;

import java.util.Scanner;

import exception.ResultException;
import model.Student;

public class MainMathod {

	public static void main(String[] args) {
		TestCustomException exc=new TestCustomException();
		Student s1=new Student();
		
		
		Scanner sc=new Scanner(System.in);
		s1.setRollno(28);
		System.out.println("Roll number :"+s1.getRollno());
		
		s1.setSname("Vishal");
		System.out.println("Name :"+s1.getSname());
		
		s1.setSaddress("Wardha");
		System.out.println("Address :"+s1.getSaddress());
		
		s1.setM1(55);
		System.out.println("Hindi :"+s1.getM1());
		
		s1.setM2(50);
		System.out.println("English :"+s1.getM2());
		
		s1.setM3(80);
		System.out.println("Marathi:"+s1.getM3());
		
		
		try { 
			  if(s1.getM1()>=40 && s1.getM2()>=40 && s1.getM3() >=40) {
				  exc.validate(s1.getM1());
				  
			  }
			  else {
				  if(s1.getM1()<40) {
			TestCustomException.validate(s1.getM1());
			}
				  
				  if(s1.getM2()<40) {
					  exc.validate(s1.getM2());
						}
				  if(s1.getM3()<40) {
					  exc.validate(s1.getM3());
						}
			  }
			  
			  } catch (ResultException ex) 
		{ 
			  System.out.println("Exception occured: " + ex); }
			 
		  
		          
		    }
		
		
		
		
 
	
	}
	
	


