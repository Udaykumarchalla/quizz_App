<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

    <title>Quiz Result</title>

    <style>

        body{
            font-family: Arial;
            background:#f5f5f5;
        }

        .result-box{

            width:400px;
            margin:auto;
            margin-top:100px;

            background:white;

            padding:40px;

            text-align:center;

            border-radius:10px;

            box-shadow:0 0 10px rgba(0,0,0,0.2);
        }

        h1{
            color:green;
        }

    </style>

</head>

<body>

<div class="result-box">

    <h1>Quiz Completed</h1>

    <h2>
        Your Score:
        ${score} / ${total}
    </h2>

</div>

</body>

</html>