package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.entity.User;
import com.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService service;
	
	
	@RequestMapping("/contact")
	public String homes()
	{
		return "contact";
	}
	
	@RequestMapping(value = "/process", method = RequestMethod.POST)
	public String handle(@ModelAttribute ("user") User user, Model model) {
		
		System.out.println(user);
		this.service.createUser(user);

		
		return "showdata";
	}

}
