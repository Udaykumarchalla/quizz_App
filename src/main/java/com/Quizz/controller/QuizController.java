package com.Quizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Quizz.model.Quiz;
import com.Quizz.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	@Autowired
	private QuizService quizService;

	@GetMapping
	public List<Quiz> getAllQuizzes() {
		return quizService.getAllQuizzes();
	}

	@GetMapping("/{id}")
	public Quiz getQuizById(@PathVariable Integer id) {
		return quizService.getQuizById(id);
	}
}
