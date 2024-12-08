package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("Header", "SignUp Form");
		m.addAttribute("Desc","All fields are required.");
		
		System.out.println("Adding the common data to model.");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("Creating form");
		return "contact";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) 
	{
		System.out.println(user);
		
		if(user.getUsername().isBlank())
		{
			return "redirect:/contact";
		}
		
		this.userService.createUser(user);
		return "success";
	}
}
