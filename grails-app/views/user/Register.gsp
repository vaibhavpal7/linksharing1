<%--
  Created by IntelliJ IDEA.
  User: vaibhav
  Date: 5/28/19
  Time: 2:39 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Register</title>
</head>


<body>

<g:form action="save">
<fieldset class="form">
    <legend>Register</legend>


<div class="required-indicator">
    <label for="firstname">FirstName: </label>
    <g:textField name="firstname"></g:textField>
</div>
    <div class="required-indicator">
    <label for="lastname">Last Name:</label>
    <g:textField name="lastname"></g:textField>
    </div>
    <div class="required-indicator">
    <label for="email">Email: </label>
<g:textField name="email"></g:textField>
    </div>
    <div class="required-indicator">
    <label for="username">Username: </label>
<g:textField name="username"></g:textField>
    </div>
    <div class="required-indicator">
    <label for="password">Password: </label>
<g:passwordField name="password"></g:passwordField>
    </div>
    <div class="required-indicator">
    <label for="confirmpassword">ConfirmPassword</label>
<g:passwordField name="confirmpassword"></g:passwordField>
    </div>
<g:actionSubmit value="save" name="Register"></g:actionSubmit>
</fieldset>
</g:form>
</body>
</html>