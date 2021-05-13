<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1>
<form action="/login" method="post">
Uname:<input type="text" name="uname"/><br> 
Password:<input type="text" name="password"/>
<input type="submit" value="login"/>
</form>
<br>
<h2 style="color:red"> ${error}</h2>
 <h2 style="color:red">${msg}</h2>
</body>
</html>