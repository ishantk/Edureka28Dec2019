<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	String data = request.getParameter("data");
	
	try{
		// JDBC Program
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/edureka", "root", "");
		String sql = "select * from Employee where NAME like '"+data+"%'";
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		
		while(rs.next()){
			out.print(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getInt(4)+"<br/>");
		}
		
	}catch(Exception e){
		out.print("Sorry!! No Results can be Fetched !!"+e);
	}

%>