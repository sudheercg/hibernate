package com.codegnan.hibernateapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ClientApp {

    public static void main(String[] args) {
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction tx = null;

        try {
            // Configure Hibernate with annotations (or XML)
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure() // Configure using hibernate.cfg.xml
                    .build();

            // Create SessionFactory using ServiceRegistry
            sessionFactory = new MetadataSources(serviceRegistry)
                    .buildMetadata().buildSessionFactory();

            session = sessionFactory.openSession();
            tx = session.beginTransaction();

            Employee emp = new Employee();
            //emp.setEid(111); // Assuming auto-increment id
            emp.setEname("AAA");
            emp.setEsal(1000);
            emp.setEaddr("HYD");

            int pk_val = (int) session.save(emp);

            tx.commit();
            System.out.println(pk_val + " Employee Inserted Successfully");

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
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
