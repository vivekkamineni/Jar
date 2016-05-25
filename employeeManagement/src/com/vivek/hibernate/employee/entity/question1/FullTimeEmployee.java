package com.vivek.hibernate.employee.entity.question1;

import javax.persistence.Entity;

/*This POJO Class is inherited from Employee class and implements Iemployee interface
This class has its own attributes in addition to  parent class'
*/

@Entity
public class FullTimeEmployee extends Employee implements Iemployee {
	private int employeeSalary;
	private int  employeeHoursWorked;
	private int bonus;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary() {
		this.employeeSalary = 90000;
	}
	public int getEmployeeHoursWorked() {
		return employeeHoursWorked;
	}
	public void setEmployeeHoursWorked() {
		this.employeeHoursWorked = 40;
	}
	



}
