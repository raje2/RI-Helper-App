package com.masai.controller;

import javax.persistence.metamodel.SetAttribute;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.masai.model.UserDtl;
import com.masai.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserDtl u, HttpSession session) {
		
		System.out.println(u);
		userService.registerUser(u);
		session.setAttribute("message","User Register Successfully");
		return "redirect:/";
	}
	
	@GetMapping("/getlist")
     public String getList() {
		
		return "home";
	}

}
