package com.Quizz.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "question_text")
    private String questionText;

    @Column(name = "question_type")
    private String questionType;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Option> options;

    public Question() {}

    public Integer getId() { return id; }

    public String getQuestionText() { return questionText; }

    public String getQuestionType() { return questionType; }

    public Quiz getQuiz() { return quiz; }

    public List<Option> getOptions() { return options; }

    public void setId(Integer id) { this.id = id; }

    public void setQuestionText(String questionText) { this.questionText = questionText; }

    public void setQuestionType(String questionType) { this.questionType = questionType; }

    public void setQuiz(Quiz quiz) { this.quiz = quiz; }

    public void setOptions(List<Option> options) { this.options = options; }
}