<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 22.02.2022
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorized page</title>
</head>
<body>

<h1>Hello, ${sessionScope.login} with password: ${sessionScope.password}: ${sessionScope.user.lastName}</h1>

</body>
</html>
