package com.controller;

import java.io.IOException;

import com.jsp.dao.UserDAO;
import com.jsp.entity.Product;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/landingPage")
public class LandingPageServlet extends HttpServlet{

	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("In doget() of Landing Page application");
		
		try {
			response.sendRedirect("landingPage.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Override
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
		
	
		
		String actionType= request.getParameter("actionType");
		if("SignIn".equals(actionType)){
				
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
				
				
				//response.sendRedirect("login.jsp");
				
				
			}
	
		else if ("SignUp".equals(actionType)) {
		RequestDispatcher rd = request.getRequestDispatcher("register.jsp");	
			rd.forward(request, response);
			//response.sendRedirect("register.jsp");
			
			
		}
			else {
			RequestDispatcher rd = request.getRequestDispatcher("landingPage.jsp");	
			rd.forward(request, response);
			
			
		}
	}
}
		

				
			
		
		
	
		
 




