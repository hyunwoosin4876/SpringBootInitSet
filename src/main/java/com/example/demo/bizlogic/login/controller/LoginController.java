package com.example.demo.bizlogic.login.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	Logger logger = LoggerFactory.getLogger(LoginController.class);

	@GetMapping("/login")
	public String login(Model model) {
		logger.debug("login 페이지다 ");
		model.addAttribute("login", "loginPage");
		return "login";
	}

	@PostMapping("/loginProc")
	public String loginProc(@RequestParam String memberId, @RequestParam String memberPw, HttpServletRequest request) {
		logger.debug("loginProc =======================");

		logger.debug("loginProc =======================");

		return "redirect:/dashboard"; // 로그인 성공
	}
}
