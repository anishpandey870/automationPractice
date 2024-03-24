package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//		SessionFactory factory = cfg.buildSessionFactory();
		// creating Student
		// Student st = new Student(23, "Suresh", "pune");
//		Student st = new Student();
//		st.setId(112);
//		st.setName("kajal");
//		st.setCity("mumbai");

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
//Create and save data
		//session.save(st);
//Read the data from database		
		//Student st1 = session.get(Student.class, 108);
	     //System.out.println(st1);

//update the data from database		
		Student st1 = session.get(Student.class, 109);
		st1.setName("Updated ");
		st1.setCity("Bihar");
		session.update(st1);
//delete the data from database
		//session.delete(st1);
		tx.commit();
		session.close();
		factory.close();

		// System.out.println(factory);
	}
}
