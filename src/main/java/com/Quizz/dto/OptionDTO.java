package com.Quizz.dto;

public class OptionDTO {
	private Integer id;
    private String optionText;

    public OptionDTO(Integer id, String optionText) {
        this.id = id;
        this.optionText = optionText;
    }

    public Integer getId() { return id; }

    public String getOptionText() { return optionText; }
}
