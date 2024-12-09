package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvcsearch.entities.Student;

@Controller
public class FormController {
	
	@RequestMapping(path="/complex")
	public String showForm()
	{
		System.out.println("Showing the form."); 
		return "complex_form";
	}
	
	@RequestMapping(path="/handleform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute() Student student)
	{
		System.out.println(student); 
		return "success";
	}
}
