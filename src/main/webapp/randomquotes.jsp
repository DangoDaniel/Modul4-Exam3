<%--
  Created by IntelliJ IDEA.
  User: dango
  Date: 07.01.2023
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Random Quotes</title>
</head>
<body>

<p>Losowy cytat</p>

Cytat: <c:out value="${randomQuote.content}"/> </br>
Autor: <c:out value="${randomQuote.author}"/> </br>

</body>
</html>
