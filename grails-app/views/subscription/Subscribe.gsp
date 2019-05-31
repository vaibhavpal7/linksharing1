<%--
  Created by IntelliJ IDEA.
  User: vaibhav
  Date: 5/31/19
  Time: 5:31 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>View Topics</title>
</head>

<body>

<g:each in="${topicList}" var="topic">
    <a href="${createLink(controller: "subscription",action:"addSubscription",id:"${topic.id}" )}">${topic.name}</a>
</g:each>



</body>
</html>