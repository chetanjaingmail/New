

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/show-info")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String fn = request.getParameter("fname");
		String ln =request.getParameter("lname");
		String gender =request.getParameter("gender");
		
		String prefix = "Mr. ";
		if("female".equalsIgnoreCase(gender)) {
			prefix = "Ms. ";
		}
		
		out.print("<h1>Hello, "+prefix+" "+fn+" "+ln+"</h1>");
		
	}

}
