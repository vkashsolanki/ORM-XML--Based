package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("name", "Vikash solanki");
		return "index";
		
	}
	
	
	@RequestMapping("/home")
	public void ghome(Model model)
	{
		model.addAttribute("name", "Pritam payarei");
		
		
	}
	
}
