<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/loginStyle.css">
</head>
<body>
<div id="login-form-wrap">
  <h2>Se connecter</h2>
  <form id="login-form" method="POST" action="./login">
    <p>
    <input type="email" id="email" name="email" placeholder="Adresse Email" required><i class="validation"><span></span><span></span></i>
    </p>
    <p>
    <input type="password" id="password" name="password" placeholder="Mot de passe" required><i class="validation"><span></span><span></span></i>
    </p>
    <p>
    <input type="submit" id="login" value="Se connecter" >
    </p>
  </form>
  <div id="create-account-wrap">
    <p>Pas un membre? <a href="#">Demander un compte</a><p>
  </div>
</div>
  
</body>
</html>