<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %> 
<%@ page buffer="8kb" %>
<%@ page info="JSP Tutorial" %> 
<%@ include file="header.jsp" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isThreadSafe="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Tutorial</title>
</head>
<body>
	<center>
		<h3>Welcome to JSP Tutorial</h3>
		<i>Search the Candle, rather than cursing the Darkness !!</i>
		<br/>
		
		<%-- a is: <%= a %> Error --%>
		pi is: <%= pi %>	<!-- OK -->
		<br/>
		Area Of Circle with radius 2.2 is: <%= area(2.2) %>
		<br/>
		<!-- Scriptlet -->
		<%
			
			int a = 10;
			int b = 20;
			int sum = a+b;		
			
			// out -> reference to Implicit Object of PrintWriter
			// So, here we need not to create Object of PrintWriter to send back response. It is available for us.
			out.print("Sum from Sriptlet is: "+sum);
			
			int[] array = {10, 20, 30, 40, 50};
			
		%>
		
		<!-- Action Tag -->
		<jsp:include page="header.jsp"/>
		
		<!-- Scriptlet - Expression Tag -->
		<h4>Sum is: <%= sum %></h4>
		<h4>array[3] is: <%= array[3] %></h4>
		
		<!-- Declarative Tag -->
		<%!
			
			double pi = 3.14;
			
			double area(double radius){
				return pi * radius * radius;
			}
			
		%>
		
		<%
			// User Object Construction
			// user1 -> Reference Variable
			User user1 = new User();
			// Setters
			user1.setName("Sia");
			user1.setEmail("sia@example.com");
			user1.setPassword("sia123");
		%>
		<h4>User Details: <%= user1.getName() %> | <%= user1.getEmail() %> | <%= user1.getPassword() %> |</h4>
		
		<!-- User Object Construction | user2 -> Reference Variable -->
		<jsp:useBean id="user2" class="co.edureka.model.User"/>
		
		<!-- Set Property Tag -->
		<jsp:setProperty property="name" name="user2" value="Kia"/>
		<jsp:setProperty property="email" name="user2" value="kia@example.com"/>
		<jsp:setProperty property="password" name="user2" value="kia123"/>
		
		<h4>User Details: 
		
		<jsp:getProperty property="name" name="user2"/> |
		<jsp:getProperty property="email" name="user2"/> |
		<jsp:getProperty property="password" name="user2"/> |
		
		</h4>
		<!-- JSTL | Explore More: https://docs.oracle.com/javaee/5/tutorial/doc/bnald.html -->
		<c:forEach var="i" begin="1" end="10">
			<c:out value="${i}"/> <br/>
		</c:forEach>
		
	</center>
	

</body>
</html>