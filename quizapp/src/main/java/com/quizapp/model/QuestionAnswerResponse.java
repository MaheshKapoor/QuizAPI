package com.quizapp.model;

import java.util.List;

/**
 * Created by abc on 10/4/2018.
 */
public class QuestionAnswerResponse {
    private List<QuestionWithAnswer> data;

    public List<QuestionWithAnswer> getData() {
        return data;
    }

    public void setData(List<QuestionWithAnswer> data) {
        this.data = data;
    }
}
