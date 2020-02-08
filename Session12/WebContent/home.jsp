<%@page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Home</title>
</head>
<body>

	<center>
		
		<%
			/* Cookie[] cookies = request.getCookies();
		
			for(Cookie cookie : cookies){
				out.print(cookie.getName()+" - "+cookie.getValue()+"<br/>");
			} */
			
			User user = (User)session.getAttribute("keyUser");
			/* User user = (User)pageContext.getAttribute("keyUser"); */
		%>
		
		<h3>Welcome Home Dear <%= user.name%></h3>
		<h4><%= user.email %></h4>
	
	</center>

</body>
</html>