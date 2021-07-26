<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

<%
	int a = 10;
	out.print(a);
	out.print("<br>");
	if(a>=10){
		out.print("A value is >= 10");
	}
	out.print("<br>");
	for(int i = 1; i<=10; i++){
		out.print(i + "<br>");
	}

	String name[] = {"Abc","Xyz","Lmn"};
	for(String nm : name){
		out.print(nm + "<br>");
	}
	
	try{
		out.print(10/0);
	}catch(Exception e){
		
	}
	
	out.print("<br>");
	String color="";
	String msg = "";
	String code = "500";
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
	
	out.print("<span style='color:"+color+"'>"+msg+"</span>");
	
%>

<br>
=======JSTL core Tags=================
<br>
<core:set var="b" value="10"></core:set>

<core:out value="${b * b}"></core:out>
<br>

<core:if test="${b>=10}">
	B value is >= 10
</core:if>
<br>

<core:forEach var="i" begin="1" end="10" step="1">
	<core:out value="${i}"></core:out>
	<br>
</core:forEach>

<core:set var="username" value="Abc,Xyz,Lmn"></core:set>
<core:forEach var="nm" items="${username}">
	<core:out value="${nm}"></core:out>
	<br>
</core:forEach>

<core:catch var="e">
	<%= 10/0 %>
</core:catch>

<br>

<core:set var="c" value="500"></core:set>
<core:choose>
	<core:when test="${ c==200 }">
		<span style="color:green">Register Successfully</span>
	</core:when>
	<core:when test="${ c==500 }">
		<span style="color:red">Registration Fail.. Try After Sometime...</span>
	</core:when>
	<core:otherwise>
		<span style="color:blue">No Message for you...</span>
	</core:otherwise>
</core:choose>




















