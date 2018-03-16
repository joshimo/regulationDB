
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Нормативная база КИП</title>
</head>
<style>
    <%@include file='alt_style.css' %>
</style>

<body>
    <h1>Результаты поиска в базе</h1>
    <div>
        <table>
            <tr>
                <th rowspan="2" style="width: 3%;">№</th>
                <th rowspan="2" style="width: 15%;">Название</th>
                <th rowspan="2" style="width: 25%;">Описание</th>
                <th rowspan="2" style="width: 5%;">Тип</th>
                <th colspan="4" style="width: 10%;">Область действия</th>
                <th rowspan="2" style="width: 32%;">Примечание</th>
                <th rowspan="2" colspan="2" style="width: 10%;">Ссылки</th>
            </tr>
            <tr>
                <th>UA</th>
                <th>RU</th>
                <th>KZ</th>
                <th>EU</th>
            </tr>
            <c:forEach items="${headers}" var="hdr">
            <tr>
                <td class="tdc"><c:out value="${hdr.docNum}"/></td>
                <td class="tdl"><c:out value="${hdr.docName}"/></td>
                <td class="tdl"><c:out value="${hdr.docDescription}"/></td>
                <td class="tdc"><c:out value="${hdr.docType}"/></td>
                <c:if test="${hdr.mandatoryUA == true}"><td class="tdc">Да</td></c:if>
                <c:if test="${hdr.mandatoryUA == false}"><td class="tdc">Нет</td></c:if>
                <c:if test="${hdr.mandatoryRU == true}"><td class="tdc">Да</td></c:if>
                <c:if test="${hdr.mandatoryRU == false}"><td class="tdc">Нет</td></c:if>
                <c:if test="${hdr.mandatoryRK == true}"><td class="tdc">Да</td></c:if>
                <c:if test="${hdr.mandatoryRK == false}"><td class="tdc">Нет</td></c:if>
                <c:if test="${hdr.mandatoryEU == true}"><td class="tdc">Да</td></c:if>
                <c:if test="${hdr.mandatoryEU == false}"><td class="tdc">Нет</td></c:if>
                <td class="tdl"><c:out value="${hdr.notes}"/></td>
                <td class="tdc"><a href="download?id=<c:out value="${hdr.docNum}"/>">скачать</a></td>
                <td class="tdc"><a href="showdetails?id=<c:out value="${hdr.docNum}"/>">подробно</a></td>
            </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>