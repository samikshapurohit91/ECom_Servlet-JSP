

<!--<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>

<style>
body{
    font-family: Arial, sans-serif;
    background:#f2f2f2;
}
.container{
    width:420px;
    margin:40px auto;
    background:#fff;
    padding:20px;
    border-radius:8px;
    box-shadow:0 0 10px rgba(0,0,0,0.2);
}
input{
    width:100%;
    padding:8px;
    margin:8px 0;
}
button{
    width:100%;
    padding:10px;
    background:green;
    color:white;
    border:none;
    cursor:pointer;
}
</style>
</head>

<body>

<div class="container">
    <h2>Add Product</h2>

    <form action="addProduct" method="post" enctype="multipart/form-data">

        <label>Product ID</label>
        <input type="number" name="productId"
               value="<%= request.getAttribute("productId") %>"
               readonly>

        <label>Product Name</label>
        <input type="text" name="name"
               value="<%= request.getAttribute("ProductName") %>"
               readonly>

        <label>Price</label>
        <input type="number" name="price"
               value="<%= request.getAttribute("price") %>"
               readonly>

        <label>Product Image</label>
        <input type="file" name="image" required>

        <button type="submit">Save Product</button>
    </form>
</div>

</body>
</html>-->

<%@ page import="com.jsp.entity.Product" %>
<%@ page session="true" %>

<!DOCTYPE html>
<html>
<head>
    <title>Added Product</title>
    <style>
        body {
            font-family: Arial;
            background: #f4f6f8;
        }
        .box {
            width: 400px;
            margin: 80px auto;
            padding: 20px;
            background: white;
            border-radius: 8px;
            box-shadow: 0 0 10px #ccc;
            text-align: center;
        }
        button {
            padding: 8px 15px;
            margin: 10px;
            cursor: pointer;
        }
    </style>
</head>
<body>

<%
    Product product = (Product) session.getAttribute("product");
%>

<div class="box">
    <h2>Product Added Successfully ✅</h2>

    <% if (product != null) { %>
    	
        <p><b>Product Name:</b> <%= product.getName() %></p>
        <p><b>Price:</b> ₹<%= product.getPrice() %></p>
         
    <% } else { %>
        <p>No product information found.</p>
    <% } %>


	<form action="myOrders.jsp" method="post">
    	<button type="submit">Place Order</button>
    </form>


    <!-- Continue Shopping -->
    <form action="home.jsp">
        <button type="submit">Continue Shopping</button>
    </form>

    <!-- Place Order 
    <form action="OrderPageServlet" method="post">
        <button type="submit">Place Order</button>
    </form>-->

    <!-- Logout 
    <form action="landingPage.jsp" method="post">
        <button type="submit">Logout</button>
    </form> -->
   
    
    </div>
    
    

</body>
</html>

