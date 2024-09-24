package com.mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@RequestMapping("/homePage")
	public String homePage(Model model)
	{
		
		System.out.println("<h1>This is home page</h1>");
		model.addAttribute("name", "Ankit kumar joshi");
		model.addAttribute("mobile", 85855444);
		
		List<String> student = new ArrayList<String>();
		student.add("vikash solanki");
		student.add("Rahul singh");
		student.add("ram lakhan");
		model.addAttribute("sts",student);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("Help url ");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rm","Ram is singing");
		modelAndView.setViewName("help");
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		return modelAndView;
	}
	
	
}
