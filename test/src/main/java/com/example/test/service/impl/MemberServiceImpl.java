package com.example.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.mapper.MemberMapper;
import com.example.test.service.MemberService;
import com.example.test.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public MemberVO selectMember(MemberVO member) {
		System.out.println("1");
		MemberVO vo = memberMapper.selectMember(member);
		System.out.println("2");
		return vo;
	}

}
