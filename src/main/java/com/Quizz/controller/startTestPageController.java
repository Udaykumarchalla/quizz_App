package com.Quizz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class startTestPageController {
	@GetMapping("/start-test")
	public String startTestPage(HttpSession session) {
	    if (session.getAttribute("user") == null) {
	        return "redirect:/";
	    }
	    return "start-test";
	}
}
