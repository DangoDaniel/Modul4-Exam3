<%--
  Created by IntelliJ IDEA.
  User: dango
  Date: 07.01.2023
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Homepage</title>
</head>
<body>

<h1>Witaj na stronie</h1>

<c:if test="${empty cookie.agree}">
    <a href="<c:url value="/homepage?agree=yes"/>">Informujemy, że ta strona korzysta z plików cookies. </a><br>
</c:if>

</body>
</html>
