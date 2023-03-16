package com.rlfghks12q.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rlfghks12q.model.ClockDao;
import com.rlfghks12q.model.ClockDto;
import com.rlfghks12q.model.Member;


@WebServlet(urlPatterns = {"/index/*"})
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IndexController() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ClockDao clockDao = new ClockDao();
		ArrayList<ClockDto> clockList = clockDao.getAllClock();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/index/index.jsp");
		dispatcher.forward(request, response);
//		Member member = new Member();
//		member.setName("김길환");
//		member.setAge(30);
//		member.setWeight(80);
//		request.setAttribute("member", member);// 뭐든 실을 수 있다.
//		dispatcher.forward(request, response);
	}

}
