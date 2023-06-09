package com.rlfghks12q.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rlfghks12q.model.MemberDao;
import com.rlfghks12q.model.MemberDto;

@WebServlet("/member/info")
public class MemberInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberInfoController() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		MemberDao memberDao = new MemberDao();
		MemberDto  memberDto = new MemberDto();
		memberDto = memberDao.getMemberInfo(userId);
		request.setAttribute("memberInfo", memberDto);
		RequestDispatcher dispatcher =  request.getRequestDispatcher("/WEB-INF/member/info.jsp");
		dispatcher.forward(request, response);
		System.out.println(memberDto.toString());
		
	}
}
