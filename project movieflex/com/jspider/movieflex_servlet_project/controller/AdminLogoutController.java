package com.jspider.movieflex_servlet_project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/adminLogout")
public class AdminLogoutController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession httpSession = req.getSession();
		
		if(httpSession.getAttribute("adminSession")!=null) {
			httpSession.invalidate();
			req.setAttribute("adminMsg", "You are logged out successfully");
			req.getRequestDispatcher("admin-login.jsp").forward(req, resp);;
		}
	}
}
