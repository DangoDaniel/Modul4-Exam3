<%--
  Created by IntelliJ IDEA.
  User: dango
  Date: 07.01.2023
  Time: 08:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>form.jsp</title>
</head>
<body>

<form action="/receiver" method="get">

    <label>Wpisz imię:
        <input type="text" name = "name"/>
    </label>

    <label>Wpisz email:
        <input type="email" name = "mail"/>
    </label>

    <label>Wpisz id:
        <input type="number" name = "id"/>
    </label>
    <input type="submit" value="Wyślij"/>

</form>

</body>
</html>
