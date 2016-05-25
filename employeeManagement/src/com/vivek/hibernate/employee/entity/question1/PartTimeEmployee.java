package com.vivek.hibernate.employee.entity.question1;

import javax.persistence.Entity;


/*This POJO Class is inherited from Employee class and implements Iemployee interface
This class has its own attributes in addition to  parent class'
*/

@Entity
public class PartTimeEmployee extends Employee implements Iemployee {
	
	private int employeeSalary;
	private int  employeeHoursWorked;
	private int numberOfDaysAvailable;

public int getNumberOfDaysAvailable() {
	return numberOfDaysAvailable;
}

public void setNumberOfDaysAvailable(int numberOfDaysAvailable) {
	this.numberOfDaysAvailable = numberOfDaysAvailable;
}
public int getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary() {
	this.employeeSalary = 20;
}
public int getEmployeeHoursWorked() {
	return employeeHoursWorked;
}
public void setEmployeeHoursWorked() {
	this.employeeHoursWorked = 15;
}

}

