package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class LoginForm {
	
	@NotNull(message="�Ј��ԍ�����͂��Ă�������")
	private Integer staffId;
	
	@NotBlank(message="�p�X���[�h����͂��Ă�������")
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
