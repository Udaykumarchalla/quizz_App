package com.Quizz.service;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Quizz.dto.OptionDTO;
import com.Quizz.dto.QuestionDTO;
import com.Quizz.dto.QuizResponseDTO;
import com.Quizz.model.Question;
import com.Quizz.model.Quiz;
import com.Quizz.repository.QuestionRepository;
import com.Quizz.repository.QuizRepository;

@Service
public class QuizService{
	 @Autowired
	    private QuizRepository quizRepository;
	 @Autowired
	 private QuestionRepository questionRepository;

	    public List<Quiz> getAllQuizzes() {
	        return quizRepository.findAll();
	    }
	    
	    public QuizResponseDTO getQuizQuestions(Integer quizId) {

	    	var quiz = quizRepository.findById(quizId).orElseThrow();
	    	

	        List<Question> questions = questionRepository.findByQuizId(quizId);

	        List<QuestionDTO> questionDTOs = questions.stream()
	                .map(q -> new QuestionDTO(
	                        q.getId(),
	                        q.getQuestionText(),
	                        q.getOptions().stream()
	                                .map(o -> new OptionDTO(o.getId(), o.getOptionText()))
	                                .collect(Collectors.toList())
	                ))
	                .collect(Collectors.toList());

	        return new QuizResponseDTO(
	                quiz.getId(),
	                quiz.getTitle(),
	                questionDTOs
	        );	
	   }
	    
	    public Quiz getQuizById(Integer id) {
	        return quizRepository.findById(id).orElse(null);
	    }
}
