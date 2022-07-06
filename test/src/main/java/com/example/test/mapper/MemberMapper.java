package com.example.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.test.vo.MemberVO;

@Repository
@Mapper
public interface MemberMapper {
	MemberVO selectMember(MemberVO member);
}
