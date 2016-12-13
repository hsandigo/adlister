<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: humbertosandigo
  Date: 12/13/16
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>
<% counter += 1; %>

<html>
<head>
    <title>Hello world from JSP.</title>
    <link href="CSS/style.css" rel="stylesheet">
</head>
<body>

<h1>Hello ${param.name}</h1>
<h2> You have viewed this page <%= counter%> times!</h2>

<h3>Names</h3>
<c: if test="${names.isEmpty()}">
    <h4>There are no names</h4>
</c:>

<c:choose>
    <c:when test="${names.isEmpty()}">
        <h4>There are no names</h4>
    </c:when>
    <c:otherwise>
        <p>There are some names</p>
    </c:otherwise>
</c:choose>
<c:forEach var="name" items="${names}">
    <p>${name}</p>
</c:forEach>

</body>
</html>
