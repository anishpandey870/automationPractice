package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BankTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
     	SessionFactory factory = cfg.buildSessionFactory();
     	
     // creating question
     	Bank bank=new Bank();
     	bank.setBankId(12);
     	bank.setBank("SBI");
     	
     	
   	//creating answer
     	Account acc=new Account();
     	acc.setAccountId(23);
     	acc.setAccount("Mahesh account");
     	acc.setBank(bank);
     	
     	
     	
     	
     	Account acc1=new Account();
     	acc1.setAccountId(24);
     	acc1.setAccount("Sandeep account");
     	acc1.setBank(bank);
     	
     	
     	Account acc2=new Account();
     	acc2.setAccountId(25);
     	acc2.setAccount("Rohit account");
     	acc2.setBank(bank);
     	
     	
     	List<Account> list= new ArrayList<Account>();
     	list.add(acc);
     	list.add(acc1);
     	list.add(acc2);
     	bank.setAccount(list);
     	
   
    //session
     	Session s=factory.openSession();
     	Transaction tx=s.beginTransaction();
    //save data
     	s.save(bank);
     	s.save(acc);
     	s.save(acc1);
     	s.save(acc2);
     	
     	tx.commit();
     	s.close();
     	factory.close();
	}

}
