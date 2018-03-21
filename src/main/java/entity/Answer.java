package entity;

import java.io.Serializable;
import java.text.Collator;
import java.util.Locale;

public class Answer implements Serializable {
    private long id;
    private String text;
    private Boolean isRight;
    private long questionId;

    public Answer(String text, Boolean isRight, long questionId) {
        this.text = text;
        this.isRight = isRight;
        this.questionId = questionId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getRight() {
        return isRight;
    }

    public void setRight(Boolean right) {
        isRight = right;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "text='" + text + '\'' +
                '}';
    }
}
