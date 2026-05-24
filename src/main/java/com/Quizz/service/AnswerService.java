package com.Quizz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Quizz.model.Answer;
import com.Quizz.model.Option;
import com.Quizz.repository.AnswerRepository;

@Service
public class AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    public void saveAnswers(List<Answer> answers) {

        answerRepository.saveAll(answers);
    }

    public int calculateScore(List<Answer> answers) {

        int score = 0;

        for(Answer answer : answers) {

            Option option =
                    answer.getSelectedOption();

            if(option.getIsCorrect()) {
                score++;
            }
        }

        return score;
    }
}