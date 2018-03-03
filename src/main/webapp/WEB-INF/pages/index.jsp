<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>Нормативная база КИП</title>
  </head>
  <style>
    <%@include file='style.css' %>
  </style>

  <body>
    <h1>Нормативная база КИП</h1>
    <div>
      <a href="/search">#Search page</a><br/><br/>
      <a href="/getall">Показать все документы в базе</a><br/><br/>
      <a href="/new">Добавление в базу нового документа</a><br/><br/>
      <a href="/edit">#Edit page</a><br/><br/>
      <a href="/result">#SearchResult page</a><br/><br/>
    </div>

  </body>
</html>