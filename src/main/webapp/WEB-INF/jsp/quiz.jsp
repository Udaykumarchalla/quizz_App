<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.Quizz.model.Question" %>
<%@ page import="com.Quizz.model.Option" %>

<!DOCTYPE html>

<html>

<head>

    <title>Quiz Application</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>

        body{
            background: #f4f6f9;
        }

        .quiz-container{
            max-width: 800px;
            margin: auto;
            margin-top: 50px;
        }

        .question-card{

            display: none;

            background: white;

            border-radius: 15px;

            padding: 30px;

            box-shadow: 0 5px 15px rgba(0,0,0,0.1);
        }

        .question-card.active{
            display: block;
        }

        .question-title{
            font-size: 24px;
            font-weight: bold;
            margin-bottom: 25px;
        }

        .option-box{

            border:1px solid #ddd;

            border-radius:10px;

            padding:12px;

            margin-bottom:15px;

            transition:0.3s;
        }

        .option-box:hover{
            background:#f8f9fa;
        }

        .navigation-btns{
            margin-top:30px;
        }

        .quiz-header{
            text-align:center;
            margin-bottom:30px;
        }

    </style>

</head>

<body>

<div class="container">

    <div class="quiz-container">

        <div class="quiz-header">

            <h1 class="fw-bold text-primary">
                Online Quiz Test
            </h1>

            <p class="text-muted">
                Answer all questions carefully
            </p>

        </div>

        <form action="/submitQuiz" method="post">

<%
    List<Question> questions =
            (List<Question>) request.getAttribute("questions");

    int qNo = 1;

    for(int i=0; i<questions.size(); i++){

        Question q = questions.get(i);
%>

        <div class="question-card <%= (i == 0) ? "active" : "" %>"
             id="questionCard<%= i %>">

            <div class="question-title">

                Question <%= qNo++ %>

            </div>

            <h4 class="mb-4">
                <%= q.getQuestionText() %>
            </h4>

<%
        for(Option op : q.getOptions()){
%>

            <label class="option-box d-block">

                <input type="radio"
                       class="form-check-input me-2"
                       name="question_<%= q.getId() %>"
                       value="<%= op.getId() %>">

                <%= op.getOptionText() %>

            </label>

<%
        }
%>

            <div class="navigation-btns d-flex justify-content-between">

<%
        if(i > 0){
%>

                <button type="button"
                        class="btn btn-secondary"
                        onclick="previousQuestion(<%= i %>)">

                    Previous

                </button>

<%
        }
        else{
%>

                <div></div>

<%
        }

        if(i < questions.size() - 1){
%>

                <button type="button"
                        class="btn btn-primary"
                        onclick="nextQuestion(<%= i %>)">

                    Next

                </button>

<%
        }
        else{
%>

                <button type="submit"
                        class="btn btn-success">

                    Submit Quiz

                </button>

<%
        }
%>

            </div>

        </div>

<%
    }
%>

        </form>

    </div>

</div>

<script>

    function nextQuestion(current){

        document
            .getElementById("questionCard" + current)
            .classList
            .remove("active");

        document
            .getElementById("questionCard" + (current + 1))
            .classList
            .add("active");
    }

    function previousQuestion(current){

        document
            .getElementById("questionCard" + current)
            .classList
            .remove("active");

        document
            .getElementById("questionCard" + (current - 1))
            .classList
            .add("active");
    }

</script>

</body>

</html>