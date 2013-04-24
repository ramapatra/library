package com.spring.app.web.controller;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {
	public ModelAndView jsonView(Collection<?> map){
		
		return null;
	}
public ModelAndView  jsonView(String s){
		
	 ModelAndView mv = new ModelAndView();
	mv.addObject("data", true);
	return mv;
	}
}
