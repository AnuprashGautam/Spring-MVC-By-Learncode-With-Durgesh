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

	<h3 class="text-center">${Header}</h3>
    <p class="text-center">${Desc}</p>
    <hr>
    
	<h1>Welcome ${user.username}</h1>
	<h2>Your email is ${user.email}</h2>
	<h2>Your password is ${user.password}</h2>
	<h2>Please secure them otherwise I will hack you.💀</h2>
</body>
</html>