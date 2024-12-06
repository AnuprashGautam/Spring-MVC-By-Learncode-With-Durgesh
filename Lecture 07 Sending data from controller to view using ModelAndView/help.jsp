<%@page import="java.time.LocalDateTime" %>

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
		String email=(String)request.getAttribute("email");
		Integer phone=(Integer)request.getAttribute("phone");
		String add=(String)request.getAttribute("add");
		int pin=(int)request.getAttribute("pin");
		LocalDateTime time=(LocalDateTime)request.getAttribute("time");
	%>

	<h1>Contact the following email and phone number for the help:</h1>
	<h2>The email is: <%=email %></h2>
	<h2>The phone number is: <%=phone %></h2>
	<h2>The address is: <%=add %></h2>
	<h2>The pin code is: <%=pin%></h2>
	<h2>The appropriate time to consult is: <%=time.toString() %></h2>
	
</body>
</html>