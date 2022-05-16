package com.example.service;

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
		
		return sortDESC(list);
	}
	
	public void recordCS(CustomerService cs) {
		customerServiceHistoryRepository.insertCS(cs);
	}
	
	public List<CustomerService> sortASC(List<CustomerService> list){
		List<CustomerService> resultList=
		list.stream()
			.sorted(Comparator.comparing(CustomerService::getDate)
					.thenComparing(CustomerService::getId))
			.collect(Collectors.toList());
		
		return resultList;
	}
	
	public List<CustomerService> sortDESC(List<CustomerService> list){
		List<CustomerService> resultList=
		list.stream()
		.sorted(Comparator.comparing(CustomerService::getDate, Comparator.reverseOrder())
				  .thenComparing(CustomerService::getId, Comparator.reverseOrder()))
		.collect(Collectors.toList());
		
		return resultList;
	}
	
	
	
	

}
