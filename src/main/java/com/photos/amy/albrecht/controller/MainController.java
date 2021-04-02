package com.photos.amy.albrecht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/") // "/" ==> this is the root or home page
	public String indexHandler() {
		return "index"; // view file name index.jsp
	}
	
}
