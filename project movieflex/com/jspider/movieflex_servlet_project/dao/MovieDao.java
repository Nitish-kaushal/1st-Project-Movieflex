package com.jspider.movieflex_servlet_project.dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.jspider.movieflex_servlet_project.connection.MovieFlexConnection;
import com.jspider.movieflex_servlet_project.dto.Movie;

public class MovieDao {

	Connection connection = MovieFlexConnection.getMovieFlexConnection();

	private final String INSERT_MOVIE_QUERY =
			"insert into movie(name, image, releasedate, genrestype, language, description, productionhouse, directorname, quality, url, type) values(?,?,?,?,?,?,?,?,?,?,?)";
	
	
	@SuppressWarnings("unused")
	private final String SELECT_ALL_MOVIE_QUERY = "SELECT * FROM movie";
	
	public Movie saveMovieDao(Movie movie) {
		
		try {
			PreparedStatement ps = connection.prepareStatement(INSERT_MOVIE_QUERY);
			ps.setString(1, movie.getName());
			ps.setBlob(2, movie.getImage());
			ps.setObject(3, movie.getReleasedYear());
			ps.setString(4, movie.getGenresType());
			ps.setString(5, movie.getLanguage());
			ps.setString(6, movie.getDescription());
			ps.setString(7, movie.getProductionHouse());
			ps.setString(8, movie.getDirectorName());
			ps.setString(9, movie.getQuality());
			ps.setString(10, movie.getUrl());
			ps.setString(11, movie.getType());
			ps.execute();
			return movie;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Movie> getAllMovieDetailsDao(){
		
		try {
			PreparedStatement ps = connection.prepareStatement(SELECT_ALL_MOVIE_QUERY);
			ResultSet rs = ps.executeQuery();
			
			List<Movie> movies = new ArrayList<Movie>();
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String genresType = rs.getString("genrestype");
				String language = rs.getString("language");
				String description = rs.getString("description");
				String productionhouse = rs.getString("productionhouse");
				String directorname = rs.getString("directorname");
				String quality = rs.getString("quality");
				String url = rs.getString("url");
				String type = rs.getString("type");
				Blob blob= rs.getBlob("image");
				byte[] image = blob.getBytes(1, (int) blob.length());
				
				LocalDate releaseDate = rs.getDate("releasedate").toLocalDate();
				
				Movie movie = new Movie(name, releaseDate, genresType, language, description, productionhouse, directorname, quality, url, type, image);
				movies.add(movie);
			}
			
			return movies;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Movie> getSpecificTypeMovieDetailsDao(String movieType){
		
		List<Movie> movies=getAllMovieDetailsDao();
		
		List<Movie> specificType = new ArrayList<Movie>();
		
		for (Movie movie : movies) {
			if(movie.getType().equalsIgnoreCase(movieType)) {
				specificType.add(movie);
			}
		}
		
		return specificType;
	}
}
