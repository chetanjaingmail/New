package org.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bean.ContactDetails;
import org.model.PhBookModel;

@WebServlet("/update-contact")
public class UpdateContactController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		
		ContactDetails details = new ContactDetails();
		details.setId(id);
		details.setFname(firstName);
		details.setLname(lastName);
		details.setContact(contact);
		details.setEmail(email);
		
		PhBookModel model = new PhBookModel();
		int result = model.update(details);	
		
		if(result>0) {
			request.setAttribute("contact", details);
			//response.sendRedirect("EditContact.jsp?c=200");
			RequestDispatcher dis = request.getRequestDispatcher("EditContact.jsp?c=200");
			dis.forward(request, response);
		}else {
			response.sendRedirect("EditContact.jsp?c=500");
		}
		

	}

}
