package com.vivek.hibernate.employeeModifications.question2;



import java.util.Date;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vivek.hibernate.employee.entity.question1.Employee;

/*Employee details can be changed in this class.
A new employee can be saved to the DB.
An existing employee details can be updated or retrieved*/


public class EmployeeModifications {
	private SessionFactory sessionFactory;
	private Session session ;
	
	//adding a new employee
	public void addNewEmployee(){
		try{
		Employee e = new Employee();
		e.setEmployeeName("Vivek");
		e.setEmployeeAage(25);
		e.setEmployeeSkill("Java");
		
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
		}
		
		finally{
			session.close();
		}
		
	}
	
	
	//Retrieving employee details by using Hibernate's HQL Queries
	public void getExistingEmployee(){
		try{
		session.beginTransaction();
		Query query  = session.createQuery("from Employee where employeeID < 10 ");
		List employees = query.list();
		session.getTransaction().commit();
		}
		finally{
			session.close();
		}
	}
		
	
	//Updating Employee details using hibernate HQL queries
	public void editEmployee(){
		try{
		session.beginTransaction();
		Query query  = session.createQuery("UPDATE Employee set age = :age  WHERE employeeId = :employeeId");
		query.setParameter("age", 23);
		query.setParameter("employeeID", 11);
		query.executeUpdate();
		}
		finally{
			session.close();
		}
	}
		
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	SessionFactory	sessionFactory = new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();	
	EmployeeModifications em = new EmployeeModifications();
	em.addNewEmployee();
	em.getExistingEmployee();
	em.editEmployee();
	
	


	}

}
