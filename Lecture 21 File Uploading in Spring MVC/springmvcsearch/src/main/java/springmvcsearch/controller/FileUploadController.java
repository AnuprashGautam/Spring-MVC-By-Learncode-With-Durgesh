package springmvcsearch.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("fileform")
	public String showUploadForm()
	{
		System.out.println("Showing image upload form.");
		return "fileform";
	}
	
	@RequestMapping(value="/uploadimage", method=RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file,HttpSession s,Model m)
	{
		System.out.println("file upload handler");
		System.out.println(file.getName());
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		
		//Getting the byte data
		byte[] data=file.getBytes();
		
		//we have to save this file to sever...
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"image"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		
		try {
			FileOutputStream fos=new FileOutputStream(path);
	    	fos.write(data);
		    fos.close();
		    m.addAttribute("filename",file.getOriginalFilename());
			m.addAttribute("msg","uploaded successfully!");
		}catch(IOException e)
		{
			e.printStackTrace();
			m.addAttribute("msg","Uploading error.");
			System.out.println("Uploading error");
			
		}
		
		System.out.println("file uploaded");
	
		return "filesuccess";
	}
}
