package com.example.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.mapper.BoardMapper;
import com.example.test.service.BoardService;
import com.example.test.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;

	@Override
	public List<BoardVO> boardList() {
		return boardMapper.getBoardList();
	}

	@Override
	public void insertBoard(BoardVO board) {
		boardMapper.insertBoard(board);
	}

	@Override
	public int selectMaxVal() {
		int seq = boardMapper.selectMaxVal();
		return seq;
	}

	@Override
	public BoardVO detailBoard(int bno) {
		BoardVO board = boardMapper.detailBoard(bno);
		return board;
	}

	@Override
	public void updateBoard(BoardVO board) {
		boardMapper.updateBoard(board);

	}

	@Override
	public void deleteBoard(int bno) {
		boardMapper.deleteBoard(bno);
		
	}

}
