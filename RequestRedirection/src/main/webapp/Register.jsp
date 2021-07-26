<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>

<div align="center">
	<h3>User Registration Page</h3>
	
	<%
		ArrayList<String> errors = (ArrayList<String>) request.getAttribute("userErrors");
		if(errors != null){
			for(String msg : errors){
	%>
			<span style="color:red;"><%= msg %></span><br>
	<%			
			}
		}
	%>
	<form action="register-user">

		Enter Name <sup style="color:red;">*</sup> : <input type="text" name="username" value="<%= request.getParameter("username") %>"><br><br>
		Enter Contact <sup style="color:red;">*</sup> : <input type="text" name="usercontact" value="<%= request.getParameter("usercontact") %>"><br><br>
		Enter Gender <sup style="color:red;">*</sup> : <input type="text" name="usergender" value="<%= request.getParameter("usergender") %>"><br><br>
		Enter Email <sup style="color:red;">*</sup> : <input type="text" name="useremail" value="<%= request.getParameter("useremail") %>"><br><br>
		Enter Password <sup style="color:red;">*</sup> : <input type="password" name="userpassword"><br><br>
		<input type="submit" value="Register">
		<input type="reset">
		
	</form>




	

</div>


</body>
</html>