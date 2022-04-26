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
/*
	public List<CustomerService> findCSHistory() {
		CustomerService cs1 = new CustomerService();
		CustomerService cs2 = new CustomerService();
		CustomerService cs3 = new CustomerService();
		CustomerService cs4 = new CustomerService();
		CustomerService cs5 = new CustomerService();
		
		cs1.setId(1);
		cs2.setId(2);
		cs3.setId(3);
		cs4.setId(4);
		cs5.setId(5);
		
		cs1.setDate(LocalDateTime.of(2015, 12, 1, 10, 55));
		cs2.setDate(LocalDateTime.of(2015, 12, 1, 12, 55));
		cs3.setDate(LocalDateTime.of(2015, 12, 19, 9, 55));
		cs4.setDate(LocalDateTime.of(2021, 12, 1, 10, 55));
		cs5.setDate(LocalDateTime.of(2021, 12, 5, 15, 55));
		
		List<CustomerService> CShistory = new ArrayList<>();
		
		CShistory.add(cs1);
		CShistory.add(cs2);
		CShistory.add(cs3);
		CShistory.add(cs4);
		CShistory.add(cs5);
		
		CShistory.stream()
					.sorted(Comparator.comparing(CustomerService::getDate, Comparator.reverseOrder()))
					.forEach(i -> System.out.println(i));
		

		return CShistory;
	
	}
*/	
	public List<CustomerService> findCSHistoryByUserId(Integer userId){
				
		List<CustomerService> list = customerServiceHistoryRepository.findByUserId(userId);
		
		List<CustomerService> resultList
			= list.stream()
				  .sorted(Comparator.comparing(CustomerService::getDate, Comparator.reverseOrder()))
				  .collect(Collectors.toList());
				
		return resultList;
	}
	
	
	
	

}
