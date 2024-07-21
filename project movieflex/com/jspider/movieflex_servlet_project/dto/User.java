package com.jspider.movieflex_servlet_project.dto;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @author NITISH KAUSHAL
 * this is java POJO(plain old java object) class
 */
public class User {
	
	private int id;
	private String name;
	private String email;
	private String password;
	private LocalDate dob;
	private InputStream image;
	private long phone;
	private String gender;
	
	public User() {
		super();
	}

	/**
	 * this constructor will use for user registeration
	 * @param id
	 * @param name
	 * @param email
	 * @param password
	 * @param dob
	 * @param phone
	 * @param gender
	 */
	public User(String name, String email, String password, LocalDate dob, long phone, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.phone = phone;
		this.gender = gender;
	}

	/**
	 * this constructor will use for user login
	 * @param email
	 * @param password
	 */
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public InputStream getImage() {
		return image;
	}

	public void setImage(InputStream image) {
		this.image = image;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", dob=" + dob
				+ ", phone=" + phone + ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dob, email, gender, id, name, password, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(dob, other.dob) && Objects.equals(email, other.email)
				&& Objects.equals(gender, other.gender) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && phone == other.phone;
	}	
}
