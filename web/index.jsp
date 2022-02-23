<%--
  Created by IntelliJ IDEA.
  User: dev
  Date: 01-Feb-22
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    String newJSP = new String("loginForm.jsp");
    response.setStatus(response.SC_MOVED_TEMPORARILY);
    response.setHeader("Location", newJSP);
  %>
  </body>
</html>
