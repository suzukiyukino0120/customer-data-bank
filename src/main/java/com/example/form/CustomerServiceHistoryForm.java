package com.example.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class CustomerServiceHistoryForm {
	
//	@NotNull
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	private LocalDate date;
//	
//	@NotNull
//	private Integer userId;
//	
//	@NotNull
//	private Integer storeId;
//	
//	@NotBlank
//	private String storeName;
//	
//	@NotNull
//	private Integer staffId;
//	
//	@NotBlank
//	private String staffName;

	@NotNull(message="目的を選択してください")
	private Integer customerServicePurposeId;
	
	@NotNull(message="手段を選択してください")
	private Integer customerServiceMeanId;
	
	private String detail;

//	public LocalDate getDate() {
//		return date;
//	}
//
//	public void setDate(LocalDate date) {
//		this.date = date;
//	}
//
//	public Integer getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Integer userId) {
//		this.userId = userId;
//	}
//
//	public Integer getStoreId() {
//		return storeId;
//	}
//
//	public void setStoreId(Integer storeId) {
//		this.storeId = storeId;
//	}
//
//	public String getStoreName() {
//		return storeName;
//	}
//
//	public void setStoreName(String storeName) {
//		this.storeName = storeName;
//	}
//
//	public Integer getStaffId() {
//		return staffId;
//	}
//
//	public void setStaffId(Integer staffId) {
//		this.staffId = staffId;
//	}
//
//	public String getStaffName() {
//		return staffName;
//	}
//
//	public void setStaffName(String staffName) {
//		this.staffName = staffName;
//	}

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

//	@Override
//	public String toString() {
//		return "CustomerServiceHistoryForm [date=" + date + ", userId=" + userId + ", storeId=" + storeId
//				+ ", storeName=" + storeName + ", staffId=" + staffId + ", staffName=" + staffName
//				+ ", customerServicePurposeId=" + customerServicePurposeId + ", customerServiceMeanId="
//				+ customerServiceMeanId + ", detail=" + detail + "]";
//	}

	
	

}
