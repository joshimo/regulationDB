<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Нормативная база КИП</title>
</head>
<style>
    <%@include file='alt_style.css' %>
</style>
<body>
<h1>Подробное описание документа</h1>
<div class="main_div">
<div>
    <h3>Описание документа</h3>
    <div class="inner_div">
        <p>Название документа:<br/>
            <b><i><c:out value="${hdr.docName}"/></i></b>
        </p>
        <p>Краткое описание документа:<br/>
            <b><i><c:out value="${hdr.docDescription}"/></i></b>
        </p>
        <p>Тип документа:<br/>
            <b><i><c:out value="${hdr.docType}"/></i></b>
        </p>
    </div>
    <h3>Область действия документа</h3>
    <div class="inner_div">
        <input type="checkbox" name="mandatoryUA" <c:if test="${hdr.mandatoryUA}"><c:out value="checked"/></c:if> disabled>Действует в Украине<br/>
        <input type="checkbox" name="mandatoryRU" <c:if test="${hdr.mandatoryRU}"><c:out value="checked"/></c:if> disabled>Действует в России<br/>
        <input type="checkbox" name="mandatoryRK" <c:if test="${hdr.mandatoryRK}"><c:out value="checked"/></c:if> disabled>Действует в Казахстане<br/>
        <input type="checkbox" name="mandatoryEU" <c:if test="${hdr.mandatoryEU}"><c:out value="checked"/></c:if> disabled>Действует в EC<br/>
        <input type="checkbox" name="upToDate" <c:if test="${hdr.upToDate}"><c:out value="checked"/></c:if> disabled>Действует<br/>
    </div>
    <h3>Область применения документа</h3>
    <div class="inner_div">
        <c:if test="${hdr.udf01}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF01_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf02}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF02_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf03}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF03_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf04}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF04_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf05}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF05_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf06}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF06_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf07}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF07_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf08}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF08_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf09}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF09_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf10}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF10_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf11}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF11_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf12}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF12_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf13}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF13_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf14}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF14_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf15}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF15_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf16}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF16_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf17}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF17_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf18}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF18_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf19}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF19_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf20}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF20_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf21}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF21_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf22}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF22_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf23}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF23_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf24}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF24_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf25}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF25_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf26}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF26_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf27}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF27_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf28}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF28_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf29}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF29_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf30}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF30_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf31}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF31_VALUE}"/><br/></c:if>
        <c:if test="${hdr.udf32}"><input type="checkbox" checked disabled><c:out value="${udfMapping.UDF32_VALUE}"/><br/></c:if>
    </div>
    <h3>Ключевые слова (#hash_tags)</h3>
    <div class="inner_div">
        <p><b><i><c:out value="${hdr.hashTags}"/></i></b></p>
    </div>
    <h3>Примечания и уточнения</h3>
    <div class="inner_div">
        <b><i><c:out value="${hdr.notes}"/></i></b>
    </div>
    <h3>Файл:</h3>
    <div class="inner_div">
        <p>Имя файла: <b><i><c:out value="${hdr.docFileName}"/></i></b></p>
        <p>Размер: <b><i><c:out value="${hdr.fileSize / 1000}k"/></i></b></p>
    </div>
    <br/>
</div>
<div class="button_div">
    <form action="edit" method="get">
        <button type="submit" class="bigbutton" name="id" value=<c:out value="${hdr.docNum}" />>Редактировать документ</button>
        <button type="submit" class="bigbutton" onclick="history.back(); return false;">Вернуться назад</button>
    </form>
</div>
</div>
</body>
</html>