package com.example.test.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.test.vo.BoardVO;
@Repository
@Mapper
public interface BoardMapper {
	List<BoardVO> getBoardList();
	void insertBoard(BoardVO board);
	int selectMaxVal();
	BoardVO detailBoard(int bno);
	void updateBoard(BoardVO board);
	void deleteBoard(int bno);
}
