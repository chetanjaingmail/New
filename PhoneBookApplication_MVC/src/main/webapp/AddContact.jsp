<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Contact</title>
</head>
<body>

<jsp:include page="Menu.jsp"></jsp:include>
	
	<div align="center">
		<h1>Create New Contact</h1>
		
		<c:choose>
			<c:when test="${param.c eq '200' }">
				<span style="color: green;">Contact Added successfully</span>
			</c:when>
			<c:when test="${param.c eq '500' }">
				<span style="color: red;">Fail to create Contact.. Try After sometime..</span>
			</c:when>
		</c:choose>
		
		<form action="new-contact">
			Enter First Name<sup style="color:red;">*</sup> <input type="text" name="fname"><br><br>
			Enter Last Name<sup style="color:red;">*</sup> <input type="text" name="lname"><br><br>
			Enter Contact<sup style="color:red;">*</sup> <input type="text" name="contact"><br><br>
			Enter Email<sup style="color:red;">*</sup> <input type="text" name="email"><br><br> 
			<button type="submit">Create Contact</button>
		</form>
	</div>




</body>
</html>