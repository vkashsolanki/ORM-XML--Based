package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.controller.entity.User;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homes()
	{
		return "contact";
	}
	
	@RequestMapping(value = "/process", method = RequestMethod.POST)
	public String handle(
			@RequestParam("name")String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password, Model model)
	{
		
			User user = new User();
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			

		
		//direct ham object pass kr diya h
			
		model.addAttribute("user", user);

		
		return "showdata";
	}

}
