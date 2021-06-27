package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstClass {
	
	
	@RequestMapping
	@ResponseBody
	public String First() {
		
		return "HI first program";
		
	}

}
