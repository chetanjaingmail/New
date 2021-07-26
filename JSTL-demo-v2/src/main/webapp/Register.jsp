<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="s"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>

<s:setDataSource var="con" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/jdbc" user="root" password="root" />

<div align="center">

	<c:choose>
		<c:when test="${param.code eq '200'}">
			<span style="color:green">Register Successfully</span> 
		</c:when>
		<c:when test="${param.code eq '500'}">
			<span style="color:red">Registration Fail...</span> 
		</c:when>
	</c:choose>

<br><br>
<form action="SaveData.jsp">
	Enter Name : <input type="text" name="name"><br><br>
	Enter Email : <input type="text" name="email"><br><br>
	Enter Contact : <input type="text" name="contact"><br><br>
	Enter Password : <input type="password" name="password"><br><br>
	<input type="submit" value="Register">
</form>

<hr>
<table border="1">
	<tbody>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Contact</th>
		</tr>
	</tbody>
	
	<tbody>
		<s:query dataSource="${con}" var="rs" sql="select * from register"></s:query>
		<c:forEach var="r" items="${rs.rows}">
			<tr>
				<td>${r.id}</td>
				<td>${r.name}</td>
				<td>${r.email}</td>
				<td>${r.contact}</td>
			</tr>
		</c:forEach>
	
	</tbody>

</table>



</div>

</body>
</html>













