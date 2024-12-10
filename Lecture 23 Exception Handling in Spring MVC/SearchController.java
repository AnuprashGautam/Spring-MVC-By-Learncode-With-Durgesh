package springmvcsearch.controller;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId,@PathVariable("userName") String userName)
	{
		System.out.println("User Id is:"+userId);
		System.out.println("Username is:"+userName);
//		Integer.parseInt(userName);
		return "home";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("Going to home view.");
		// Processing area
		String str=null;
		System.out.println(str.length());
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
	
//	Handling exception in out Spring MVC
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlerNull(Model m)
	{
		m.addAttribute("msg","NullPointerException is raised.");
		return "null_page"; 
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m)
	{
		m.addAttribute("msg","NumberFormatException is raised.");
		return "null_page"; 
	}
	
//	Generalized Exception handler
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerException(Model m)
	{
		m.addAttribute("msg","Exception is raised.");
		return "null_page"; 
	}
	
}
