package com.example.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.CustomerService;
import com.example.domain.Staff;
import com.example.domain.User;
import com.example.form.CustomerServiceHistoryForm;
import com.example.service.CustomerServiceService;
import com.example.service.SearchUserService;

@Controller
@RequestMapping("/cs")
public class CustomerServiceController {
	
	@Autowired
	private CustomerServiceService customerServiceService;
	
	@Autowired
	private SearchUserService searchUserService;
	
	@Autowired
	private HttpSession session;
	
	@ModelAttribute
	private CustomerServiceHistoryForm setUpCustomerServiceHistoryForm() {
		
		return new CustomerServiceHistoryForm();
	}
	
	
	@RequestMapping("/toUserDetail")
	public String find(Integer userId, Model model) {
		
		session.setAttribute("user", searchUserService.findUserById(userId));
		model.addAttribute("csList", customerServiceService.findCSHistoryByUserId(userId));
		
		return "user-detail";
	}
	
	@RequestMapping("/toRecord")
	public String toRecord() {
		return "record-customer-service";
	}
	
	@RequestMapping("/record")
	public String record(@Validated CustomerServiceHistoryForm form, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "record-customer-service";
		}
		
		User user = (User) session.getAttribute("user");
		Staff loginStaff = (Staff) session.getAttribute("loginStaff");
		
		CustomerService cs = new CustomerService();
		BeanUtils.copyProperties(form, cs);
		cs.setDate(LocalDate.now());
		cs.setUserId(user.getId());
		cs.setStoreId(loginStaff.getStore().getId());
		cs.setStoreName(loginStaff.getStore().getName());
		cs.setStaffId(loginStaff.getId());
		cs.setStaffName(loginStaff.getName());

		customerServiceService.recordCS(cs);
		
		return find(user.getId(), model);
	}
	
}