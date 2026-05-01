
package com.jsp.servlet;

import java.io.IOException;

import com.jsp.dao.ProductDAO;
import com.jsp.entity.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/AddProduct")
public class AddProductServlet extends HttpServlet{
	
	private ProductDAO productDAO = new ProductDAO();
	
	@Override
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In get - addProducts()");
		request.getRequestDispatcher("AddProduct.jsp").forward(request, response);
		
	
	}

	
	@Override
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
		System.out.println("In post - addProducts()");
		
		String productId = request.getParameter("productId");
		
		String productName= request.getParameter("productName");
		
		int price = Integer.parseInt(request.getParameter("price"));
		
		//String image = request.getParameter("image");
		
		Product p = new Product();
		p.setName(productName);
		p.setPrice(price);
		//p.setImage(image);
		
		
		
		
		
		//int ProductId = Integer.parseInt(request.getParameter("productId"));
		
		ProductDAO dao = new ProductDAO();
		dao.saveProduct(p);
		
		
		//Product product= dao.getProductById(ProductId);
//		request.setAttribute("productId",productId);
//		request.setAttribute("productName",productName);
//		request.setAttribute("price",price);
		
		HttpSession session = request.getSession();
		session.setAttribute("product",p);
		
		
	
		
		System.out.println("Product Saved");
		
		response.sendRedirect("AddProduct.jsp");
		//request.getRequestDispatcher("listProducts.jsp").forward(request, response);
		
		
	}
}
	

