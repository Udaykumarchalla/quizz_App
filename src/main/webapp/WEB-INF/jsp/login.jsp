<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Login</title>

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(135deg, #4e73df, #1cc88a);
            height: 100vh;
        }
        .login-card {
            max-width: 400px;
            margin: auto;
            margin-top: 8%;
            padding: 30px;
            border-radius: 12px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
            background: #fff;
        }
        .toggle-password {
            cursor: pointer;
        }
    </style>
</head>

<body>

<div class="container">
    <div class="login-card">

        <h3 class="text-center mb-4">Sign In</h3>

        <!-- Global Error -->
        <c:if test="${not empty error}">
            <div class="alert alert-danger text-center">
                ${error}
            </div>
        </c:if>

        <form method="post" action="/login">

            <!-- Email -->
            <div class="form-floating mb-3">
                <input type="email" required class="form-control" id="email" name="email" placeholder="name@example.com" value="bob@gmail.com">
                <label for="email">Email address</label>

                <!-- Spring field error -->
                <c:if test="${not empty emailError}">
                    <div class="text-danger small">${emailError}</div>
                </c:if>
            </div>

            <!-- Password -->
            <div class="form-floating mb-3 position-relative">
                <input type="password" class="form-control" id="password" required name="password" placeholder="Password" value="5296487">
                <label for="password">Password</label>

                <!-- Toggle -->
                <span class="position-absolute top-50 end-0 translate-middle-y me-3 toggle-password"
                      onclick="togglePassword()">
                    👁️
                </span>

                <!-- Spring field error -->
                <c:if test="${not empty passwordError}">
                    <div class="text-danger small">${passwordError}</div>
                </c:if>
            </div>

            <!-- Remember + Forgot -->
            <div class="d-flex justify-content-between mb-3">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" name="rememberMe" id="rememberMe">
                    <label class="form-check-label" for="rememberMe">
                        Remember me
                    </label>
                </div>

                <a href="#" class="text-decoration-none">
                    Forgot password?
                </a>
            </div>

            <!-- Submit -->
            <button type="submit" class="btn btn-primary w-100">
                Login
            </button>

        </form>

    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<script>
    function togglePassword() {
        const passwordField = document.getElementById("password");
        passwordField.type = passwordField.type === "password" ? "text" : "password";
    }
</script>

</body>
</html>