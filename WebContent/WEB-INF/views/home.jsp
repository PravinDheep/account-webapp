<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Hello World</h1>
	<p> ${serverTime} </p>
	
	<form action="user" method="post" >
		<input type="text" name="userName" id="userName"/>
		<input type="submit" value="Login">
	</form>
	
</body>
</html>