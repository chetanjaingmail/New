

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/register-user")
public class ValidateUserData implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("1. Pre Processing");
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String name = req.getParameter("name");
		String contact = req.getParameter("contact");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		List<String> errorMsg = new ArrayList<String>();
		
		if(name == null && name.isEmpty()) {
			errorMsg.add("Name cannot be null or empty");
		}else if(!name.matches("[A-Za-z]{2,20}")) {
			errorMsg.add("Please Enter Valid name...");
		}
		
		if(contact == null && contact.isEmpty()) {
			errorMsg.add("Contact cannot be null or empty");
		}else if(!contact.matches("[0-9]{10}")) {
			errorMsg.add("Please Enter Valid Contact Number...");
		}
		
		if(email == null && email.isBlank()) {
			errorMsg.add("Email cannot be null or empty");
		}
		
		if(password == null && password.isEmpty()) {
			errorMsg.add("Password cannot be null or empty");
		}else if(!password.matches("[A-Za-z0-9@$%^]{8,16}")) {
			errorMsg.add("Password must between 8 to 16 char and alpha numeric with @ $ % ^ special symbols are allowed..");
		}
		
		if(errorMsg.isEmpty()) {
			chain.doFilter(request, response); // to process ahead the request
		}else {
			req.setAttribute("errorList", errorMsg);
			RequestDispatcher dis = req.getRequestDispatcher("Register.jsp");
			dis.forward(req, res);
		}
		
		
		
		
		
		
		
		System.out.println("3. Post Processing");
	}


	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
