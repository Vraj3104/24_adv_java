<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
	<form action="RegistrationServlet1" method="post">
		First Name : <input type="text" name="firstName" value="${firstNameValue}"/>
		<font color="red">${firstNameError}</font>
		<br><br>
		Email : <input type="text" name="email" value="${emailValue}"/>
		<font color="red">${emailError}</font>
		<br><br>
		Password : <input type="password" name="password"/>
		<font color="red">${passwordError}</font>
		<br><br>
		
		Gender: Male:<input type="radio" value="male" name="gender"/>
				female:<input type="radio" value="female" name="gender"/>
				<font color="red">${genderError}</font>
		<br><br>
		City : <select name="city">
					<option value="-1">------Select City------</option>
					<option value="ahmedabad">Ahemdabad</option>
					<option value="baroda">Baroda</option>
					<option value="surat">Surat</option>
				</select>
				<font color="red">${cityError}</font>
		<br><br>
		About Yourself : <textarea rows="6" cols="25" name="aboutme"></textarea>
		<br><br>
		<input type="submit" value="Signup"/>
	</form>
</body>
</html>