<%@page import="com.rlfghks12q.model.ClockDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
	<h1>INDEX</h1>
	<%
		ArrayList<ClockDto> clockList = 
			(ArrayList<ClockDto>)request.getAttribute("clockList");
	%>
	<img src="uploadClock/<%= clockList.get(0).getClockRealImg() %>">
	<img src="uploadClock/<%= clockList.get(1).getClockRealImg() %>">
<%@ include file="../include/footer.jsp"%>