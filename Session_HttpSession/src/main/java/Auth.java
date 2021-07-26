
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/auth-user")
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		if("admin@gmail.com".equals(email) && "admin123".equals(pass)) {
			
			HttpSession session = req.getSession();
			
			session.setAttribute("user", email);
			
			resp.sendRedirect("user-home");
			
			
		}else {
			resp.sendRedirect("Login.jsp?c=405");
		}
	}
}
