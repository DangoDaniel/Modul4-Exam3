<%--
  Created by IntelliJ IDEA.
  User: dango
  Date: 07.01.2023
  Time: 08:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Zadanie 1</h1>
<a href="<c:url value="/receiver?name=coder&mail=coder@somemail.com&id=34"/>">Link do servletu receiver</a><br>
<a href="<c:url value="/form.jsp"/>">Link do servleru form.jsp</a><br>

<h1>Zadanie 3</h1>
<a href="<c:url value="/smurfs"/>">Smerfy</a><br>
<h1>Zadanie 4</h1>
<a href="<c:url value="/addquote"/>">Dodaj cytat</a><br>
<a href="<c:url value="/allquotes"/>">Wszystkie cytaty</a><br>
<a href="<c:url value="/randomquote"/>">Losowy cytat</a>



</body>
</html>
