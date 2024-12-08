package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public void one(HttpServletResponse response) {
		System.out.println("This is one handler.");
		try {
			//response.sendRedirect("two");
			//response.sendRedirect("/two");
			response.sendRedirect("https://www.google.com");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is second handler.");
		return "";
	}
}
