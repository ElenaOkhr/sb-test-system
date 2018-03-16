package services;

import services.Question;

public interface QuestionService {
    void add(Question questionId);

    void remove(Long questionId);

    void removeAllQuestionsByTestId(Long testId);

    List<Question> getQuestionsByTestId(Long testId);

    Question getQuestion(Long questionId);


}
