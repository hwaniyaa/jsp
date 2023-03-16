<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--
	String driver = application.getInitParameter("OracleDriver");
	String url = application.getInitParameter("OracleURL");
	String id = application.getInitParameter("OracleID");
	String pw = application.getInitParameter("OraclePW");
	
	Connection conn=null;
	
	Class.forName(driver);
	conn = DriverManager.getConnection(url,id,pw);
	System.out.println(conn);
	
	
--%>
<%
Connection conn=null;

Context initCtx = new InitialContext();
Context ctx = (Context) initCtx.lookup("java:comp/env");
DataSource source = (DataSource) ctx.lookup("dbcp_myoracle");

// 커넥션 풀을 통해 연결 얻기
conn = source.getConnection();

System.out.println("DB 커넥션 풀 연결 성공");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>