<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page.</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>
	
	
	<%
		String name=(String)request.getAttribute("name");		// Receiving the String object
		Integer id=(Integer)request.getAttribute("id");			// Receiving the Integer object
		List<String> friends=(List<String>) request.getAttribute("f");   // Receiving the List<String> object
	%>
	
	<h1>My name is <%=name%> </h1>
	<h1>My id is <%=id%></h1>
	
	<h1>My friends name are:</h1>
	<%
	for(String s:friends)
	{
	%>
	
		<h1>My friend name is: <%=s %></h1>
	
	<%
	}
	%>
</body>
</html>