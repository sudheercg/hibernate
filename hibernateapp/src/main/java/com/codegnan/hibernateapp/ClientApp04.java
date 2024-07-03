package com.codegnan.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class ClientApp04 {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
		//	transaction = session.beginTransaction();

			Employee emp=session.get(Employee.class,1);
			if(emp==null) {
			System.out.println("Record not found");
			} else {
                System.out.println("Employee Details");
                System.out.println("---------------------");
                System.out.println("Employee Number: " + emp.getEid());
                System.out.println("Employee Name: " + emp.getEname());
                System.out.println("Employee Salary: " + emp.getEsal());
                System.out.println("Employee Address: " + emp.getEaddr());
            }

		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (session != null) {
				session.close();
			}
			if (sessionFactory != null) {
				sessionFactory.close();
			}
		}
	}

}
