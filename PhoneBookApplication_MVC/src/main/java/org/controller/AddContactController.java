package org.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bean.ContactDetails;
import org.model.PhBookModel;

@WebServlet("/new-contact")
public class AddContactController extends HttpServlet {
	PhBookModel model;
	@Override
	public void init(ServletConfig config) throws ServletException {
		 model = new PhBookModel();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		
		ContactDetails details = new ContactDetails();
			details.setFname(firstName);
			details.setLname(lastName);
			details.setContact(contact);
			details.setEmail(email);
		
		
			int result = model.saveContact(details);
			
			
		if(result>0) {
			response.sendRedirect("AddContact.jsp?c=200");
		}else {
			response.sendRedirect("AddContact.jsp?c=500");
		}
	}

}
