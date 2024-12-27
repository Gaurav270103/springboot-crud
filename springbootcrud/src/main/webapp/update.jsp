<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;">

	<form action="new_update">

		<h1>User Registration</h1>
		
		<c:forEach items="${uid}" var="data">
		
			<input type="hidden" name="uid" value="${data.uid}">
			<br>
			<label>User Name :</label>
			<input type="text" name="uname" value="${data.uname}">
			<br>
			<label>Password :</label>
			<input type="text" name="password" value="${data.password}">
			<br>
			<label>Mobile No :</label>
			<input type="number" name="mobileno" value="${data.mobileno}">
			<br>
			<label>name:</label>
			<input type="text" name="name" value="${data.name}">
			<br><br>
			<input type="submit" value="save">
			
		</c:forEach>
		
	</form>

</body>
</html>
