<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Contact List</title>
</head>
<body>

<jsp:include page="Menu.jsp"></jsp:include>

<div align="center">
<table border="1">
	<thead>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Contact</th>
			<th>Action</th>
		</tr>
	</thead>
	
	<tbody>
	
		<c:forEach var="ct" items="${requestScope.contacts}">
		
			<tr>
				<td>${ct.id} </td>
				<td>${ct.fname} </td>
				<td>${ct.lname} </td>
				<td>${ct.email} </td>
				<td>${ct.contact} </td>
				<td>
					<a href="edit-contact?id=${ct.id}">Edit</a> /
					<a href="delete-contact?id=${ct.id}">Delete</a>
				</td>
			</tr>
		
		</c:forEach>	
	
		
	
	
	</tbody>
	
</table>
</div>
</body>
</html>