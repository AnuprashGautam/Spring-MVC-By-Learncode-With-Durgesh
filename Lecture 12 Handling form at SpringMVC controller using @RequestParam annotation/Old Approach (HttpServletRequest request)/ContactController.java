package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(HttpServletRequest request) {
		
		String email=(String)request.getParameter("email");
		String username=(String)request.getParameter("username");
		String password=(String)request.getParameter("password");
		
		System.out.println("The email is:"+email);
		System.out.println("The username is:"+username);
		System.out.println("The password is:"+password);
		
		return "";
	}
}
