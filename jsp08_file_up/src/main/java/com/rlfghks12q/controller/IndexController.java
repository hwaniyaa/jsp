package com.rlfghks12q.controller;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rlfghks12q.model.ClockDao;
import com.rlfghks12q.model.ClockDto;


@WebServlet(urlPatterns = {"/", "/index", "/main", ""})
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public IndexController() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("WEB-INF/inedx/index.jsp");
		ArrayList<ClockDto> clockList = new ArrayList<>();
		ClockDao clockDao = new ClockDao();
		clockDao.getAllClock();
		clockList = clockDao.getAllClock();
		request.setAttribute(getServletName(), response);
		dispatcher.forward(request, response);
	}

}
