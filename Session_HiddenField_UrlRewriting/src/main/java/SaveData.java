

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save-user-details")
public class SaveData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String city = request.getParameter("city");
		String pincode = request.getParameter("pin");
		String state = request.getParameter("state");
		String degree = request.getParameter("degree");
		String year = request.getParameter("year");
		String percent = request.getParameter("percent");
		
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Contact : " + contact);
		System.out.println("---------------------------");
		System.out.println("State : " + state);
		System.out.println("City : " + city);
		System.out.println("Pincode : " + pincode);
		System.out.println("---------------------------");
		System.out.println("Degree : " + degree);
		System.out.println("year : " + year);
		System.out.println("percent : " + percent);
		
		//DB Connetivity
		//Insert the data
		
	}

}
