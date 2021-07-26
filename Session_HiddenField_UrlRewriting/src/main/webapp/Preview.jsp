<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Preview Page</title>
</head>
<body>
<div align="center">
	<%
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String city = request.getParameter("city");
		String pincode = request.getParameter("pin");
		String state = request.getParameter("state");
		String degree = request.getParameter("degree");
		String year = request.getParameter("year");
		String percent = request.getParameter("percent");
	%>
	
	<span>Name : <%=name%> </span><br><br>
	<span>Email : <%=email%> </span><br><br>
	<span>Contact : <%=contact%> </span><br><br>
	<hr>
	<span>state : <%=state%> </span><br><br>
	<span>pincode : <%=pincode%> </span><br><br>
	<span>city : <%=city%> </span><br><br>
	<hr>
	<span>Higher Degree : <%=degree%> </span><br><br>
	<span>Passing Year : <%=year%> </span><br><br>
	<span>Percentage : <%=percent%> </span><br><br>
	<hr>
	<a href="save-user-details?name=<%=name%>&email=<%=email%>&contact=<%=contact%>">save</a>
</div>
</body>
</html>