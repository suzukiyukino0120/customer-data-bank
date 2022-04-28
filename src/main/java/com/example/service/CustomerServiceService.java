package com.example.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.CustomerService;
import com.example.repository.CustomerServiceHistoryRepository;


@Service
@Transactional
public class CustomerServiceService {
	
	@Autowired
	private CustomerServiceHistoryRepository customerServiceHistoryRepository;

	public List<CustomerService> findCSHistoryByUserId(Integer userId){
				
		List<CustomerService> list = customerServiceHistoryRepository.findByUserId(userId);
		
		List<CustomerService> resultList
			= list.stream()
				  .sorted(Comparator.comparing(CustomerService::getDate, Comparator.reverseOrder()))
				  .collect(Collectors.toList());
				
		return resultList;
	}
	
	
	
	

}
