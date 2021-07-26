<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

<div align="center">

	<h3>User Registration</h3>
	
	<%
		String code = request.getParameter("code");
		String color="";
		String msg = "";
		if(code != null){
			switch(code){
				case "200" :
						color = "green";
						msg = "Register Successfully";
						break;
						
				case "500" :
					color = "red";
					msg = "Registration Fail.. Try After Sometime...";
					break;
			}
		}
	%>
	
	<span style="color: <%=color%>"><%= msg %></span>
	
	<%
		ArrayList<String> errorList = (ArrayList<String>) request.getAttribute("errorList");
		if(errorList != null){
			for(String errorMsg : errorList){
	%>
			<span style="color: red"><%= errorMsg %></span><br>
	<%			
			}
		}
	%>
	<br>
	<form action="register-user">
		Enter Name<sup style="color: red">*</sup> : <input type="text" name="name" value="${param.name}"><br><br>
		Enter Contact<sup style="color: red">*</sup> : <input type="text" name="contact" value="${param.contact}"><br><br>
		Enter Email<sup style="color: red">*</sup> : <input type="text" name="email" value="${param.email}"><br><br>
		Enter Password<sup style="color: red">*</sup> : <input type="password" name="password"><br><br>
		<input type="submit" value="Register">
	</form>
	<br>
	<a href="Login.jsp">Already Register?</a>

</div>

</body>
</html>