package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet1")
public class RegistrationServlet1 extends HttpServlet{
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String aboutme = request.getParameter("aboutme");
		
		boolean isError = false; //no error
		if(firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		}else {
			request.setAttribute("firstNameValue", firstName);
		}
		
		if(email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		}else {
			request.setAttribute("emailValue", email);
		}
		
		if(password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter Password");
		}
		
		if(gender == null) {
			isError = true;
			request.setAttribute("genderError","Please Select Gender");
		}else {
			request.setAttribute("genderValue", gender);
		}
		if(city == null || city.equals("-1")) {
			isError = true;
			request.setAttribute("cityError", "Please Select City");
		}else {
			request.setAttribute("cityValue", city);
		}
		
		RequestDispatcher rd = null;
		if(isError == true) {
			rd = request.getRequestDispatcher("Registration.jsp");
		}
		else {
			rd = request.getRequestDispatcher("Home.jsp");
		}
		rd.forward(request, response);
	}
}
