package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(request, response);
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		String operation = request.getParameter("operation");
		
		Boolean isError = false;
		String error= "";
		if(n1==null || n1.trim().length()== 0) {
			isError = true;
			error = "Please Enter Number1<br>";
		}
		if(n2 == null || n2.trim().length() == 0) {
			isError = true;
			error += "Please Enter Number2<br>";
		}
		if(operation == null) {
			isError = true;
			error += "Please select operation<br>"; 
		}
		if(isError) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print(error);
		}
		else
		{
			Integer x = Integer.parseInt(n1);
			Integer y = Integer.parseInt(n2);
	
			int ans =0 ;
			
			if(operation.equals("+")) {
				ans = x + y;
			}else if(operation.equals("-")){
				ans = x - y;
			}else if(operation.equals("*")){
				ans = x * y;
			}else if(operation.equals("+")) {
				ans = x / y;
			}
			response.setContentType("text/html");
			PrintWriter out= response.getWriter();
			out.print("ans : " + ans);		
		}
		// 50% --- Required Field Validation
//		String n1 = request.getParameter("n1");
//		String n2 = request.getParameter("n2");
//		String operation = request.getParameter("operation");
//		if(n1 == null || n2 == null || operation == null) {
//			response.setContentType("text/html");
//			PrintWriter out= response.getWriter();
//			out.print("Please select all the fields...");	
//		}
//		else {
//			
//		Integer x = Integer.parseInt(n1);
//		Integer y = Integer.parseInt(n2);
//
//		int ans =0 ;
//		
//		if(operation.equals("+")) {
//			ans = x + y;
//		}else if(operation.equals("-")){
//			ans = x - y;
//		}else if(operation.equals("*")){
//			ans = x * y;
//		}else if(operation.equals("+")) {
//			ans = x / y;
//		}
//		response.setContentType("text/html");
//		PrintWriter out= response.getWriter();
//		out.print("ans : " + ans);
//		
//		}
	}
}
