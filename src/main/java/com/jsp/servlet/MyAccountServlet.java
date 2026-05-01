package com.jsp.servlet;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.jsp.dao.OrderDAO;
import com.jsp.dao.ProductDAO;
import com.jsp.entity.Order;
import com.jsp.entity.Product;
import com.jsp.entity.User;
import com.jsp.util.Utility;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/MyAccount")
	public class MyAccountServlet extends HttpServlet {

	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        HttpSession session = request.getSession(false);

	        if (session == null || session.getAttribute("user") == null) {
	            response.sendRedirect("myOrders.jsp");
	            return;
	        }

	        User user = (User) session.getAttribute("user");
	        
	        OrderDAO  orderDAO = new OrderDAO();
	        List<Order> orderList = orderDAO.getOrdersByUserId(user.getId());
	        
	        Order order = new Order();
	         orderDAO.saveOrder(order);
	      
	        
	//        Session hibSession=Utility.getFactory().openSession();
//	        
//	        String hql ="FROM Order o JOIN FETCH o.orderItems WHERE o.user.id =:uid";
//	        
//	        Query<Order> query = hibSession.createQuery(hql,Order.class);
//	        query.setParameter("uid",User.getId());
//	        
//	        List<Order> orderList = query.list();
//	        
//	        hibSession.close();
//	        
	       // OrderDAO orderDao = new OrderDAO(user.getId(),product.getName());
	        
	        
	    //rodtDAO productDao = new ProductDAO();
	        //st<Product> productList;
		
			//	orderList = orderDao.getOrdersByUserId(User.getId());
	        
	 //     productList = productDao.getAllProducts();
			

	        request.setAttribute("orders", orderList);
				// request.setAttribute("products",productList);
	        request.getRequestDispatcher("myOrders.jsp").forward(request, response);
	    }
	}


