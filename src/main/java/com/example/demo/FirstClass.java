package com.example.demo;

import javax.swing.text.View;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstClass {
	ModelAndView mav=new ModelAndView();
	
	@RequestMapping
	public ModelAndView hi() {
		
		mav.setViewName("index");
		
		return mav;
		
	}
	
	@RequestMapping(value = "/hi")
	public @ResponseBody String sec() throws Exception {
		
		return "HI first program";
		
	}


}
