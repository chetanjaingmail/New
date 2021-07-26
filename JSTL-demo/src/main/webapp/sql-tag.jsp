<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="db" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
    
    <db:setDataSource var="conn" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/jdbc" user="root" password="root"/>
    
    <%-- <db:update dataSource="${conn}" sql="insert into register values(0,?,?,?,?)">
    	<db:param value="Demo2"></db:param>
    	<db:param value="demo2@yahoo.com"></db:param>
    	<db:param value="9986547854"></db:param>
    	<db:param value="Demo2@123"></db:param>
    </db:update> --%>
    
    
    
    <db:query dataSource="${conn}" var="rs" sql="select * from register"></db:query>
    
    <core:forEach var="r" items="${rs.rows}">
    	<core:out value="${r.id}"></core:out> |
    	<core:out value="${r.name}"></core:out> |
    	<core:out value="${r.email}"></core:out> |
    	<core:out value="${r.contact}"></core:out> |
    	<br>
    </core:forEach>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>SQL-tags</h1>
</body>
</html>