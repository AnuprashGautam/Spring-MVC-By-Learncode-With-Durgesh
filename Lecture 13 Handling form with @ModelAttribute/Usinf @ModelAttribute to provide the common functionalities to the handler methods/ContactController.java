package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	
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
		//Process
		
		System.out.println(user);
	
		return "success";
	}
}
