package com.cjc.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String prelogin()
	{
		
		
		return "login";
	}
	@RequestMapping("login")
	public String loginCheck()
	{
		
		
		return "successjsp";
	}
}
