package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

//import java.net.http.HttpRequest;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AllHtmlInputServlet")
public class AllHtmlInputServlet extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException , IOException {

		String firstname = request.getParameter("firstname"); 
		String birthYear = request.getParameter("birthYear"); 
		boolean isError = false;
		String error = "";
		
		if(birthYear == null || birthYear.trim().length() == 0) {
			isError = true;
			error = "Please enter Valid Birth Year....!!!";
		} else if(birthYear.matches("[0-9]{4}") == false) {
			isError = true;
			error = "Please enter Valid Birth Year....!!!";
		}
		if(isError == true) {
			
		}
		String email = request.getParameter("email"); 
		String password = request.getParameter("password"); 
		String gender = request.getParameter("gender"); 
		String city = request.getParameter("city"); 
		String address = request.getParameter("address"); 
		
		String hobby[] = request.getParameterValues("hobby");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("First Name : "+firstname+"<br>");
		out.print("Birth Year : "+birthYear+"<br>");
		out.print("Email : "+email+"<br>");
		out.print("Password : "+password+"<br>");
		out.print("Gender : "+gender+"<br>");
		out.print("City : "+city+"<br>");
		out.print("Hobby : ");
		for(int i=0;i<hobby.length;i++) {
			out.print(hobby[i]+" ");
		}
	}
}
