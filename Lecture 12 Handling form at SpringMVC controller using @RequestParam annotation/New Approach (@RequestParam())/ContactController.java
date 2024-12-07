package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String userEmail,
			@RequestParam("username") String userName,
			@RequestParam("password") String userPassword,
			Model model
			) 
	{
		
		//Processing the fetched data through RequestParam
		
		userEmail=userEmail+" Processed";
		userName=userName+" Processed";
		userPassword=userPassword+" Processed";
		
		System.out.println("Data after processing: ");
		System.out.println("The email is:"+userEmail);
		System.out.println("The username is:"+userName);
		System.out.println("The password is:"+userPassword);
		
		//Now if we want to send the data form the controller to view we can use either way:Model, ModelAndView
		
		model.addAttribute("email",userEmail);
		model.addAttribute("username",userName);
		model.addAttribute("password",userPassword);
	
		return "success";
	}
}
