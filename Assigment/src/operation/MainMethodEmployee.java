package operation;

import java.util.Scanner;

import model.Employee;

public class MainMethodEmployee {

	public static void main(String[] args) {
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name ");
		e.setEmpName("test");
		System.out.println("Name :"+e.getEmpName());
		System.out.println("Enter Employee Attendence");
		
		System.out.println("att :"+e.getPresentdays());
		

	}

}
