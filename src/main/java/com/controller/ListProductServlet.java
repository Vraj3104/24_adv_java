package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListProductServlet")
public class ListProductServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//		super.service(arg0, arg1);
		// DbConnection
		
		try {
			String driverName ="com.mysql.cj.jdbc.Driver";
			String url ="jdbc:mysql://localhost:3306/24_adv_java_gen_mon6_tue5";
			String userName = "root";
			String password = "Vs_9106713688";
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url,userName,password);
			PreparedStatement pstmt = con.prepareStatement("select * from products");
			ResultSet rs = pstmt.executeQuery();
			
			request.setAttribute("rs", rs);
			RequestDispatcher rd = request.getRequestDispatcher("ListUser.jsp");
			rd.forward(request, response);
		}catch(Exception  e) {
			e.printStackTrace();
		}
		
	}
}
