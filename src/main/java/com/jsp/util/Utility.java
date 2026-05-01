package com.jsp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
	
private static SessionFactory sessionFactory;
	
	
		
		public static SessionFactory getFactory() {
		
		if(sessionFactory==null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			
			System.out.println("sessionFactory created");
			
		}
		
	

	
		return sessionFactory;
	}
}


