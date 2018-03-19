<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>Нормативная база <c:out value="${departmentName}"/></title>
  </head>
  <style>
    <%@include file='alt_style.css' %>
  </style>

  <body>
    <h1>Нормативная база <c:out value="${departmentName}"/></h1>
    <div class="index_div">
      <form action="/regulation/all" method="get">
        <button type="submit" class="giantbutton"><img src="paper_add_blue.png" alt="">Показать все документы в базе</button>
      </form>
      <form action="/regulation/search" method="get">
        <button type="submit" class="giantbutton">Расширенный поиск документа в базе</button>
      </form>
      <form action="/regulation/new" method="get">
        <button type="submit" class="giantbutton">Добавление в базу нового документа</button>
      </form>
    </div>
    <footer>
      <p class="footer">ПАО "Укрнефтехимпроект", отдел <c:out value="${departmentName}"/>, Киев, 2018</p>
    </footer>
  </body>
</html>