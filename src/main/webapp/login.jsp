<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	

	<h1> Register Page</h1>
	
	<form method="post" action ="SignIn">
	
	  <input type="hidden" name = "actionType" value="SignIn">
	  
	<label>Name: <input type ="text" name = "name" placeholder ="Enter name" required></label> <br><br>
	<label>Password: <input type ="password" name = "password" placeholder ="Enter password" required></label><br><br>
	<label>Email: <input type ="email" name = "email" placeholder ="Enter email" required></label><br><br>
	<label>Contact: <input type ="text" name = "contact" placeholder ="Enter contact" required></label><br><br><br><br>
	
	
	
	<button type="submit">Register</button>
		
	
	
	</form>

</body>
</html>

