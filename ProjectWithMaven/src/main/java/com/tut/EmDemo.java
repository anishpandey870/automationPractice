package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
     	SessionFactory factory = cfg.buildSessionFactory();
    //creating object for student 	
     	Student student1=new Student();
     	student1.setId(12445);
     	student1.setName("Rahul");
     	student1.setCity("Jhasi");
     	
     	Certificate certificate =new Certificate();
     	certificate.setCourse("Java");
     	certificate.setDuration("2 month");
     	
     	student1.setCerti(certificate);
     	
     	Session s=factory.openSession();
     	Transaction tx=s.beginTransaction();
     	
     	//object save
     	s.save(student1);
     	
     	
     	tx.commit();
     	s.close();
     	factory.close();
	}

}
