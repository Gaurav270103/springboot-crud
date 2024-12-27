package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@Controller
public class HomeController {
	
	
	
	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String preLogin()
	{
		
		
		return "login";
	}
	
	@RequestMapping("/registerpage")
	public String preReg()
	{
		
		
		return "register";
	}
	
	@RequestMapping("/reg")
	public String register(@ModelAttribute Student s)
	{

		hs.saveData(s);
		
		return "login";
	}
	@RequestMapping("/login")
	public String loginCheck(@RequestParam("uname")String un,@RequestParam("password")String ps,Model m)
	{
		
	Student s=hs.loginCheck(un,ps);
	Iterable<Student> list=hs.getAll();
	
	m.addAttribute("data",list);	
		
		return "success";
	}
	
	
	
	@RequestMapping("/delete")
	public String deleteData(@RequestParam("uid")int uid,Model m)
	{
		hs.deleteData(uid);
		Iterable<Student> list=hs.getAll();
		
		m.addAttribute("data",list);	
			
			return "success";
	}
	
	
	
	@RequestMapping("/new_update")
	public String updateData(@ModelAttribute Student s,Model m)
	{
		hs.saveData(s);
		Iterable<Student> list=hs.getAll();
		m.addAttribute("data", list);

		return "success";
	}
	
	@RequestMapping("/edit")
	public String editPage(@RequestParam("uid")int uid,Model m)
	{
		Student s=hs.editPage(uid);
		m.addAttribute("data", s);
		return "update";
	}
	

	
}	


