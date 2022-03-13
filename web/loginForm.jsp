<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>loginForm</title>
</head>
<body>

<h1>Please, enter login and password</h1>

<form action="login" method="post">

    <label for="login">Login:</label>
    <input type="text" name="login" id="login"/><br/>
    <label for="password">Password:</label>
    <input type="password" name="password" id="password"/><br/>
    <input type="submit" value="enter">
    <input type="button" value="registration" onClick='location.href="savePage.jsp"'>

</form>
</body>
</html>
