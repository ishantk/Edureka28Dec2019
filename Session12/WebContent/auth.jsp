<%@ page import="co.edureka.db.DBHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ page errorPage="error.jsp" %> 
<%@ include file="header.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Authentication</title>
</head>
<body>

	<center>
	
	Authenticating.... 
	${param.txtEmail} <!-- EL is used directly in HTML :) -->
	

	<%
		User user = new User();
	
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		String authType = request.getParameter("txtType");
		
		DBHelper db = new DBHelper();
		db.createConnection();
		
		if(authType.equals("Login")){
			boolean login = db.loginUser(user);
			
			if(login){
				
				// 1. Session Tracking Technique -> COOKIES :)
				/* Cookie ck1 = new Cookie("keyName", user.name);
				Cookie ck2 = new Cookie("keyEmail", user.email);
				
				response.addCookie(ck1);
				response.addCookie(ck2); */
				
				// 2. Session Tracking Technique -> HttpSession :)
				session.setAttribute("keyUser", user);
				
				// 3. Session Tracking Technique -> PageContext :) | We have 4 different levels as in scope to save data :)
				// pageContext.setAttribute("keyUser", user, PageContext.SESSION_SCOPE);
	%>
				<h3>Login Success</h3>
				<h4>Welcome Dear, <%= user.name %></h4>		
				<!-- <a href="home.jsp">Enter Home</a> -->
				<jsp:forward page="home.jsp"/>
	<%	
			}else{
				response.sendRedirect("https://google.co.in");
	%>
				<h4>Login Failed</h4>
	<%			
			}
			
		}else{
			int i = db.registerUser(user);
			
			if(i>0){
	%>
				<h3>Registration Success</h3>
				<h4>Welcome Dear, <%= user.name %></h4>		
	<%	
			}else{
	%>
				<h4>Registration Failed</h4>
	<%			
			}
		}
		
		db.closeConnection();
	
	%>
	
	</center>

</body>
</html>