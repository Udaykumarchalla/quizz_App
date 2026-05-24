package com.Quizz.model;


import jakarta.persistence.*;

@Entity
@Table(name = "option_table")
public class Option {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    @Column(name = "option_text")
	    private String optionText;

	    @Column(name = "is_correct")
	    private Boolean isCorrect;

	    @ManyToOne
	    @JoinColumn(name = "question_id")
	    private Question question;

	    public Option() {}

	    public Integer getId() { return id; }

	    public String getOptionText() { return optionText; }

	    public Boolean getIsCorrect() { return isCorrect; }

	    public Question getQuestion() { return question; }

	    public void setId(Integer id) { this.id = id; }

	    public void setOptionText(String optionText) { this.optionText = optionText; }

	    public void setIsCorrect(Boolean isCorrect) { this.isCorrect = isCorrect; }

	    public void setQuestion(Question question) { this.question = question; }
	}