package com.Quizz.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Quizz.model.Question;

public interface QuestionRepository extends JpaRepository<Question,Integer> {

    List<Question> findByQuizId(Integer quizId);

}