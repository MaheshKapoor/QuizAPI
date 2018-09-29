package com.quizapp.serviceImpl;

import com.google.gson.JsonObject;
import com.quizapp.model.Question;
import com.quizapp.model.QuestionResponse;

import java.util.List;

/**
 * Created by abc on 9/28/2018.
 */
public interface IQuestionService {
    QuestionResponse getQuestions(String category) throws Exception;
    List getAnswers(String[] questionId) throws Exception;
}
