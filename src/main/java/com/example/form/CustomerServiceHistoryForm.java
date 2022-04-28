package com.example.form;

import java.time.LocalDate;

public class CustomerServiceHistoryForm {
	
	private LocalDate date;
	
	private Integer storeId;
	
	private String storeName;
	
	private Integer staffId;
	
	private String staffName;
	
	private Integer customerServicePurposeId;
	
	private Integer customerServiceMeanId;
	
	private String detail;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

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
		return "CustomerServiceHistoryForm [date=" + date + ", storeId=" + storeId + ", storeName=" + storeName
				+ ", staffId=" + staffId + ", staffName=" + staffName + ", customerServicePurposeId="
				+ customerServicePurposeId + ", customerServiceMeanId=" + customerServiceMeanId + ", detail=" + detail
				+ "]";
	}
	
	

}
