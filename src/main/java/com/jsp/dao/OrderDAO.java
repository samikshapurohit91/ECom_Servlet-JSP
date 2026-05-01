package com.jsp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.jsp.entity.Order;
import com.jsp.entity.Product;
import com.jsp.util.Utility;




public class OrderDAO {
	
	

	public List<Order> getOrdersByUserId(int userId) {

	    Session session = Utility.getFactory().openSession();
	   // Query<Order> query = session.createQuery("from Order where user.id = :uid", Order.class);
	    	
	    String hql = "FROM Order o WHERE o.user.id = :uid";
	    
	    Query<Order> q = session.createQuery(hql, Order.class);
	    q.setParameter("uid", userId);
	    
	    List<Order> list = q.list();
	    

	  //  query.setParameter("users_id", userId);
	   // List<Order> list = query.list();
	    
	    Order order = new Order();
	     session.merge(order);

	    session.close();
	    return list;
	}
	    
	    
	    
	
	public void saveOrder(Order order){
		Session session=Utility.getFactory().openSession();
	Transaction tx = session.beginTransaction();
		
		 session.merge(order);
		
		tx.commit();
		
		session.close();
	}
		
	}


