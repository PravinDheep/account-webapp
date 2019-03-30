package com.account.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import com.account.model.User;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home page requested, Locale = " + locale);
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG , locale);
		String formattedDate = dateFormat.format(new Date());
		model.addAttribute("serverTime", formattedDate);
		
		return "home";
	}
	
	/*
	 * 	@RequestMapping(value="/user", method=RequestMethod.POST)
		public String user(Model model, @RequestParam(value="userName") String name ) {
			model.addAttribute("userName", name);
			
			return "user";
		}
	*/	
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public String user(@Validated User user,Model model) {
		System.out.println("User Page Requested" + user.getUserName());
		model.addAttribute("userName", user.getUserName());
		
		return "user";
	}
	
}