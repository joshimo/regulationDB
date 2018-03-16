<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>Нормативная база КИП</title>
  </head>
  <style>
    <%@include file='alt_style.css' %>
  </style>

  <body>
    <h1>Нормативная база КИП</h1>
    <div class="index_div">
      <form action="/all" method="get">
        <button type="submit" class="giantbutton">Показать все документы в базе</button>
      </form>
      <form action="/search" method="get">
        <button type="submit" class="giantbutton">Расширенный поиск документа в базе</button>
      </form>
      <form action="/new" method="get">
        <button type="submit" class="giantbutton">Добавление в базу нового документа</button>
      </form>
    </div>

  </body>
</html>