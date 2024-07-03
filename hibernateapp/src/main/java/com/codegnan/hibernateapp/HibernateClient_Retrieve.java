package com.codegnan.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateClient_Retrieve {

	public static void main(String[] args) {

		// Step1: Create a configuration object
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory = null;
		Session session = null;
		 
		try {
		// Step2: Create a SessionFactory Object
		sessionFactory = configuration.buildSessionFactory();

		// Step3: create a session object
		 session = sessionFactory.openSession();
		 
		 
		 Employee employee= session.get(Employee.class,1);
		 
		 if(employee!=null) {
			 System.out.println();
			 
			 System.out.println("Employee Details");
             System.out.println("---------------------");
             System.out.println("Employee Number: " + employee.getEid());
             System.out.println("Employee Name: " + employee.getEname());
             System.out.println("Employee Salary: " + employee.getEsal());
             System.out.println("Employee Address: " + employee.getEaddr());
			 
		 }

	
		System.out.println("Successfully Updated a row");
		}catch(Exception e) {
			if(session !=null) {
			 session.close();	
			}
			if(sessionFactory!=null) {
				sessionFactory.close();
			}
				
		}

	}

}
