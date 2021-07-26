

<%
	try{
%>
		<%= 10/0 %>
<%	
	}catch(Exception e){
		out.print("Invalid");
	}
%>
<br>
=======Expression language=================
<br>
${ 10/0 }
