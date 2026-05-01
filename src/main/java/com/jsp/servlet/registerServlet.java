package com.jsp.servlet;


	
	
	import java.io.IOException;

	import com.jsp.dao.ProductDAO;
import com.jsp.dao.UserDAO;
import com.jsp.entity.Product;
import com.jsp.entity.User;

import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

	@WebServlet("/SignUp")
	public class registerServlet extends HttpServlet{
		
		private UserDAO userDAO = new UserDAO();
		
		@Override
		public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
			System.out.println("In get - addUsers()");
			//response.sendRedirect("register.jsp");
			request.getRequestDispatcher("register.jsp").forward(request, response);
			
		
		}

		
		@Override
		public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
			System.out.println("In post - addUsers()");
			String name= request.getParameter("name");
			String password= request.getParameter("password");
			
			
			
			
			
			
			UserDAO dao = new UserDAO();
			User user = dao.validateLogin(name, password );
			
			//User user = dao.findByNameAndPassword(name,password);
			
			
			
			
			
			if( user != null) {
				response.sendRedirect("home.jsp");
				return;
			}
			else {
				
				response.sendRedirect("login.jsp");
				return;
			}
	
			
//			System.out.println("User Saved");
//			
//			response.sendRedirect("/jspproject/home");
			//request.getRequestDispatcher("listProducts.jsp").forward(request, response);
			
			
			
		}
		

	

}


