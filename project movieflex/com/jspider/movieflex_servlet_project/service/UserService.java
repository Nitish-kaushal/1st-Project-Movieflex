package com.jspider.movieflex_servlet_project.service;

import com.jspider.movieflex_servlet_project.dao.UserDao;
import com.jspider.movieflex_servlet_project.dto.User;
import com.jspider.movieflex_servlet_project.verification.EmailPasswordVerification;

public class UserService {

	UserDao dao = new UserDao();

	public User userRegistrationService(User user) {
		
		String email = EmailPasswordVerification.emailVerification(user.getEmail());

		String password = EmailPasswordVerification.passwordVerification(user.getPassword());
		
		if((email!=null)&&(password!=null)) {
			return dao.userRegistrationDao(user);
		}else {
			return null;
		}
	}
}
