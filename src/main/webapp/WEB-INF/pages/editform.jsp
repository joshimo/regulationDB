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
<form action="/save" method="post">
    <h3>Описание документа</h3>
    <div class="inner_div">
        <input type="text" name="docNum" size="8" value=<c:out value="${hdr.docNum}"/> class="hidden"/>
        <p>Название документа:</p>
        <textarea rows="3" cols="100" name="docName" required><c:out value="${hdr.docName}"/></textarea><br/>
        <p>Краткое описание документа:</p>
        <textarea rows="3" cols="100" name="docDescription" required><c:out value="${hdr.docDescription}"/></textarea><br/>
        <p>Тип документа:</p>
        <input type="text" name="docType" size="48" value="<c:out value="${hdr.docType}"/>" required/><br/>
    </div>
    <h3>Область действия документа:</h3>
    <div class="inner_div">
        <input type="checkbox" name="mandatoryUA" <c:if test="${hdr.mandatoryUA}"><c:out value="checked"/></c:if>>Действует в Украине<br/>
        <input type="checkbox" name="mandatoryRU" <c:if test="${hdr.mandatoryRU}"><c:out value="checked"/></c:if>>Действует в России<br/>
        <input type="checkbox" name="mandatoryRK" <c:if test="${hdr.mandatoryRK}"><c:out value="checked"/></c:if>>Действует в Казахстане<br/>
        <input type="checkbox" name="mandatoryEU" <c:if test="${hdr.mandatoryEU}"><c:out value="checked"/></c:if>>Действует в EC<br/>
        <input type="checkbox" name="upToDate" <c:if test="${hdr.upToDate}"><c:out value="checked"/></c:if>>Действует<br/>
    </div>
    <h3>Область применения документа:</h3>
    <div class="inner_div">
        <input type="checkbox" name="udf01" <c:if test="${hdr.udf01}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF01_VALUE}"/><br/>
        <input type="checkbox" name="udf02" <c:if test="${hdr.udf02}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF02_VALUE}"/><br/>
        <input type="checkbox" name="udf03" <c:if test="${hdr.udf03}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF03_VALUE}"/><br/>
        <input type="checkbox" name="udf04" <c:if test="${hdr.udf04}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF04_VALUE}"/><br/>
        <input type="checkbox" name="udf05" <c:if test="${hdr.udf05}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF05_VALUE}"/><br/>
        <input type="checkbox" name="udf06" <c:if test="${hdr.udf06}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF06_VALUE}"/><br/>
        <input type="checkbox" name="udf07" <c:if test="${hdr.udf07}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF07_VALUE}"/><br/>
        <input type="checkbox" name="udf08" <c:if test="${hdr.udf08}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF08_VALUE}"/><br/>
        <input type="checkbox" name="udf09" <c:if test="${hdr.udf09}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF09_VALUE}"/><br/>
        <input type="checkbox" name="udf10" <c:if test="${hdr.udf10}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF10_VALUE}"/><br/>
        <input type="checkbox" name="udf11" <c:if test="${hdr.udf11}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF11_VALUE}"/><br/>
        <input type="checkbox" name="udf12" <c:if test="${hdr.udf12}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF12_VALUE}"/><br/>
        <input type="checkbox" name="udf13" <c:if test="${hdr.udf13}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF13_VALUE}"/><br/>
        <input type="checkbox" name="udf14" <c:if test="${hdr.udf14}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF14_VALUE}"/><br/>
        <input type="checkbox" name="udf15" <c:if test="${hdr.udf15}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF15_VALUE}"/><br/>
        <input type="checkbox" name="udf16" <c:if test="${hdr.udf16}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF16_VALUE}"/><br/>
        <input type="checkbox" name="udf17" <c:if test="${hdr.udf17}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF17_VALUE}"/><br/>
        <input type="checkbox" name="udf18" <c:if test="${hdr.udf18}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF18_VALUE}"/><br/>
        <input type="checkbox" name="udf19" <c:if test="${hdr.udf19}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF19_VALUE}"/><br/>
        <input type="checkbox" name="udf20" <c:if test="${hdr.udf20}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF20_VALUE}"/><br/>
        <input type="checkbox" name="udf21" <c:if test="${hdr.udf21}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF21_VALUE}"/><br/>
        <input type="checkbox" name="udf22" <c:if test="${hdr.udf22}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF22_VALUE}"/><br/>
        <input type="checkbox" name="udf23" <c:if test="${hdr.udf23}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF23_VALUE}"/><br/>
        <input type="checkbox" name="udf24" <c:if test="${hdr.udf24}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF24_VALUE}"/><br/>
        <input type="checkbox" name="udf25" <c:if test="${hdr.udf25}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF25_VALUE}"/><br/>
        <input type="checkbox" name="udf26" <c:if test="${hdr.udf26}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF26_VALUE}"/><br/>
        <input type="checkbox" name="udf27" <c:if test="${hdr.udf27}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF27_VALUE}"/><br/>
        <input type="checkbox" name="udf28" <c:if test="${hdr.udf28}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF28_VALUE}"/><br/>
        <input type="checkbox" name="udf29" <c:if test="${hdr.udf29}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF29_VALUE}"/><br/>
        <input type="checkbox" name="udf30" <c:if test="${hdr.udf30}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF30_VALUE}"/><br/>
        <input type="checkbox" name="udf31" <c:if test="${hdr.udf31}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF31_VALUE}"/><br/>
        <input type="checkbox" name="udf32" <c:if test="${hdr.udf32}"><c:out value="checked"/></c:if>><c:out value="${udfMapping.UDF32_VALUE}"/><br/>
    </div>
    <h3>Ключевые слова (#hash_tags):</h3>
    <div class="inner_div">
        <input type="text" name="hashTags" size="160" value="<c:out value="${hdr.hashTags}"/>"/><br/>
    </div>
    <h3>Примечания и уточнения:</h3>
    <div class="inner_div">
        <textarea rows="3" cols="100" name="notes"><c:out value="${hdr.notes}"/></textarea><br/>
    </div>
    <h3>Файл:</h3>
    <div class="inner_div">
        <p>Имя файла: <b><i><c:out value="${hdr.docFileName}"/></i></b></p>
        <p>Размер: <b><i><c:out value="${hdr.fileSize / 1000}k" /></i></b></p>
    </div>
    <br/>
    <div class="button_div">
        <input type="submit" class="bigbutton" value="Сохранить"/>
        <button class="bigbutton" onclick="history.back(); return false;">Отмена</button>
    </div>
</form>
</div>
</body>
</html>