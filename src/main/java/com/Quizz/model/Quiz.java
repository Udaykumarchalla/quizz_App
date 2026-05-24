package com.Quizz.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String description;

    @Column(name = "time_limit")
    private Integer timeLimit;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<Question> questions;

    public Quiz() {}

    public Integer getId() { return id; }

    public String getTitle() { return title; }

    public String getDescription() { return description; }

    public Integer getTimeLimit() { return timeLimit; }

    public List<Question> getQuestions() { return questions; }

    public void setId(Integer id) { this.id = id; }

    public void setTitle(String title) { this.title = title; }

    public void setDescription(String description) { this.description = description; }

    public void setTimeLimit(Integer timeLimit) { this.timeLimit = timeLimit; }

    public void setQuestions(List<Question> questions) { this.questions = questions; }
}