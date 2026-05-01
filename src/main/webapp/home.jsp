

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>

<style>
body{
    font-family: Arial, sans-serif;
    background:#f4f4f4;
}

h2{
    text-align:center;
}

.container{
    width:90%;
    margin:auto;
}

.products{
    display:grid;
    grid-template-columns: repeat(3, 1fr);
    gap:20px;
    margin-top:30px;
}

.card{
    background:#fff;
    padding:15px;
    border-radius:8px;
    box-shadow:0 0 8px rgba(0,0,0,0.1);
    text-align:center;
}

.card img{
    width:100%;
    height:150px;
}

.card h3{
    margin:10px 0;
}

.card p{
    color:green;
    font-weight:bold;
}

button{
    background:#007bff;
    color:white;
    border:none;
    padding:8px 15px;
    border-radius:5px;
    cursor:pointer;
}

button:hover{
    background:#0056b3;
}
.history{
margin-left : 1000px;
margin-top :20px;

}
.submit{
margin-left : 1000px;
margin-top :5px;

}



</style>

</head>
<body>

<h2>Welcome to Home Page</h2>


<a href="<%= request.getContextPath() %>/MyAccount">
<button class="history">MyAccount</button>
</a>
<br>

 <form action="landingPage.jsp" method="post">
        <button class="submit">Logout</button>
    </form>

<div class="container">
    <div class="products">

        <!-- Product 1 -->
        <div class="card">
            <img src="images/phone.png">
            <h3>Mobile</h3>
            <p>₹15000</p>
            <form action="AddProduct" method="post">
            	<input type="hidden" name="productId" value="1">
                <input type="hidden" name="productName" value="Mobile">
                <input type="hidden" name="price" value="15000">
                <a href="addProduct.jsp?
                productId= 1&productName=Mobile&price=15000">
                <button type="submit">Add Product</button>
                </a>
            </form>
            
         <!--   <form action="placeOrder" method="post">
    <input type="hidden" name="productId" value="1">  <%-- change id per product --%>
    <input type="number" name="quantity" value="1" min="1">
    <button type="submit">Buy</button>
</form> -->
        </div>

        <!-- Product 2 -->
        <div class="card">
            <img src="<%=request.getContextPath()%>/images/laptop1.png">
            <h3>Laptop</h3>
            <p>₹55000</p>
            <form action="AddProduct" method="post">
            	<input type="hidden" name="productId" value="2">
                <input type="hidden" name="productName" value="Laptop">
                <input type="hidden" name="price" value="55000">
                <button type="submit">Add Product</button>
            </form>
            
           
        </div>

        <!-- Product 3 -->
        <div class="card">
            <img src="<%=request.getContextPath()%>/images/headphones.png">
            <h3>Headphones</h3>
            <p>₹2000</p>
            <form action="AddProduct" method="post">
            	     	<input type="hidden" name="productId" value="3">
                <input type="hidden" name="productName" value="Headphones">
                <input type="hidden" name="price" value="2000">
                <button type="submit">Add Product</button>
            </form>
            
           
        </div>

        <!-- Product 4 -->
        <div class="card">
            <img src="<%=request.getContextPath()%>/images/keyboard.jpg">
            <h3>Keyboard</h3>
            <p>₹1200</p>
            <form action="AddProduct" method="post">
            	     	<input type="hidden" name="productId" value="4">
                <input type="hidden" name="productName" value="Keyboard">
                <input type="hidden" name="price" value="1200">
                <button type="submit">Add Product</button>
            </form>
           
        </div>

        <!-- Product 5 -->
        <div class="card">
            <img src="<%=request.getContextPath()%>/images/mouse.png">
            <h3>Mouse</h3>
            <p>₹700</p>
            <form action="AddProduct" method="post">
                 	<input type="hidden" name="productId" value="5">
                <input type="hidden" name="productName" value="Mouse">
                <input type="hidden" name="price" value="700">
                <button type="submit">Add Product</button>
            </form>
            
           
        </div>

        <!-- Product 6 -->
        <div class="card">
            <img src="<%=request.getContextPath()%>/images/smartw.jpg">
            <h3>Smart Watch</h3>
            <p>₹3500</p>
            <form action="AddProduct" method="post">
                 	<input type="hidden" name="productId" value="6">
                <input type="hidden" name="productName" value="Smart Watch">
                <input type="hidden" name="price" value="3500">
                <button type="submit">Add Product</button>
            </form>
           
        </div>

    </div>
</div>

</body>
</html>

