package com.example.form;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class SearchUsersForm {
	
	private Integer userId;
	
	private String name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthday;
	
	private String telephone;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "SearchUsersForm [userId=" + userId + ", name=" + name + ", birthday=" + birthday + ", telephone="
				+ telephone + "]";
	}
	
	

}
