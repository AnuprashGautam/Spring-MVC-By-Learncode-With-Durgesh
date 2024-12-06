package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("This is home url.");
		
		model.addAttribute("name","Anuprash Gautam");         // Sending String object
		model.addAttribute("id", 1234);						  // Sending Integer object
		
		List<String> friends=new ArrayList<String>();
		friends.add("Anirudh");
		friends.add("Rachit");
		friends.add("Vansh");
		friends.add("Chirag");
		friends.add("Vivek");
		
		model.addAttribute("f",friends);					  // Sending List<String> object
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about url.");
		return "about";
	}
	
	@RequestMapping("/services")
	public String services()
	{
		System.out.println("This is service url.");
		return "services";
	}
	
	@RequestMapping("/help")
	public String help()
	{
		System.out.println("This is help url.");
		return "help";
	}
}

