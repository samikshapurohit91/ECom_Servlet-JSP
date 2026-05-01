<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> login Page</h1>
	
	<form method="post" action ="SignUp">
	
	<input type="hidden" name = "actionType" value="SignUp">
	
	
	
	<label> name: <input type = "text" name="name"  placeholder ="Enter name" required/></label> <br><br>
	<label> password: <input type = "password" name="password"  placeholder ="Enter password" required /></label> <br><br><br><br>
	
	<button type="submit">login</button>
		
	
	
	</form>

</body>
</html>