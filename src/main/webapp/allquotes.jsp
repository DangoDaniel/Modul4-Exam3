<%--
  Created by IntelliJ IDEA.
  User: dango
  Date: 07.01.2023
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Quotes</title>
</head>
<body>



<c:if test="${quotes != null}">
    <p>Cytaty: </p>
  <table>
    <thead>
        <td>Cytat</td>
        <td>Autor</td>
    </thead>

    <tbody>
    <c:forEach items="${quotes}" var ="quote">
        <tr>
            <td>${quote.content}</td>
            <td>${quote.author}</td>
        </tr>

  </c:forEach>

    </tbody>
  </table>
</c:if>

</body>
</html>
