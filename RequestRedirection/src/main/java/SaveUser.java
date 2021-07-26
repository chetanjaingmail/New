

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register-user")
public class SaveUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("username");
		String contact = request.getParameter("usercontact");
		String gender = request.getParameter("usergender");
		String email = request.getParameter("useremail");
		String password = request.getParameter("userpassword");

		ArrayList<String> errorList = new ArrayList<String>();
		
		if(name == null || name.isBlank()) {
			errorList.add("Invalid User Name...");
		}
		
		if(contact == null || contact.isBlank()) {
			errorList.add("Invalid User contact...");
		}
		
		if(gender == null || gender.isBlank()) {
			errorList.add("Invalid User gender...");
		}
		
		if(email == null || email.isBlank()) {
			errorList.add("Invalid User email...");
		}
		
		if(password == null || password.isBlank()) {
			errorList.add("Invalid User password...");
		}
		
		if(errorList.isEmpty()) {
			response.sendRedirect("Success.jsp");
		}else {
			request.setAttribute("userErrors", errorList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Register.jsp");
			dispatcher.forward(request, response);
		}

	}

}







