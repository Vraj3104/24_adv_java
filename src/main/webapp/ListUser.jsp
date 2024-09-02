<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		ResultSet rs = (ResultSet)request.getAttribute("rs");
		while(rs.next()){
		String name = rs.getString("name");
		String category = rs.getString("category");
		int price = rs.getInt("price");
		int qty = rs.getInt("qty");
	%>
	<%= name %> | <%= category %> | <%= price %> | <%=qty %><br>
	
<%} %>	
</body>
</html>