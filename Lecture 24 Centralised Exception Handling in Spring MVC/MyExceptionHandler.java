package springmvcsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

	
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
