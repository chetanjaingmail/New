<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<s:setDataSource var="con" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/jdbc" user="root" password="root" />

<s:update dataSource="${con}" var="count" sql="insert into register values(0,?,?,?,?)">
	<s:param value="${param.name}"></s:param>
	<s:param value="${param.email}"></s:param>
	<s:param value="${param.contact}"></s:param>
	<s:param value="${param.password}"></s:param>
</s:update>

<c:if test="${count>0}">
	<c:redirect url="Register.jsp?code=200"></c:redirect>
</c:if>

<c:if test="${count<=0}">
	<c:redirect url="Register.jsp?code=500"></c:redirect>
</c:if>

