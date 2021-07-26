<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>

	<div align="center">
	
	<%
		String code = request.getParameter("c");
		String msg = "";
		String color = "";
		if(code != null){
			switch(code){
				case "200":
					msg = "user Logged out successfully";
					color="green";
					break;
					
				case "405":
					msg = "Invalid User name or password";
					color="red";
					break;
			}
		}
	%>
		<span style="color: <%=color%>"><%= msg %></span>
		
		<form action="auth-user">
			Enter Email Id : <input type="text" name="email"><br><br>
			Enter Password : <input type="password" name="password"><br><br>
			<input type="submit" value="Login">	
		</form>
	</div>

</body>
</html>