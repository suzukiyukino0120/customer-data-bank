package com.example.form;

public class LoginForm {
	
	private Integer staffId;
	
	private String password;

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginForm [staffId=" + staffId + ", password=" + password + "]";
	}
}
