<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
    <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ page import="java.util.List" %>
<%@ page import="com.jsp.entity.Order"  %>
<%@ page import="com.jsp.entity.Product"  %>

<h1>My Orders</h1>

<%
    Product product = (Product) session.getAttribute("product");
%>

<br><hr>
    <h2>Order History</h2>
   
   

    <% if (product != null) { %>
    	
        <p><b>Product Name:</b> <%= product.getName() %></p>
        <p><b>Price:</b> ₹<%= product.getPrice() %></p>
         
    <% } else { %>
        <p>No product information found.</p>
    <% }
    
    
    %>
    
     
    
    

 <%-- <table border="1">
	<tr>
		
		<th>Product Name</th>
		<th>Price</th>
		
		</tr>
		<c:forEach var="product" items="${products }">
			<tr>
				<td>${product.name}</td>
				<td>${product.price }</td>
			</c:forEach>
		
		 <c:forEach var="order" items="${orders }">
		
		<h3>Order Id: ${orders.id }</h3>
		<table border ="1">
			<tr> 
			
		
				<th>Product Name</td>
			    <th>Price</td>
			
			</tr>
			<c:forEach var="p" items="${products }">
			<tr>
				<td>${p.name}</td>
				<td>${p.price }</td>
			</c:forEach>
		</c:forEach>

</table> -->


<%--  <%
    List<Order> orders = (List<Order>) request.getAttribute("orders");

   if (orders == null || orders.isEmpty()) {
%>
        <H3> No orders yet! </H3> 
<%
    } else {
      for (Order o : orders) {
%>
            <div style="border:1px solid #ccc; padding:10px; margin:10px;">
               <p><b>Product:</b> <%= o.getProduct().getName() %></p>
               <p><b>Price:</b> ₹<%= o.getProduct().getPrice() %></p>
               <p><b>Date:</b> <%= o.getOrderDate() %></p>
           </div>
<%
        }
    } 
   %>  --%>
   <br><br><br><br><br><br><br><br><br>
   <form action="home.jsp" method="post">
   <button type="Submit">Back to Home Page</button>
  </form> 
  <br><br>

 <form action="landingPage.jsp" method="post">
        <button type="submit">Logout</button>
    </form>

</body>
</html>