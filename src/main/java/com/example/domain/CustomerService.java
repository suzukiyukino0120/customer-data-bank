package com.example.domain;

import java.time.LocalDateTime;

public class CustomerService {
	
	private Integer id;
		
	private LocalDateTime date;
	
	private Integer userId;
	
	private Integer storeId;
	
	private String storeName;
	
	private Integer staffId;
	
	private String staffName;
	
	private Integer customerServicePurposeId;
	
	private CustomerServicePurpose customerServicePurpose;

	private Integer customerServiceMeanId;
	
	private CustomerServiceMean customerServiceMean;
	
	private String detail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public CustomerServicePurpose getCustomerServicePurpose() {
		return customerServicePurpose;
	}

	public void setCustomerServicePurpose(CustomerServicePurpose customerServicePurpose) {
		this.customerServicePurpose = customerServicePurpose;
	}

	public CustomerServiceMean getCustomerServiceMean() {
		return customerServiceMean;
	}

	public void setCustomerServiceMean(CustomerServiceMean customerServiceMean) {
		this.customerServiceMean = customerServiceMean;
	}

	@Override
	public String toString() {
		return "CustomerService [id=" + id + ", date=" + date + ", userId=" + userId + ", storeId=" + storeId
				+ ", storeName=" + storeName + ", staffId=" + staffId + ", staffName=" + staffName
				+ ", customerServicePurposeId=" + customerServicePurposeId + ", customerServicePurpose="
				+ customerServicePurpose + ", customerServiceMeanId=" + customerServiceMeanId + ", customerServiceMean="
				+ customerServiceMean + ", detail=" + detail + "]";
	}

	
	
	

}
