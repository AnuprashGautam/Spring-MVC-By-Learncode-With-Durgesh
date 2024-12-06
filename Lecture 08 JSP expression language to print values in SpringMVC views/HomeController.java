package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView help()
	{
		System.out.println("This is help url.");
		
		// Making object to add the models and view name and at last to return.
		ModelAndView modelAndView=new ModelAndView();
		
		// Adding the models
		modelAndView.addObject("email", "help@gmail.com");
		modelAndView.addObject("phone", 12345);
		modelAndView.addObject("add", "Delhi");
		modelAndView.addObject("pin", 251301);
		LocalDateTime now =LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(90);
		marks.add(88);
		marks.add(70);
		marks.add(33);
		marks.add(40);
		
		modelAndView.addObject("marks",marks);
		
		// Adding the view name
		modelAndView.setViewName("help");

		return modelAndView;
	}
}

