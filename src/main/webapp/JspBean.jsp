<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.HelloHelper" %>
<html>
<body>
    <h1><jsp:useBean id="helper" class="com.example.HelloHelper" scope= "application"/>

    <%= helper.getGreeting(request.getLocale()) %> ${param.name}</h1>
</body>
</html>
