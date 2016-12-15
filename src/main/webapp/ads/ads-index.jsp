<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="ad" items="${ads}">
    <h1>${ad.title}</h1>
    <p>${ad.description}</p>
</c:forEach>
</body>
</html>
