<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Locale" %>
<html>
<body>
    <h1>

        <%
            String name = request.getParameter("name");
            if(name == null) {
                name = "";
            }
            out.println("Hello " + name);
        %>

    </h1>
</body>
</html>
