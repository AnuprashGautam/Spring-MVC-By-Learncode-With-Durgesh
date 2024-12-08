package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(
			@RequestParam(name="email", required=true) String userEmail,
			@RequestParam(name="username", required=true) String userName,
			@RequestParam(name="password", required=true) String userPassword,
			Model model
			) 
	{
		
		//Processing the fetched data through RequestParam
		
		userEmail=userEmail+" Processed";
		userName=userName+" Processed";
		userPassword=userPassword+" Processed";
		
		User user=new User();
		user.setEmail(userEmail);
		user.setUsername(userName);
		user.setPassword(userPassword);
		
		System.out.println(user);
		
		//Now if we want to send the data form the controller to view we can use either way:Model, ModelAndView
		
		model.addAttribute("user",user);
	
		return "success";
	}
}
