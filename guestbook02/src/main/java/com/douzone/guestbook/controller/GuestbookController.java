package com.douzone.guestbook.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.guestbook.dao.GuestbookDao;
import com.douzone.guestbook.vo.GuestbookVo;

public class GuestbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		String action = request.getParameter("a");
		if ("deleteform".equals(action)) {
			// view로 포워딩
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/deleteform.jsp");
			rd.forward(request, response);

		} else if ("add".equals(action)) {
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String message = request.getParameter("message");

			GuestbookVo vo = new GuestbookVo();
			vo.setName(name);
			vo.setPassword(password);
			vo.setMessage(message);
			vo.setRegDate(LocalDateTime.now().toString());

			new GuestbookDao().insert(vo);

			// 2. redirect 응답
			response.sendRedirect(request.getContextPath() + "/gb");

		} else if ("delete".equals(action)) {
			String no = request.getParameter("no");
			String password = request.getParameter("password");

			System.out.println(Long.parseLong(no));
			GuestbookVo vo = new GuestbookVo();
			vo.setNo(Long.parseLong(no));
			vo.setPassword(password);

			new GuestbookDao().delete(vo);

			response.sendRedirect(request.getContextPath() + "/gb");

		} else {
			/* default request(action) */

			// 1. 요청처리
			List<GuestbookVo> list = new GuestbookDao().findAll();

			// 2. request범위에 데이터(객체) 저장
			request.setAttribute("list", list);

			// 3. view로 포워딩
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
			rd.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
