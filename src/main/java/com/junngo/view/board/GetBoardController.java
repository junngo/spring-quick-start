package com.junngo.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.junngo.biz.board.BoardVO;
import com.junngo.biz.board.impl.BoardDAO;

@Controller
public class GetBoardController {

	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		mav.addObject("board", boardDAO.getBoard(vo)); 	 // Model ���� ����
		mav.setViewName("getBoard.jsp"); 	 // View ���� ����

		return mav;
	}
}
