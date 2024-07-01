package com.codegnan.hibernateapps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientApp {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		try {
			sessionFactory = configuration.buildSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Employee employee = new Employee();
			employee.setEid(1);
			employee.setName("bunny");
			employee.setEsal(100000);
			session.save(employee);

			System.out.println("Data inserted successfully");

			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
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
