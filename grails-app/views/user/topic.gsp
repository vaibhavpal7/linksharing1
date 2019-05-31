<%--
  Created by IntelliJ IDEA.
  User: vaibhav
  Date: 5/30/19
  Time: 2:40 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<g:form action="addTopic" id="${user.id}">
    <fieldset class="form">
    <legend>Add Topic</legend>
    <label for="name">Name</label>
    <g:textField name="name"></g:textField>
    <select name="visibility">
        <option value="Public">Public</option>
        <option value="Private">Private</option>
      </select><br>
        <select name="seriousness">
            <option value="Serious">Serious</option>
            <option value="VerySerious">Very Serious</option>
            <option value="Casual">Casual</option>
        </select>
%{--    <select name="seriousness">--}%
%{--        <option value="Serious">Serious</option>--}%
%{--        <option value="VerySerious">VerySerious</option>--}%
%{--        <option value="Casual">Casual</option>--}%
%{--    </select>--}%
    <g:submitButton name="Submit"></g:submitButton>
    </fieldset>

</g:form>
</body>
</html>