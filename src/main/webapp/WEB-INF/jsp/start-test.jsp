<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Start Test</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(135deg, #667eea, #764ba2);
            height: 100vh;
        }
        .card-box {
            max-width: 600px;
            margin: auto;
            margin-top: 8%;
            padding: 30px;
            border-radius: 12px;
            background: white;
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        }
    </style>
</head>

<body>

<div class="container">
    <div class="card-box">

        <h3 class="text-center mb-3">📝 Online Test Instructions</h3>

        <ul class="list-group mb-4">
            <li class="list-group-item">⏱ Total Duration: <b>30 minutes</b></li>
            <li class="list-group-item">📊 Total Questions: <b>20</b></li>
            <li class="list-group-item">❌ No negative marking</li>
            <li class="list-group-item">🔒 Do not refresh the page during test</li>
            <li class="list-group-item">📶 Ensure stable internet connection</li>
        </ul>

        <div class="form-check mb-3">
            <input class="form-check-input" type="checkbox" id="agree">
            <label class="form-check-label">
                I have read and agree to the instructions
            </label>
        </div>

        <button class="btn btn-success w-100" id="startBtn" disabled onclick="startTest()">
            Start Test
        </button>

    </div>
</div>

<script>
    const checkbox = document.getElementById("agree");
    const button = document.getElementById("startBtn");

    checkbox.addEventListener("change", function() {
        button.disabled = !this.checked;
    });

    function startTest() {
        window.location.href = "/question/quiz?quizId=1";
    }
</script>

</body>
</html>