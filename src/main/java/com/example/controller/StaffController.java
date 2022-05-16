package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Staff;
import com.example.form.LoginForm;
import com.example.service.StaffService;

@Controller
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	private HttpSession session;
	
	@Autowired
	private StaffService staffService;
	
	@ModelAttribute
	public LoginForm setUpLoginForm() {
		return new LoginForm();
	}
	
	@RequestMapping("/index")
	public String index() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(@Validated LoginForm form, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "login";
		}
		
		Staff loginStaff = staffService.findStaffByIdAndPassword(form.getStaffId(), form.getPassword());
		
		if(loginStaff == null){
			model.addAttribute("loginError", "社員番号かパスワードが間違っています");
			return "login";
		}else {
			session.setAttribute("loginStaff", loginStaff);
		}
		return "redirect:/user/index";
	}
}
