package com.Quizz.dto;
import java.util.List;
public class QuestionDTO {

    private Integer id;
    private String questionText;
    private List<OptionDTO> options;

    public QuestionDTO(Integer id, String questionText, List<OptionDTO> options) {
        this.id = id;
        this.questionText = questionText;
        this.options = options;
    }

    public Integer getId() { return id; }

    public String getQuestionText() { return questionText; }

    public List<OptionDTO> getOptions() { return options; }
}
