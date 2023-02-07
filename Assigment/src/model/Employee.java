package model;

/*WAP to take Employee daily attendance in an array of int with name presentdays. You also take
salary per month of the Employee. You need to calculate the total day an employee is present.
Employee will input in following format P for present, L for leave it will be paid leave, A for absent,
N for no information about this day.
An employee can not take more than 2 leaves in a month if he takes more than two leave you need
to throw the exception. LeaveExceedLimitException.
If for any employee N is continuously for four days you need to throw exception
EmployeeAbscondingException. In this case salary will not be calculated.
If all goes good you need to print the total salary of employee for that particular month.*/
public class Employee {
	
private	int[] presentdays;
private String present,absent,leave;
private	int salary,totalSalary;
private String empName;
public int[] getPresentdays() {
	return presentdays;
}
public void setPresentdays(int[] presentdays) {
	this.presentdays = presentdays;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getTotalSalary() {
	return totalSalary;
}
public void setTotalSalary(int totalSalary) {
	this.totalSalary = totalSalary;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getPresent() {
	return present;
}
public void setPresent(String present) {
	this.present = present;
}
public String getAbsent() {
	return absent;
}
public void setAbsent(String absent) {
	this.absent = absent;
}
public String getLeave() {
	return leave;
}
public void setLeave(String leave) {
	this.leave = leave;
}


	
}
