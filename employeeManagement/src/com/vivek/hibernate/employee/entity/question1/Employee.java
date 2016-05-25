package com.vivek.hibernate.employee.entity.question1;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


//Employee POJO Class

@Entity

@Inheritance(strategy=InheritanceType.JOINED)


public class Employee {
	
	@Id @GeneratedValue
	private int employeeId;
	private String employeeName;
	private String employeeSkill;
	private int employeeAage;
	private Date employeehireDate;
	
	//@Column(name="Hours_Worked")
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeSkill() {
		return employeeSkill;
	}
	public void setEmployeeSkill(String employeeSkill) {
		this.employeeSkill = employeeSkill;
	}
	public int getEmployeeAage() {
		return employeeAage;
	}
	public void setEmployeeAage(int employeeAage) {
		this.employeeAage = employeeAage;
	}
	public Date getEmployeehireDate() {
		return employeehireDate;
	}
	public void setEmployeehireDate(Date employeehireDate) {
		this.employeehireDate = employeehireDate;
	}

	
	
}
