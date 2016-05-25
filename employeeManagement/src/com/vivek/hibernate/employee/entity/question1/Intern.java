package com.vivek.hibernate.employee.entity.question1;

import java.sql.Date;

import javax.persistence.Entity;


/*This POJO Class is inherited from Employee class and implements Iemployee interface
This class has its own attributes in addition to  parent class'
*/

@Entity
public class Intern {

	private Date contractEndDate;
	private int employeeSalary;
	private int  employeeHoursWorked;

	public Date getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}
	
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary() {
		this.employeeSalary = 25;
	}
	public int getEmployeeHoursWorked() {
		return employeeHoursWorked;
	}
	public void setEmployeeHoursWorked() {
		this.employeeHoursWorked = 20;
	}
	
}
