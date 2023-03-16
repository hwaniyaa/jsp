<%@page import="com.rlfghks12q.model.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp"%>
	<h1>${memberInfo.userId}</h1>
	<h1>${memberInfo.userName}</h1>
	<h1>${memberInfo.userHp}</h1>
	<h1>${memberInfo.userEmail}</h1>
	<h1>${memberInfo.zipCode}</h1>
<%@ include file="../include/footer.jsp"%>