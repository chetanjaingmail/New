

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register-user")
public class SaveUser extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("2. This is Actual Servlet....");
		
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		  int count = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			PreparedStatement pst = con.prepareStatement("insert into register values(0,?,?,?,?)");
				pst.setString(1, name);
				pst.setString(2, email);
				pst.setString(3, contact);
				pst.setString(4, password);
			count = pst.executeUpdate();
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(count > 0) {
			response.sendRedirect("Register.jsp?code=200");
		}else {
			response.sendRedirect("Register.jsp?code=500");
		}
	}

}
