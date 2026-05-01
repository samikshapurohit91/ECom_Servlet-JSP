package com.jsp.servlet;


	
	import java.io.IOException;
import java.io.PrintWriter;

import com.jsp.dao.ProductDAO;
import com.jsp.dao.UserDAO;
import com.jsp.entity.Product;
import com.jsp.entity.User;

import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

	@WebServlet("/SignIn")
	public class loginServlet extends HttpServlet{
		
		private UserDAO userDAO = new UserDAO();
		
		@Override
		public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
			System.out.println("In get - addUsers()");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		
		}

		
		@Override
		public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
			System.out.println("In post - addUsers()");
			String name= request.getParameter("name");
			String password= request.getParameter("password");
			String email= request.getParameter("email");
			String contact= request.getParameter("contact");
			
			//UserDAO dao = new UserDAO();
			//User user = dao.findByName(name);
			
			//User user = dao.saveUser(user);
			
			User user = new User();
			user.setName(name);
			user.setPassword(password);
			user.setEmail(email);
			user.setContact(contact);
			
			UserDAO dao = new UserDAO();
			
			dao.saveUser(user);
			
			
			
			
			
			
			
			
			if( user != null) {
				
				//User user = new User();
//				user.setName(name);
//				user.setPassword(password);
//				user.setEmail(email);
//				user.setContact(contact);
				
				//dao.saveUser(user);
				
				System.out.println("User Saved");
				
				response.sendRedirect("home.jsp");
				return;
		}
			else {
				
				response.sendRedirect("login.jsp");
			}
//			User user = new User();
//			user.setName(name);
//			user.setPassword(password);
//			user.setEmail(email);
//			user.setContact(contact);
			
			
			//userDAO.saveUser(user);
			
			
			
			//System.out.println("User Saved");
			
//			response.sendRedirect("/home.jsp");
//			request.getRequestDispatcher("home.jsp").forward(request, response);
//			
			
			
		}
	}
		

	


