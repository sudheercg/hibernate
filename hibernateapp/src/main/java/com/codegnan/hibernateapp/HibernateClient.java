package com.codegnan.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateClient {

	public static void main(String[] args) {

		// Step1: Create a configuration object
		Configuration configuration = new Configuration();
		configuration.configure();
		Transaction transaction= null;
		SessionFactory sessionFactory = null;
		 
		try {
		// Step2: Create a SessionFactory Object
		sessionFactory = configuration.buildSessionFactory();

		// Step3: create a session object
		Session session = sessionFactory.openSession();

		// Step4: Create a Transaction object
		transaction = session.beginTransaction();

		Employee employee = new Employee();
		employee.setEid(1);
		employee.setEname("Chakravarthy");
		employee.setEsal(50000);
		employee.setEaddr("Yousufguda, Hyderabad");
		
		session.save(employee);	
		transaction.commit();
		System.out.println("successfully inserted a row");
		}catch(Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
				
		}

	}

}
