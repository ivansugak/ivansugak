<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 22.02.2022
  Time: 23:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SavePage</title>
</head>
<body>
<h1>Please, enter first_name, last_name, email, date_of_birth and put "enter"</h1>

<form action="saveServlet" method="post">

    <label for="first_name">First_name:</label>
    <input type="text" name="first_name" id="first_name"/><br/>
    <label for="last_name">Last_name:</label>
    <input type="last_name" name="last_name" id="last_name"/><br/>
    <label for="email">Email:</label>
    <input type="email" name="email" id="email"/><br/>
    <label for="date_of_birth">Date_of_birth:</label>
    <input type="date_of_birth" name="date_of_birth" id="date_of_birth"/><br/>

    <input type="submit" value="enter">

</form>

<%--<h1>registration completed successfully</h1>--%>

</body>
</html>
