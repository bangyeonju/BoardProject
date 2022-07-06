package com.example.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SampleController {
	@GetMapping("/sample")
	public ModelAndView jspSample() throws Exception{
		ModelAndView mv = new ModelAndView("jspSample");
		mv.addObject("name","홍길동");
		List<String> sample = new ArrayList<String>();
		sample.add("국어 100");
		sample.add("수학 83");
		sample.add("영어 73");
		mv.addObject("lists",sample);
		return mv;
	}
	
}
