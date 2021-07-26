

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/address-info")
public class AddressDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");

		out.print("<div align='center'>");

		out.print("<div style='color: green;'><h1> Step 2 of 3 </h1> </div>");

		out.print("<h3>Name : "+name+"</h3>");
		out.print("<h3>Email : "+email+"</h3>");
		out.print("<h3>Contact : "+contact+"</h3>");
		
		try {
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		out.print("<h1>Address Details</h1>");
		out.print("<form action='EduDetails.jsp'>");
			out.print("<input type='hidden' name='name' value='"+name+"'>");
			out.print("<input type='hidden' name='email' value='"+email+"'>");
			out.print("<input type='hidden' name='contact' value='"+contact+"'>");
			
			out.print("Enter state : <input type='text' name='state'><br><br>");
			out.print("Enter City : <input type='text' name='city'><br><br>");
			out.print("Enter Pincode : <input type='text' name='pin'><br><br>");
			out.print("<input type='submit' value='Next'>");
		out.print("</form>");
		out.print("</div>");
		
		
	
	}

}

