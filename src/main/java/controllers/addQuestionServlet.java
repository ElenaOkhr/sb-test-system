package controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class addQuestionServlet extends HttpServlet {

    private static final String ADD_QUESTION_FORM_JSP = "/addQuestionForm.jsp";
    private static final String ADD_ANSWER_FORM_JSP = "/addAnswerForm.jsp";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher(ADD_ANSWER_FORM_JSP);
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher(ADD_QUESTION_FORM_JSP);
        dispatcher.forward(req, resp);
    }
}