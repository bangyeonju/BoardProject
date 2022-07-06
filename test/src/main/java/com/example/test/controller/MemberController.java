package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.test.service.MemberService;
import com.example.test.vo.MemberVO;

@RestController
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	
	@PostMapping("/login.do")
	public ModelAndView loginMember(MemberVO member) {
		System.out.println("@@@@@@@@@@@@@@@@@@");
		System.out.println(member);
		ModelAndView mv = new ModelAndView();
		MemberVO memberInfo = memberService.selectMember(member);
		mv.addObject("member",memberInfo);
		mv.setViewName("list");
		return mv;
	}
	
}
