<%--
  Created by IntelliJ IDEA.
  User: vaibhav
  Date: 5/29/19
  Time: 1:47 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
</head>

<body>
<h1>Login</h1>
<form action="${postUrl ?: '/login/authenticate'}" method="POST">
    <div class="required-indicator">
        <label for="username">Username</label>
        <g:textField name="username"></g:textField>
    </div>
    <div class="required-indicator">
        <label for="password">Password</label>
        <g:textField name="password"></g:textField>
    </div>
    <g:submitButton name="login"></g:submitButton>

</form>
<g:link controller="user" action="registration">SignUp</g:link>
</body>
</html>