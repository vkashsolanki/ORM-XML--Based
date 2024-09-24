


package com.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home()
	
	{
		System.out.println("This is home page");
		return "home";
	}
	
	@RequestMapping("/dosearch")
	public RedirectView dosearch(@RequestParam("qbox") String qs)
	{
		String url = "https://www.google.com/search?q="+qs;	
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		
		return redirectView;
	}
}
