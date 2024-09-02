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
		String studentNameError =(String)request.getAttribute("studentNameError");//Object
	%>
	<h2>Box Cricket Registration</h2>
	<form action="BoxCricketRegistrationServlet" method="post">
		StudentName : <input type="text" name="studentName"/>
		<%=studentNameError %>
		<br>
		<br>
		PlayerType : <select name="playerType">
						<option value="">Please Select Your Skill</option>
						<option value="batsman">Batsman</option>
						<option value="bowler">Bowler</option>
						<option value="allRounder">All rounder</option>
					</select>
		<br>
		<br>
		<input type="submit" value="Register"/>
	</form>
</body>
</html>