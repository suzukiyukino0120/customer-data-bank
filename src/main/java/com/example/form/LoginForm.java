package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class LoginForm {
	
	@NotNull(message="社員番号を入力してください")
	private Integer staffId;
	
	@NotBlank(message="パスワードを入力してください")
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
