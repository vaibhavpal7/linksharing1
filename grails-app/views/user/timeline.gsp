<%--
  Created by IntelliJ IDEA.
  User: vaibhav
  Date: 5/30/19
  Time: 1:28 AM
--%>

<%@ page import="linksharing1.Subscription" contentType="text/html;charset=UTF-8" %>
<html xmlns:border="http://www.w3.org/1999/xhtml">
<head><style>
div{
    width:300px;

    border: 5px solid grey;
    padding:10px;


}
</style>
    <title>Timeline</title>
</head>

<body>
<div><h1>${user.firstname} ${user.lastname}</h1>
Subscription: ${linksharing1.Subscription.findAllByUser(user).size()}<br>
%{--    Topic: ${linksharing1.Subscription.findAllByUser(user).}--}%

Topic: ${linksharing1.Topic.findAllByUser(user).size()}

<g:link action="topic" id="${user.id}">Add Topic</g:link>
<g:link controller="subscription" action="subscibe">Topics</g:link>
</div>

</body>
</html>