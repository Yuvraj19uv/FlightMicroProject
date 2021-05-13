<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/cancelFlight" method="post">
Enter Booking Id:<input type="number" name="id"><br>
<input type="submit" value="Cancel Booking"/>
</form>
 <h1 style="color:green"> ${msg}</h1>
</body>
</html>