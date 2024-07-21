package com.jspider.movieflex_servlet_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jspider.movieflex_servlet_project.connection.MovieFlexConnection;
import com.jspider.movieflex_servlet_project.dto.Admin;

/**
 * @author Nitish kaushal
 */
public class AdminDao {

	private Connection connection=MovieFlexConnection.getMovieFlexConnection();
	
	/*
	 * database queries...
	 */
	
	private final String SELECT_QUERY_FOR_Login= "SELECT email,password FROM admin WHERE email=?";
	
	/**
	 * created fetchAdminByEmailForLogin() method 
	 * @return Admin
	 */
	public Admin fetchAdminByEmailForLoginDao(String adminEmail) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY_FOR_Login);
			
			preparedStatement.setString(1, adminEmail);
			
			ResultSet resultSet=preparedStatement.executeQuery();
		
			resultSet.next();
			
			String email = resultSet.getString("email");
			String password = resultSet.getString("password");
			
			return new Admin(email, password);
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}
