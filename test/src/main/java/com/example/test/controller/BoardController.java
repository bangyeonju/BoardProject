package com.example.test.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.test.service.BoardService;
import com.example.test.vo.BoardVO;

@RestController
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	
	@GetMapping("/main")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		return mv;
	}
	
	@GetMapping("/list")
	public ModelAndView list() {
		
		ModelAndView mv = new ModelAndView();
		List<BoardVO> lists = boardService.boardList();
		mv.addObject("lists", lists);
		mv.setViewName("list");
		return mv;
	}

	@GetMapping("/write")
	public ModelAndView boardWrite() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("write");
		return mv;
	}

	@PostMapping(value = "/write.do")
	public ModelAndView insertBoard(BoardVO board) {
		int seq = boardService.selectMaxVal();
		board.setBno(seq);
		System.out.println(board);
		boardService.insertBoard(board);
		ModelAndView mv = new ModelAndView("redirect:/list");
		return mv;
	}

	@GetMapping(value = "/detail")
	public ModelAndView detailBoard(int bno) {
		ModelAndView mv = new ModelAndView();
		BoardVO board = boardService.detailBoard(bno);
		mv.addObject("board",board);
		mv.setViewName("detail");
		return mv;
	}
	
	
	@PostMapping(value = "/update")
	public ModelAndView updateBoard(BoardVO board) {
		ModelAndView mv = new ModelAndView("redirect:/list");
		boardService.updateBoard(board);
		return mv;
	}
	
	@GetMapping(value = "/delete")
	public ModelAndView deleteBoard(int bno) {
		System.out.println("@@@@@@@@@@@@@@@@@@"+bno);
		ModelAndView mv = new ModelAndView("redirect:/list");
		boardService.deleteBoard(bno);
		return mv;
	}
}
