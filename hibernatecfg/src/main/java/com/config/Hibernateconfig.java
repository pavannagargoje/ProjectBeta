package com.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Customer;

public class Hibernateconfig {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Customer.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Customer c=session.load(Customer.class, 2);
		System.out.println(c.getName());
		System.out.println(c.getPassword());
		
	}
	
	

}
