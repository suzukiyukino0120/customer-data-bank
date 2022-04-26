package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.CustomerService;
import com.example.service.CustomerServiceService;

@Controller
@RequestMapping("")
public class CustomerServiceController {
	
	@Autowired
	private CustomerServiceService customerServiceService;
	
	
	@RequestMapping("")
	public String find(Model model) {
		
		List<CustomerService> cslist = customerServiceService.findCSHistoryByUserId(1000);
		
		System.out.println(cslist);
		
		model.addAttribute("cslist", cslist);
		
		return "cs";
	}

}
