<%--
  Created by IntelliJ IDEA.
  User: dango
  Date: 07.01.2023
  Time: 09:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Smurfs</title>
</head>
<body>

<form action="/smurfs" method="post">
<table>

    <thead>
    <tr>
        <td>name</td>
        <td>attribute</td>
        <td>description</td>
    </tr>
    </thead>

    <tbody>

    <c:forEach items="${SmurfsList}" var="smurfsList">
        <tr>
            <td>${smurfsList.name}</td>
            <td>${smurfsList.attribute}</td>
            <td>${smurfsList.description}</td>
        </tr>
    </c:forEach>

    </tbody>

</table>

</form>

</body>
</html>
