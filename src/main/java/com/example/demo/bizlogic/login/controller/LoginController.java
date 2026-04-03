package com.example.demo.bizlogic.login.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.framework.security.JwtUtil;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	AuthenticationManager authenticationManager;
	
	@Autowired
	JwtUtil jwtUtil;

	@GetMapping("/login")
	public String login(Model model) {
		logger.debug("login 페이지다 ");
		model.addAttribute("login", "loginPage");
		return "login";
	}

	@PostMapping("/loginProc")
	@ResponseBody
	public String loginProc(@RequestParam String memberId, @RequestParam String memberPw, HttpServletRequest request) {
		logger.debug("loginProc =======================");
		Authentication authentication =
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							memberId,
							memberPw
					)
			);

		logger.debug("loginProc =======================");

		return jwtUtil.createToken(memberId);
	}
}
