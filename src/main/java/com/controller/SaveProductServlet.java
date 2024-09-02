package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveProductServlet")
public class SaveProductServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
		String name = request.getParameter("name");
		String category = request.getParameter("category");
		Integer price = Integer.parseInt(request.getParameter("price"));
		Integer quantity = Integer.parseInt(request.getParameter("quantity"));
		
		//table --- products
//		create table products(
//				productId integer primary key auto_increment,
//				name varchar(30),
//				price integer,
//				category varchar(30),
//				qty integer
//				);
		
// 		show tables;
		
//		desc products;
		
		//DbConnection
		
		try{
				String driverName = "com.mysql.cj.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/24_adv_java_gen_mon6_tue5";
				String userName = "root";
				String password = "Vs_9106713688";
				Class.forName(driverName);
				Connection con = DriverManager.getConnection(url,userName,password);
				PreparedStatement pstmt = con.prepareStatement("insert into products (name,category,price,qty) values (?,?,?,?) ");
				pstmt.setString(1, name);
				pstmt.setString(2, category);
				pstmt.setInt(3, price);
				pstmt.setInt(4, quantity);
				
				int record = pstmt.executeUpdate();
				
				if(record == 0) {
					System.out.println("SMW");
				}else {
					System.out.println("product Added");
				}
				RequestDispatcher rd = request.getRequestDispatcher("AddProduct.jsp");
				rd.forward(request, response);
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
	}
}
