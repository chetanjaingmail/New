<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Educational Details</title>
</head>
<body>


<div align="center">

	<div style="color: green;"><h1> Step 3 of 3 </h1> </div>
	
	<%
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String city = request.getParameter("city");
		String pincode = request.getParameter("pin");
		String state = request.getParameter("state");
	%>

	<span>Name : <%= name %></span><br>
	<span>Email : <%= email %></span><br>
	<span>Contact : <%= contact %></span><br>
	<span>State : <%= state %></span><br>
	<span>City : <%= city %></span><br>
	<span>Pin code : <%= pincode %></span><br>

	<h1>User Educational Details</h1>
	
	<form action="Preview.jsp">
		<input type="hidden" name="name" value="<%=name%>">
		<input type="hidden" name="email" value="<%=email%>">
		<input type="hidden" name="contact" value="<%=contact%>">
		<input type="hidden" name="city" value="<%=city%>">
		<input type="hidden" name="pin" value="<%=pincode%>">
		<input type="hidden" name="state" value="<%=state%>">
	
		Enter Higher Degree : <input type="text" name="degree"><br><br>
		Enter Passing year : <input type="text" name="year"><br><br>
		Enter Percentage : <input type="text" name="percent"><br><br>
		<input type="submit" value="Next">
	</form>
</div>

</body>
</html>