package com.util;

import java.sql.*;
public class DbConnection {
	public static void main(String[] args) {
		String driverName ="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/24_adv_java_gen_mon6_tue5";
		String userName = "root";
		String password = "Vs_9106713688";
		
		//load driver
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url,userName,password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
