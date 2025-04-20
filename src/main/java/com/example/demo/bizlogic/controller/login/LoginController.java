package com.example.demo.bizlogic.controller.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private AuthenticationManager authenticationManager;

	@GetMapping("/login")
	public String login(Model model) {
		logger.debug("login 페이지다 ");
		model.addAttribute("login", "loginPage");
		return "login";
	}

	@PostMapping("/loginProc")
	public String loginProc(@RequestParam String memberId, @RequestParam String memberPw, HttpServletRequest request) {
		logger.debug("loginProc =======================");

		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(memberId, memberPw);

		Authentication auth = authenticationManager.authenticate(token);

		SecurityContextHolder.getContext().setAuthentication(auth);
		request.getSession().setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY,
				SecurityContextHolder.getContext());
		
		logger.debug("loginProc =======================");

		return "redirect:/dashboard"; // 로그인 성공
	}
}
