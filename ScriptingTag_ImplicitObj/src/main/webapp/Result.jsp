<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<div align="center">
	
		<% 
			String name = request.getParameter("userName");
			String email = request.getParameter("email");
			String contact = request.getParameter("userContact");
			String age = request.getParameter("userAge");
			int numAge = Integer.parseInt(age);
			
			if(numAge>18){
		%>	
				<h1>Hello, <%= name %></h1>	
				<h3 style="color: green">You are register Successfully</h3>	
		<%		
			}else{
		%>		
				<h3 style="color: red">You are not allow to register....</h3>
		<%		
			}
		%>
	
	</div>
</body>
</html>