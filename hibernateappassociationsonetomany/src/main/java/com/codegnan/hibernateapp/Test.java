package com.codegnan.hibernateapp;


		import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
		
		public class Test {
		
			public static void main(String[] args) {
				StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings from
																									// hibernate.cfg.xml
						.build();
		
				SessionFactory sessionFactory = null;
				Session session = null;
				Transaction transaction = null;
		
				try {
					sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		
					session = sessionFactory.openSession();
		
					transaction = session.beginTransaction();
		
					Employee e1 = new Employee(111, "AAA", 5000, "Hyd");
					Employee e2 = new Employee(222, "BBB", 6000, "Hyd");
					Employee e3 = new Employee(333, "CCC", 7000, "Hyd");
					Employee e4 = new Employee(444, "DDD", 8000, "Hyd");
		
					Set<Employee> employees = new HashSet<>();
					employees.add(e1);
					employees.add(e2);
					employees.add(e3);
					employees.add(e4);
		
					Department dept = new Department();
					dept.setDid("D-111");
					dept.setDname("ADMIN");
					dept.setEmps(employees);
					session.save(dept);
					transaction.commit();
					System.out.println("Department Inserted Successfully");
				} catch (Exception e) {
					if (transaction != null) {
						transaction.rollback();
					}
					e.printStackTrace();
				} finally {
					session.close();
					sessionFactory.close();
				}
			}
		}
		

