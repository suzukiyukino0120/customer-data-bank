package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.CustomerService;
import com.example.service.CustomerServiceService;

@Controller
@RequestMapping("/cs")
public class CustomerServiceController {
	
	@Autowired
	private CustomerServiceService customerServiceService;
	
//	@ModelAttribute
//	private 
	
	
	@RequestMapping("/toUserDetail")
	public String find(Model model, Integer userId) {
		
		List<CustomerService> cslist = customerServiceService.findCSHistoryByUserId(userId);
		
		model.addAttribute("cslist", cslist);
		
		return "user-detail";
	}

}
