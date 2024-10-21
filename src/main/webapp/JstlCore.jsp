<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
  <h1>
    <c:set var="languageCode" value="${(header['accept-language'].split(','))[0]}"/>
    <c:choose>

      <c:when test="${languageCode == 'fr'}">
        Bonjour
      </c:when>

      <c:when test="${languageCode == 'de'}">
        Guten Tag
      </c:when>

      <c:otherwise>
        Hello
      </c:otherwise>

    </c:choose>

    ${param.name}
  </h1>
</body>
</html>
