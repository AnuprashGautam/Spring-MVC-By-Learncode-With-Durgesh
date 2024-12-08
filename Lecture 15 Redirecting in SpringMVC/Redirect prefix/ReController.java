package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public String one() {
		System.out.println("This is one handler.");
		return "redirect:/two";
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is second handler.");
		return "";
	}
}
