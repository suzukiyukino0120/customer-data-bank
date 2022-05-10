package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.SearchUsersForm;
import com.example.service.SearchUserService;

@Controller
@RequestMapping("/user")
public class SearchUserContoroller {
	
	@Autowired
	private SearchUserService searchUserService;
	
	@ModelAttribute
	public SearchUsersForm setUpSearchUsersForm() {
		return new SearchUsersForm();
	}
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        // ñ¢ì¸óÕÇÃStringÇnullÇ…ê›íËÇ∑ÇÈ
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
	
	@RequestMapping("/index")
	public String index() {
		return "search";
	}
	
	@RequestMapping("/search")
	public String searcUserList(SearchUsersForm form, Model model) {
		model.addAttribute("userList", searchUserService.findUserList(form.getUserId(), form.getName(), form.getBirthday(), form.getTelephone()));
	
		System.out.println(form);
		System.out.println(searchUserService.findUserList(form.getUserId(), form.getName(), form.getBirthday(), form.getTelephone()));
		
		return "search";
		
	}

}
