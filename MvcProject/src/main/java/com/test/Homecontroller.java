package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Homecontroller {
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String home(Model model)
	{
		model.addAttribute("user", "User Registration");
		return "home";
	}
	
	
	

	@RequestMapping(method = RequestMethod.POST)
	public String getSubmit(Model model, @ModelAttribute("login") Login login)
	{
		
		if(login != null && login.getName() != null & login.getPassword() !=null) {
			
			if (login.getName().equals("vikash") && login.getPassword().equals("V1234")) {
				model.addAttribute("msg", login.getName());
				return "success";
								
			}else {
				model.addAttribute("error", "Invalid details");
				return "home";
			}
			}else{
				model.addAttribute("error", "please enter your coorect password");
				return "home";
			}
		}
	
		
	}
	
	