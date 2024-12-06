<%@page import="java.time.LocalDateTime" %>
<%@page isELIgnored="false" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		String email=(String)request.getAttribute("email");
		Integer phone=(Integer)request.getAttribute("phone");
		String add=(String)request.getAttribute("add");
		int pin=(int)request.getAttribute("pin");
		LocalDateTime time=(LocalDateTime)request.getAttribute("time");
	%> --%>

	<h1>Contact the following email and phone number for the help:</h1>
	<h2>The email is: <%-- <%=email %> --%> ${email}</h2>
	<h2>The phone number is: <%-- <%=phone %> --%> ${phone}</h2>
	<h2>The address is:<%--  <%=add %> --%> ${add}</h2>
	<h2>The pin code is: <%-- <%=pin%> --%> ${pin}</h2>
	<h2>The appropriate time to consult is: <%-- <%=time.toString() %> --%> ${time}</h2>
	
	<hr>
	
	<h2>Printing the list of all marks:</h2>
	<c:forEach var="item" items="${marks}">
		<%-- <h3>${item}</h3> --%>
		
		<c:out value="${item}"></c:out>
	</c:forEach>
</body>
</html>