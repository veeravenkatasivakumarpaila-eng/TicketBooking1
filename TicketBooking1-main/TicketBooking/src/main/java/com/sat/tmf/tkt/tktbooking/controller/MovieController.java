package com.sat.tmf.tkt.tktbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/movie")
public class MovieController {
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String testMethod(@RequestParam("mname") String movieName) {
		System.out.println("This is a testMethod() @ MovieController");
		System.out.println("Movie Name:"+movieName);
		return null;
	}
	
	@RequestMapping(value="/test", method = RequestMethod.POST)
	public String testPostMethod(@RequestParam("mname") String movieName) {
		System.out.println("This is a testMethod() @ MovieController");
		System.out.println("Movie Name:"+movieName);
		return null;
	}
}



