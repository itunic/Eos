package com.itunic.layout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LayoutController {
	@RequestMapping({"/index","/"})
	public String home() {
		return "index";
	}

	@RequestMapping("/login")
	public String doLogin() {
		return "login";
	}

	@RequestMapping("/cloud")
	public String work() {
		return "textCloud";
	}
}
