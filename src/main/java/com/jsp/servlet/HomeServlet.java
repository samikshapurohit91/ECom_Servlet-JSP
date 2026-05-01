package com.jsp.servlet;

import java.io.IOException;
import java.util.List;

import com.jsp.dao.ProductDAO;
import com.jsp.entity.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
	public class HomeServlet extends HttpServlet {

	    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {

	        List<Product> products = new ProductDAO().getAllProducts();
	        req.setAttribute("products", products);
	        req.getRequestDispatcher("home.jsp").forward(req, resp);
	    }
	}


