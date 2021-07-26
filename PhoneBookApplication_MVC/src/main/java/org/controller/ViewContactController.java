package org.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bean.ContactDetails;
import org.model.PhBookModel;

@WebServlet("/my-contacts")
public class ViewContactController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PhBookModel model = new PhBookModel();
		
		List<ContactDetails> list = model.getAll();
		
		request.setAttribute("contacts", list);
		
		RequestDispatcher dis = request.getRequestDispatcher("ViewContact.jsp");
		dis.forward(request, response);
		
	}

}
