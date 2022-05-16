package com.example.form;


import javax.validation.constraints.NotNull;


public class CustomerServiceHistoryForm {
	
	@NotNull(message="目的を選択してください")
	private Integer customerServicePurposeId;
	
	@NotNull(message="手段を選択してください")
	private Integer customerServiceMeanId;
	
	private String detail;

	public Integer getCustomerServicePurposeId() {
		return customerServicePurposeId;
	}

	public void setCustomerServicePurposeId(Integer customerServicePurposeId) {
		this.customerServicePurposeId = customerServicePurposeId;
	}

	public Integer getCustomerServiceMeanId() {
		return customerServiceMeanId;
	}

	public void setCustomerServiceMeanId(Integer customerServiceMeanId) {
		this.customerServiceMeanId = customerServiceMeanId;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "CustomerServiceHistoryForm [customerServicePurposeId=" + customerServicePurposeId
				+ ", customerServiceMeanId=" + customerServiceMeanId + ", detail=" + detail + "]";
	}
}
