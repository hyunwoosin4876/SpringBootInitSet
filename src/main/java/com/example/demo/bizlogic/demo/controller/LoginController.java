package com.example.demo.bizlogic.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {
	
	Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	
	@GetMapping("/login")
	public String login(Model model) {
		logger.debug("login 페이지다 ");
		model.addAttribute("login", "loginPage");
		return "login";
	}
}
