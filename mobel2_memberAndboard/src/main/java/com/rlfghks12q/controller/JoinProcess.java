package com.rlfghks12q.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rlfghks12q.model.MemberDao;
import com.rlfghks12q.model.MemberDto;


@WebServlet("/member/joinProcess")
public class JoinProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public JoinProcess() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDao memberDao = new MemberDao();
		MemberDto memberDto = new MemberDto();
		memberDto.setUserId("qwer");
		memberDto.setUserPw("1234");
		memberDto.setUserName("강백호");
		memberDto.setUserEmail("kan@asdf.com");
		memberDto.setUserHp("01011111111");
		memberDto.setZipCode(123456);
		memberDto.setAddress("dddd");
		memberDao.insertMember(memberDto);
		int result = memberDao.insertMember(memberDto);
		if(result > 0) {
			ScriptWriter.alertAndNext(response, "회원가입 되었습니다.");
		}
	}

}
