package com.Quizz.model;
import jakarta.persistence.*;

@Entity
@Table(name = "quiz_attempt")
public class QuizAttempt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer score;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    public QuizAttempt() {}

    public Integer getId() { return id; }

    public Integer getScore() { return score; }

    public User getUser() { return user; }

    public Quiz getQuiz() { return quiz; }

    public void setId(Integer id) { this.id = id; }

    public void setScore(Integer score) { this.score = score; }

    public void setUser(User user) { this.user = user; }

    public void setQuiz(Quiz quiz) { this.quiz = quiz; }
}