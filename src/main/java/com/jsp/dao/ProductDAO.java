package com.jsp.dao;


	

	import java.util.List;

	

	import com.jsp.entity.Product;

import com.jsp.util.Utility;

import org.hibernate.Session;
import org.hibernate.Transaction;

	public class ProductDAO {

	    
	    public Product getProductById(int id) {

	        Session session = Utility.getFactory().openSession();
	        
	        Product p = session.get(Product.class, id);

	       

	        session.close();
	        return p;
	    }
	    public List<Product> getAllProducts(){
	    	
	        Session session = Utility.getFactory().openSession();
	        
	        List<Product>list = (List<Product>) session.createQuery("from Product", Product.class).list();
	        
	        session.close();
	        
	        return list;
	    	
	    	
	    }
	    public Product saveProduct(Product p) {
	       
	    	
	    	
	    	//Session session = Utility.getFactory().openSession();
	    	 Transaction tx = null;
		    //Transaction tx =  session.beginTransaction();
	    	 try {
	    		 Session session = Utility.getFactory().openSession();
	    		 tx=  session.beginTransaction();
	    	 
		      session.merge(p);
		     tx.commit();
		     session.close();
	    	 }catch(Exception e) {
	    		 e.printStackTrace();
	    	 }
		    //session.close();
		    return p;
	    	
	    	

	      //  try (Session session = Utility.getFactory().openSession()) {

		    
	             
	           // tx.commit();

	        } //catch (Exception e) {
	           
	          //  e.printStackTrace();
	        
	    }
	  
	


