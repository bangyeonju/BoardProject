package com.example.test.service;

import java.util.List;

import com.example.test.vo.BoardVO;

public interface BoardService {
	List<BoardVO> boardList();
	void insertBoard(BoardVO board);
	int selectMaxVal();
	BoardVO detailBoard(int bno);
	void updateBoard(BoardVO board);
	void deleteBoard(int bno);
}
