

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Auth")
public class Auth extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		
		if("admin@gmail.com".equals(email) && "admin1233".equals(pass)) {
			out.print("<h1>Welcome User.....</h1>");
			
			Cookie cookie = new Cookie("user", email);
			cookie.setMaxAge(60*60*48);
			response.addCookie(cookie);
			
		}else {
			out.print("<h1>Invalid User name or password...</h1>");
		}
		
	}

}
