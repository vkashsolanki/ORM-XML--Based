package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	
	@RequestMapping("/dosearch")
	public RedirectView sends(@RequestParam("qbox") String q)
	{
		String url ="https://www.google.com/search?q="+q;
		
		RedirectView view = new RedirectView();
		view.setUrl(url);
		
		return view;
		
	}

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("home page");
		return "home";
	}
	
}
