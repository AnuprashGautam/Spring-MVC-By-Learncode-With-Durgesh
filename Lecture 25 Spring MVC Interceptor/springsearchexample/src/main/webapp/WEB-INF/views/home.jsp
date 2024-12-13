<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href='<c:url value="/resources/css/style.css"/>'>
    <title>Search Page</title>
  </head>
  
  <body>
    <div class="search-container">
      <h1>Search</h1>
      <form action="welcome" method="get">
        <input type="text" name="user" class="search-bar" placeholder="Enter your keyword">
        <button type="submit" class="search-button">Search</button>
      </form>
    </div>
  </body>
</html>
