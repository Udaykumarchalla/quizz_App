package com.Quizz.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.Quizz.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
