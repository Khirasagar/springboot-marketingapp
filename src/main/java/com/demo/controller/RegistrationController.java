package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {	
	
	//http://localhost:8080/viewReg
	
	@RequestMapping("/viewReg")
	public String viewRegistrationPage() {
		return "add-registration";
	}
	
}

