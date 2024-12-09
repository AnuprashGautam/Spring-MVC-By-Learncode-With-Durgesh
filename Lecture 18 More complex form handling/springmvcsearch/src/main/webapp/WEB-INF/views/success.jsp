<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Name is ${student.name}</h1>
	<h1>Student ID is: ${student.id }</h1>
	<h1>Student DOS is: ${student.dob }</h1>
	<h1>Courses is: ${student.courses }</h1>
	<h1>Student gender is: ${student.gender }</h1>
	
	<hr>
	
	<h1>Address street is: ${student.address.street }</h1>
	<h1>Address city is: ${student.address.city }</h1>
	
</body>
</html>