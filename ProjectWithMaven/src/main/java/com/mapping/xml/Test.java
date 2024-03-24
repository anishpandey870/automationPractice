package com.mapping.xml;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//creating object of person class
	//	Person person =new Person(243,"suresh","jabalpur","759687757");
//creating object of adress class 
		
		Adress ad=new Adress();
		ad.setStreet("street2");
		ad.setCity("Bangalore");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234.56);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		

		//session.save(person);
		session.save(ad);
		tx.commit();
		session.close();
		factory.close();
	}

}
