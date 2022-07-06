package com.example.test.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public ModelAndView greeting() {
		ModelAndView mv = new ModelAndView();
		List<Map<String, Integer>> lists = new ArrayList<Map<String, Integer>>();
		mv.addObject("lists", lists);
		mv.setViewName("test");
		//model.addAttribute("name", name);
		//model.addAttribute("test","test");
		
		return mv;
	}
}
