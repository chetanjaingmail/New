<% 
	int i =10;
	//display();
	for(int a =1; a<=10; a++){
%>
		<%= a %>
		<br>
<%
	}	
%>


<%= "Square of Number is : "+ i*i %>

<%!
	public void display(){
		for(int i =1 ; i<=10 ;i++){
			System.out.println(i);
		}
	}
%>
