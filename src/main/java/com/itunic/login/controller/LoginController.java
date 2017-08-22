package com.itunic.login.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.junit.runners.Parameterized.Parameters;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping("/index")
	public String home() {
		return "index";
	}

	@RequestMapping("/login")
	public String doLogin() {
		return "login";
	}

	@RequestMapping("/goLogin")
	@ResponseBody
	public String login(@RequestParam  Map<String, String> map,HttpServletRequest request) {
		System.out.println(map.toString());
		System.out.println(request.getParameter("userName"));
		return "1";
		
	}
}
