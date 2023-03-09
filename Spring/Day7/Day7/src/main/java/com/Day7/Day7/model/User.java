package com.Day7.Day7.model;

public class User {
	private String name;
	private String email;
	private String no;
	private String country;
	public User(String name, String email, String no, String country) {
		super();
		this.name = name;
		this.email = email;
		this.no = no;
		this.country = country;
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
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", no=" + no + ", country=" + country + "]";
	}
	

}
