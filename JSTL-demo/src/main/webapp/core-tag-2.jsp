<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <c:set var="code" value="${param.code}"></c:set>
    <c:choose>
    	<c:when test="${code==200}">
    		<span style="color: green">Register Successfully</span>
    	</c:when>
    	<c:when test="${code==500}">
    		<span style="color: red">Registration Fail.. Try After Sometime...</span>
    	</c:when>
    </c:choose>
    
    <c:set var="errorList" value="${requestScope.errorList}"></c:set>
	<c:if test="${errorList != null }">
		<c:forEach var="errorMsg" items="errorList">
				<span style="color: red">${errorMsg}</span><br>
		</c:forEach>
	</c:if>
    
    =========================================================================================================
    
    <%
		String code = request.getParameter("code");
		String color="";
		String msg = "";
		if(code != null){
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
		}
	%>
	
	<span style="color: <%=color%>"><%= msg %></span>


	<%
		ArrayList<String> errorList = (ArrayList<String>) request.getAttribute("errorList");
		if(errorList != null){
			for(String errorMsg : errorList){
	%>
			<span style="color: red"><%= errorMsg %></span><br>
	<%			
			}
		}
	%>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	