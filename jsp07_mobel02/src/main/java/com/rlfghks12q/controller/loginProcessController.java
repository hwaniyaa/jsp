package com.rlfghks12q.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rlfghks12q.model.MemberDao;
import com.rlfghks12q.model.MemberDto;


@WebServlet("/loginController")
public class loginProcessController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public loginProcessController() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		MemberDao memberDao = new MemberDao();
		MemberDto memberDto = new MemberDto();
		memberDto.setUserId(userId);
		memberDto.setUserPw(userPw);
		MemberDto loggedMemberInfo = memberDao.getLoggedMemberInfo(memberDto);
	}

}
