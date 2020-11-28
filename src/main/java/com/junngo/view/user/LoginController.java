package com.junngo.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junngo.biz.user.UserVO;
import com.junngo.biz.user.impl.UserDAO;

@Controller
public class LoginController {

	@RequestMapping("/login.do")
	public String login(UserVO vo, UserDAO userDAO) {
		if (userDAO.getUser(vo) != null)
			return "getBoardList.do";
		else
			return "login.jsp";
	}

}
