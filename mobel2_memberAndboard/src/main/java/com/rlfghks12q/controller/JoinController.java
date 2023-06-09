package com.rlfghks12q.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// view만 보여주는 역할
@WebServlet("/member/join.do")
public class JoinController extends HttpServlet {
	public JoinController() {
		
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/member/join.jsp");
		dispatcher.forward(request, response);
	}
}
