package com.account.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home page requested, Locale = " + locale);
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG , locale);
		System.out.println("dateFormat: " + dateFormat);
		String formattedDate = dateFormat.format(new Date());
		
		model.addAttribute("serverTime", formattedDate);
		
		return "home";
	}
	
}
