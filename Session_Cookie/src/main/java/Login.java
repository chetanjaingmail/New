

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie[] cks = request.getCookies();
		String username = "";
		if(cks != null) {
			for(Cookie c : cks)
			{
				if("user".equals(c.getName())){
					username = c.getValue();
				}
			}
		}
		
		
		
		out.print("<center>");
		out.print("<form action='Auth'>");
			out.print("Enter Email :  <input type='text' name='email' value='"+username+"'><br><br>");
			out.print("Enter Password :  <input type='password' name='password'><br><br>");
			out.print("<input type='submit' value='Login'><br><br>");
		out.print("</form>");
		out.print("</center>");
	}

}
