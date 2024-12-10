package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId,@PathVariable("userName") String userName)
	{
		System.out.println("User Id is:"+userId);
		System.out.println("Username is:"+userName);
		return "home";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("Going to home view.");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query)
	{
		if(query.isBlank())
		{
			RedirectView redirectView=new RedirectView("home");
			return redirectView;
		}
			
		String url="https://www.google.com/search?q="+query;
		System.out.println("Searching for: "+query);
		RedirectView redirectView=new RedirectView(url);
		return redirectView;
	}
}
