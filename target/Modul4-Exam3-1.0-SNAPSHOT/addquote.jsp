<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Add Quote</title>

</head>
<body>

<form action="/addquote" method="post">
    <label>Autor
    <input type="text" name ="author"/>
    </label>

    <label>Cytat
        <input type="text" name ="quote"/>
    </label>

    <input type="submit" value="Wyślij"/>

</form>
</body>
</html>
