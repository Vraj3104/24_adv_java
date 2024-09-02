<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="SaveProductServlet" method="post">
		FIRSTNAME : <input type="text" name="name">
		<br><br>
		Quantity : <input type="text" name="quantity">
		<br><br>
		Category : <input type="text" name="category">
		<br><br>
		Price : <input type="text" name="price"> 
		<br><br>
		<input type="submit" value="ADD">
		<br>
	</form>
</body>
</html>