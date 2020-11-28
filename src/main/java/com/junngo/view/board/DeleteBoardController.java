package com.junngo.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junngo.biz.board.BoardVO;
import com.junngo.biz.board.impl.BoardDAO;

@Controller
public class DeleteBoardController  {

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.deleteBoard(vo);

		return "getBoardList.do";
	}

}
