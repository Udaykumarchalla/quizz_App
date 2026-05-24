package com.Quizz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Quizz.model.Answer;

public interface AnswerRepository
        extends JpaRepository<Answer, Integer> {

}