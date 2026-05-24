package com.Quizz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Quizz.model.Answer;
import com.Quizz.model.Option;
import com.Quizz.model.Question;
import com.Quizz.repository.OptionRepository;
import com.Quizz.repository.QuestionRepository;
import com.Quizz.service.AnswerService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private OptionRepository optionRepository;

    @PostMapping("/submitQuiz")
    public ModelAndView submitQuiz(HttpServletRequest request) {

        List<Question> questions =
                questionRepository.findAll();

        List<Answer> answers =
                new ArrayList<>();

        for(Question q : questions) {

            String optionId =
                    request.getParameter(
                            "question_" + q.getId());

            if(optionId != null) {

                Option option =
                        optionRepository
                        .findById(
                                Integer.parseInt(optionId))
                        .orElse(null);

                Answer answer = new Answer();

                answer.setQuestion(q);

                answer.setSelectedOption(option);

                answers.add(answer);
            }
        }

        answerService.saveAnswers(answers);

        int score =
                answerService.calculateScore(answers);

        ModelAndView mv =
                new ModelAndView();

        mv.setViewName("result");

        mv.addObject("score", score);

        mv.addObject("total",
                questions.size());

        return mv;
    }
}