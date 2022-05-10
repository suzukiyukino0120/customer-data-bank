package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.CustomerService;

@Mapper
public interface CustomerServiceHistoryRepository {

	List<CustomerService> findByUserId(Integer userId);
}
