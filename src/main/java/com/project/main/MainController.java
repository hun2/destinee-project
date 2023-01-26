package com.project.main;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.main.bo.MainBO;
import com.project.main.model.Friend;
import com.project.user.bo.UserBO;
import com.project.user.model.User;

@Controller
public class MainController {
	@Autowired
	private UserBO userBO;
	@Autowired
	private MainBO mainBO;
	// 메인페이지
	@GetMapping("/main")
	public String main() {
		return "/main/main";
	}
	
	// 랜덤통화
	@GetMapping("/call")
	public String call(Model model, HttpSession session) {
		User loginUser = (User) session.getAttribute("loginUser");
		
		return "/main/call";
	}
	
	// 친구추천
	@GetMapping("/recommend")
	public String recommend(HttpSession session, Model model) {
		User user = (User) session.getAttribute("loginUser");
		List<User> userList = mainBO.getUserList(user);
		model.addAttribute("userList", userList);
		return "/main/recommend";
	}
	
	//친구목록
	@GetMapping("/friend")
	public String friend(HttpSession session, Model model) {
		User user = (User) session.getAttribute("loginUser");
		int id = user.getId();
		List<User> requestList = mainBO.getFriend(id);
		List<User> friendList = mainBO.getRealFriend(id);
		model.addAttribute("requestList", requestList);
		model.addAttribute("friendList", friendList);

		return "/main/friend";
	}
	
	// 내정보
	@GetMapping("/mypage")
	public String mypage() {
		return "/main/mypage";
	}
	
	//로그아웃
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		
		session.removeAttribute("loginUser");
		return "redirect:/user/sign-in";
	}
	
	//영상통화 테스트
	@RequestMapping("/test")
	public String test() {
		return "/main/test";
	}
	
}
