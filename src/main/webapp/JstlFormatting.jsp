<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<html>
<body>
    <jsp:useBean id="now" class="java.util.Date" />
    <fmt:formatDate var="date_time" value="${now}" pattern="EEEE', 'MMMM, dd ' at 'hh:mm aa" />
<h1>
    <c:set var="languageCode" value="${header['accept-language']}"/>
    <c:choose>

        <c:when test="${fn:startsWith(languageCode, 'fr')}">
            Bonjour
        </c:when>

        <c:when test="${fn:startsWith(languageCode, 'de')}">
            Guten Tag
        </c:when>

        <c:otherwise>
            Hello
        </c:otherwise>

    </c:choose>

    ${fn:toUpperCase(param.name)}. It's ${date_time}
</h1>
</body>
</html>
