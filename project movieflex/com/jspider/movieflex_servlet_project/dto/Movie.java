package com.jspider.movieflex_servlet_project.dto;

import java.io.InputStream;
import java.time.LocalDate;

public class Movie {

	private int id;
	private String name;
	private LocalDate releasedYear;
	private String genresType;
	private String language;
	private String description;
	private String productionHouse;
	private String directorName;
	private String quality;
	private InputStream image;
	private String url;
	private String type;
	
	transient private byte[] imageFecth;
	
	public Movie() {
		super();
	}

	public Movie(int id, String name, LocalDate releasedYear, String genresType, String language, String description,
			String productionHouse, String directorName, String quality, InputStream image, String url, String type) {
		super();
		this.id = id;
		this.name = name;
		this.releasedYear = releasedYear;
		this.genresType = genresType;
		this.language = language;
		this.description = description;
		this.productionHouse = productionHouse;
		this.directorName = directorName;
		this.quality = quality;
		this.image = image;
		this.url = url;
		this.type = type;
	}

	public Movie(String name, LocalDate releasedYear, String genresType, String language, String description,
			String productionHouse, String directorName, String quality, InputStream image, String url, String type) {
		super();
		this.name = name;
		this.releasedYear = releasedYear;
		this.genresType = genresType;
		this.language = language;
		this.description = description;
		this.productionHouse = productionHouse;
		this.directorName = directorName;
		this.quality = quality;
		this.image = image;
		this.url = url;
		this.type = type;
	}

	/*
	 * constructor to fetch image
	 */

	public Movie(String name, LocalDate releasedYear, String genresType, String language, String description,
			String productionHouse, String directorName, String quality, String url, String type, byte[] imageFecth) {
		super();
		this.name = name;
		this.releasedYear = releasedYear;
		this.genresType = genresType;
		this.language = language;
		this.description = description;
		this.productionHouse = productionHouse;
		this.directorName = directorName;
		this.quality = quality;
		this.url = url;
		this.type = type;
		this.imageFecth = imageFecth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getReleasedYear() {
		return releasedYear;
	}

	public void setReleasedYear(LocalDate releasedYear) {
		this.releasedYear = releasedYear;
	}

	public String getGenresType() {
		return genresType;
	}

	public void setGenresType(String genresType) {
		this.genresType = genresType;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductionHouse() {
		return productionHouse;
	}

	public void setProductionHouse(String productionHouse) {
		this.productionHouse = productionHouse;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public InputStream getImage() {
		return image;
	}

	public void setImage(InputStream image) {
		this.image = image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getImageFecth() {
		return imageFecth;
	}

	public void setImageFecth(byte[] imageFecth) {
		this.imageFecth = imageFecth;
	}
	
	
}
