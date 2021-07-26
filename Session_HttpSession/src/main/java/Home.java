

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/user-home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<div align='right'>");
		
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("user");
		
		out.print("<h3>Email : "+email+"</h3>");
		out.print("<h4><a href='Logout.jsp'> Logout </a></h4>");
		
		out.print("</div>");
		
		out.print("<hr>");
		
		out.print("<div align='center'>");
		
			out.print("<h1>Welcome User...</h1>");
			
		out.print("</div>");
		
	}

}
