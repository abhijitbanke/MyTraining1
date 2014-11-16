package com.abhjit.webui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index") 
	public String index(){
		System.out.println("In Index Request...................................111");
		return "index";
	}
	
}
