package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ADDServlet")
public class ADDServlet extends HttpServlet{
	public void service(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{


//		out.print("</h1> Login Done Successfully !!!</h1>");
		
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		PrintWriter out =  response.getWriter();
		response.setContentType("text/html");
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		out.print("Number1 (n1) : "+num1);
		out.print("<br>Number2 (n2) : "+num2);
		out.print("<br> Addition of n1 and n2 : "+(num1+num2));
		
	}
}
