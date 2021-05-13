<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/search" method="post">
Source:<input type="text" name="source"/><br>
Destination:<input type="text" name="destination" /><br>
<input type="submit" value="search"/> 
</form>
${flist}
 ${msg}
</body>
</html>