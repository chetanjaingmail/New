import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/servlet-intro")
public class ServletIntro extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hello, I am from serlvet service method");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		//OutputStream outNew = resp.getOutputStream();
		
		out.print("<h1>Welcome To Servlet intro program....</h1>");
		
		
	}
	
}
