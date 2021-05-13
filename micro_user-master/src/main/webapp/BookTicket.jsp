<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/book" method="post">
FlightId:<input type="number" name="id"/><br>
Number of Seats:<input type="number" name="noOfSeats" /><br>
<input type="submit" value="book"/> 
</form>
<h2 style="color:green">${msg}</h2>
<h2 style="color:green">Total Amount:${amt}</h2>

<script type="text/javascript">
/*var urlParams = new URLSearchParams(window.location.search);
var id= urlParams.get('id');
if(id!=null)
{
	document.getElementById("userId").value=id;
	console.log(id);
	}*/
//document.getElementByName("id") = id;

</script>
</body>
</html>