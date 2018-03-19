<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ошибка!</title>
</head>
<style>
    <%@include file='alt_style.css' %>
</style>
<body>
<h1 style="color: darkred">Ошибка!</h1>
<div class = index_div>
    <form action="/regulation" method="get" enctype="multipart/form-data">
        <h2><c:out value="${errorText}"/></h2>
        <h2>Причина:</h2>
        <p><c:out value="${stackTrace}"/></p>
        <input type="submit" class="bigbutton" value="На главную страницу"/>
    </form>
</div>
</body>
</html>