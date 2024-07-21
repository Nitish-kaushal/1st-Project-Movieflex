package com.jspider.movieflex_servlet_project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspider.movieflex_servlet_project.dao.UserDao;
import com.jspider.movieflex_servlet_project.dto.User;

@WebServlet(value = "/userLogin")
public class UserLoginController extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserDao dao = new UserDao();
		
		String email = req.getParameter("userEmail");
		String password = req.getParameter("userPassword");
		
		User user=dao.fetchUserByEmailDao(email);
		
		if(user!=null) {
			
			if(user.getPassword().equals(password)) {
				req.getRequestDispatcher("user-home.jsp").forward(req, resp);
			}else {
				req.setAttribute("userMsg", "password is invalid");
				req.getRequestDispatcher("user-login.jsp").forward(req, resp);
			}
			
		}else {
			req.setAttribute("userMsg", "email is invalid");
			req.getRequestDispatcher("user-login.jsp").forward(req, resp);
		}
		
	}
}
