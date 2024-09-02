package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BoxCricketRegistrationServlet")
public class BoxCricketRegistrationServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String studentName = request.getParameter("studentName");
		String playerType = request.getParameter("playerType");
		
		boolean isError = false;
		
		if(studentName == null || studentName.trim().length() == 0) {
			request.setAttribute("studentNameError", "Please Enter Student Name : ");
			isError = true;
		}
		if(playerType == null || 	studentName.trim().length()==0) {
			request.setAttribute("playerTypeError", "Please select Player Type");
		}
		if(isError==true) {
			RequestDispatcher rd = request.getRequestDispatcher("BoxCricketRegistration.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("BoxCricketRegestrationSuccess.jsp");
			rd.forward(request, response);
		}
	}
}
