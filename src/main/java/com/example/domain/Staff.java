package com.example.domain;

public class Staff {
	
	private Integer id;
	
	private String name;
	
	private Integer storeId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", storeId=" + storeId + "]";
	}

	
	
	

}
