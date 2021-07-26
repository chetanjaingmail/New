<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>User Information</title>
	</head>
	
	<body>
		<div align="center">
			<h1>User Details form</h1>
			<form action="Display.jsp">
					Enter First Name : <input type="text" name="fname">
					<br><br>
					Enter Last name <input type="text" name="lname">
					<br><br>
					Select Gender : <select name="gender">
										<option value="male">Male</option>
										<option value="female">Female</option>
									</select> 
					<br><br>
					<input type="submit" value="Send">
			</form>
		</div>
	</body>
	
</html>