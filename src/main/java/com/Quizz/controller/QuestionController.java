package com.Quizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Quizz.model.Question;
import com.Quizz.service.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/quiz")
    public ModelAndView showQuiz(@RequestParam Integer quizId) {

        List<Question> questions =
                questionService.getQuestionsByQuizId(quizId);

        ModelAndView mv = new ModelAndView();

        mv.setViewName("quiz");

        mv.addObject("questions", questions);

        return mv;
    }
}