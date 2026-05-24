package com.Quizz.model;
import jakarta.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "attempt_id")
    private QuizAttempt attempt;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne
    @JoinColumn(name = "selected_option_id")
    private Option selectedOption;

    public Answer() {}

    public Integer getId() { return id; }

    public QuizAttempt getAttempt() { return attempt; }

    public Question getQuestion() { return question; }

    public Option getSelectedOption() { return selectedOption; }

    public void setId(Integer id) { this.id = id; }

    public void setAttempt(QuizAttempt attempt) { this.attempt = attempt; }

    public void setQuestion(Question question) { this.question = question; }

    public void setSelectedOption(Option selectedOption) { this.selectedOption = selectedOption; }
}