package com.Quizz.dto;
import java.util.List;

public class QuizResponseDTO {
    private Integer quizId;
    private String title;
    private List<QuestionDTO> questions;

    public QuizResponseDTO(Integer quizId, String title, List<QuestionDTO> questions) {
        this.quizId = quizId;
        this.title = title;
        this.questions = questions;
    }

    public Integer getQuizId() { return quizId; }

    public String getTitle() { return title; }

    public List<QuestionDTO> getQuestions() { return questions; }
}
