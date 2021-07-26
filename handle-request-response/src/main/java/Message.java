

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-msg")
public class Message extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		out.print("<html>");
		
		out.print("<head>");
			out.print("<title>Mesasge Page</title>");
		out.print("</head>");
		
		out.print("<body>");
		
			out.print("<form action='display-msg'>");
				out.print("Enter name <input type='text' name='msg'><br><br>");
				out.print("<input type='submit' value = 'Send'>");
			out.print("</form>");
		
		out.print("</body>");
		
		out.print("</html>");
		
		
	}

}
