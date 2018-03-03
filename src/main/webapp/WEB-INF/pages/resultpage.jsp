<%@ page import="java.util.List" %>
<%@ page import="regulation.datamodel.DocumentHeader" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% List<DocumentHeader> headers = (ArrayList<DocumentHeader>) request.getAttribute("headers"); %>

<html>
<head>
    <title>Нормативная база КИП</title>
</head>
<style>
    <%@include file='style.css' %>
</style>

<body>
    <h1>Результаты поиска в базе</h1>
    <div>
        <table>
            <tr>
                <th rowspan="2" style="width: 3%;">№</th>
                <th rowspan="2" style="width: 15%;">Название</th>
                <th rowspan="2" style="width: 35%;">Описание</th>
                <th rowspan="2" style="width: 5%;">Тип</th>
                <th colspan="4" style="width: 10%;">Область действия</th>
                <th rowspan="2" style="width: 20%;">Примечание</th>
                <th rowspan="2" style="width: 6%;">Ссылка для скачивания</th>
                <th rowspan="2" style="width: 6%;">Подробно</th>
            </tr>
            <tr>
                <th>UA</th>
                <th>RU</th>
                <th>KZ</th>
                <th>EU</th>
            </tr>
            <% for (DocumentHeader header : headers) { %>
            <tr>
                <td class="tdc"><%=header.getDocNum()%></td>
                <td class="tdl"><%=header.getDocName()%></td>
                <td class="tdl"><%=header.getDocDescription()%></td>
                <td class="tdc"><%=header.getDocType()%></td>
                <td class="tdc"><%=header.getMandatoryUA()?"да":"нет"%></td>
                <td class="tdc"><%=header.getMandatoryRU()?"да":"нет"%></td>
                <td class="tdc"><%=header.getMandatoryRK()?"да":"нет"%></td>
                <td class="tdc"><%=header.getMandatoryEU()?"да":"нет"%></td>
                <td class="tdl"><%=header.getNotes()%></td>
                <td class="tdc"><a href="download?id=<%=header.getDocNum()%>">скачать</a></td>
                <td class="tdc"><a href="showdetails?id=<%=header.getDocNum()%>">подробно</a></td>
            </tr>
            <% } %>
        </table>
    </div>
</body>
</html>