package com.project.main;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	// 메인페이지
	@GetMapping("/main")
	public String main() {
		return "/main/main";
	}
	
	// 랜덤통화
	@GetMapping("/call")
	public String call() {
		return "/main/call";
	}
	
	// 친구추천
	@GetMapping("/recommend")
	public String recommend() {
		return "/main/recommend";
	}
	
	//친구목록
	@GetMapping("/friend")
	public String friend() {
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
	//remoteid model에 담아서 뷰로 넘김
	@GetMapping("/match")
	public String matched( @RequestParam("remoteid") String remoteid, Model model) {
		//model.addAttribute("localid", localid);
		model.addAttribute("remoteid", remoteid);
		return "/main/match";
		
	}
}
