package com.junngo.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junngo.biz.board.BoardVO;
import com.junngo.biz.board.impl.BoardDAO;

@Controller
public class InsertBoardController {
	
	@RequestMapping(value="/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {		
		boardDAO.insertBoard(vo);	
		return "getBoardList.do";
	}
}
