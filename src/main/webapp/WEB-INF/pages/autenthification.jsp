<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Авторизация</title>
</head>
<style>
    <%@include file='alt_style.css' %>
</style>
<body>
    <h1>Авторизация</h1>
    <div class = index_div>
        <form action="/regulation/auth" method="post" enctype="multipart/form-data">
            <h4>Имя пользователя:</h4>
            <input type="text" name="userName" size="36" class="input" required/><br/>
            <h4>Пароль:</h4>
            <input type="password" name="userPassword" size="36" class="input" required/><br/><br/><br/>
            <input type="submit" class="bigbutton" value="Авторизироваться"/>
            <input type="submit" class="bigbutton" value="Отмена" onclick="history.back(); return false;"/>
        </form>
    </div>
</body>
</html>