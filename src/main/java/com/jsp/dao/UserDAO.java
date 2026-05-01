package com.jsp.dao;


	
	import java.util.List;

	import org.hibernate.HibernateException;
	import org.hibernate.Session;
	import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.jsp.entity.Product;
import com.jsp.entity.User;
import com.jsp.util.Utility;


	public class UserDAO {

		
//		 public User ValidateUser(String name, String password,String email, String contact)  {
//			 Session session = Utility.getOrCreate().openSession();
//			
//			Query<User> query = session.createQuery("from User where name =: name and password =:password and email =: email and contact =: contact", User.class);
//			
//			query.setParameter("name", name);
//			query.setParameter("password", password);
//			query.setParameter("email",email);
//			query.setParameter("contact", contact);
//			
//			User user = query.uniqueResult();
//			
//			
//			
//		
//			Transaction tx = session.beginTransaction();
//			
//			
//			return user;
//		 }
//			
//			
//			
//			
//			public User ValidateUser2(String name, String password)  {
//				 Session session = Utility.getOrCreate().openSession();
//				
//				Query<User> query = session.createQuery("from User where name =: name and password =:password", User.class);
//				
//				query.setParameter("name", name);
//				query.setParameter("password", password);
//			
//				
//				User user = query.uniqueResult();
//				
//				
//				
//				
//
//				Transaction tx = session.beginTransaction();
//				
//				return user;
//				
//		
//			
//	
//		
//		}
//			
//	}
		
		public User findByNameAndPassword(String name, String password) {
		    Session session = Utility.getFactory().openSession();

		    Query<User> query = session.createQuery(
		        "from User where name = :name password = : password", User.class);
		    query.setParameter("name", name );
		    query.setParameter("password", password);

		    User user = query.uniqueResult();
		    session.close();

		    return user;
		}
		
		public User saveUser(User user) {
		    Session session = Utility.getFactory().openSession();
		    Transaction tx = session.beginTransaction();

		     session.merge(user);

		    tx.commit();
		    session.close();
		    return user;
		}
		
		public User validateLogin(String name, String password) {
		    Session session = Utility.getFactory().openSession();

		    Query<User> query = session.createQuery(
		        "from User where name = :name and password = :password",
		        User.class);

		    query.setParameter("name", name);
		    query.setParameter("password", password);

		    User user = query.uniqueResult();
		    session.close();

		    return user;
		}
	}


