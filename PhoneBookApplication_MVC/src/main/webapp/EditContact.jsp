<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Contact</title>
</head>
<body>

<jsp:include page="Menu.jsp"></jsp:include>
	
	<div align="center">
		<h1>Edit Contact</h1>
		
		<c:choose>
			<c:when test="${param.c eq '200' }">
				<span style="color: green;">Contact updated successfully</span>
			</c:when>
			<c:when test="${param.c eq '500' }">
				<span style="color: red;">Fail to update Contact details.. Try After sometime..</span>
			</c:when>
		</c:choose>
		
		<form action="update-contact">
			<input type="hidden" name="id" value="${requestScope.contact.id}">
			Enter First Name<sup style="color:red;">*</sup> <input type="text" name="fname" value="${requestScope.contact.fname}"><br><br>
			Enter Last Name<sup style="color:red;">*</sup> <input type="text" name="lname" value="${requestScope.contact.lname}"><br><br>
			Enter Contact<sup style="color:red;">*</sup> <input type="text" name="contact" value="${requestScope.contact.contact}"><br><br>
			Enter Email<sup style="color:red;">*</sup> <input type="text" name="email" value="${requestScope.contact.email}"><br><br> 
			<button type="submit">Update Contact</button>
		</form>
	</div>
	
</body>
</html>