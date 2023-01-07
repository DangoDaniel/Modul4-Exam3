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

<a href="<c:url value="/receiver?name=coder&mail=coder@somemail.com&id=34"/>">Link do servletu receiver</a>
<br>
<a href="<c:url value="/form.jsp"/>">Link do servleru form.jsp</a>
<br>
<a href="<c:url value="/smurfs"/>">Link do servleru smurfs</a>

</body>
</html>
