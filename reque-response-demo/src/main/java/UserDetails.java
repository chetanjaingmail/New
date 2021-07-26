

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-info")
public class UserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<center>");
		out.print("<h1>User Details</h1>");
		out.print("<form action='show-info'>");
			out.print("Enter First name <input type='text' name='fname'><br><br>");
			out.print("Enter Last name <input type='text' name='lname'><br><br>");
			out.print("Select gender : ");
			out.print("<select name = 'gender'>");
				out.print("<option vaule='male'>Male</option>");
				out.print("<option vaule='female'>Female</option>");
			out.print("</select><br><br>");
			out.print("<input type='submit' value='save'>");
			out.print("<input type='reset' value='clear'>");
		out.print("</form>");
		out.print("</center>");
	}

}

