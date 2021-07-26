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

@WebServlet("/edit-contact")
public class EditContactCntroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		PhBookModel model = new PhBookModel();
		ContactDetails details = model.getById(id);
		
		request.setAttribute("contact", details);
		
		RequestDispatcher dis = request.getRequestDispatcher("EditContact.jsp");
		dis.forward(request, response);
		
	}

}
