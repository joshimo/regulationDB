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
<h1>Поиск документа в базе</h1>
<div class="main_div">
<form action="/search" method="post" enctype="multipart/form-data">
    <h3>Описание документа</h3>
    <div class="inner_div">
        <p>Название документа:</p>
        <input type="text" name="docName" /><br/>
        <p>Краткое описание документа:</p>
        <input type="text" name="docDescription" /><br/>
        <p>Тип документа:</p>
        <input type="text" name="docType" /><br/>
    </div>
    <h3>Область действия документа</h3>
    <div class="inner_div">
        <input type="checkbox" name="mandatoryUA">Действует в Украине<br/>
        <input type="checkbox" name="mandatoryRU">Действует в России<br/>
        <input type="checkbox" name="mandatoryRK">Действует в Казахстане<br/>
        <input type="checkbox" name="mandatoryEU">Действует в EC<br/>
        <input type="checkbox" name="isUpToDate">Действует<br/>
    </div>
    <h3>Область применения документа</h3>
    <div class="inner_div">
        <input type="checkbox" name="udf01"><c:out value="${udfMapping.UDF01_VALUE}"/><br/>
        <input type="checkbox" name="udf02"><c:out value="${udfMapping.UDF02_VALUE}"/><br/>
        <input type="checkbox" name="udf03"><c:out value="${udfMapping.UDF03_VALUE}"/><br/>
        <input type="checkbox" name="udf04"><c:out value="${udfMapping.UDF04_VALUE}"/><br/>
        <input type="checkbox" name="udf05"><c:out value="${udfMapping.UDF05_VALUE}"/><br/>
        <input type="checkbox" name="udf06"><c:out value="${udfMapping.UDF06_VALUE}"/><br/>
        <input type="checkbox" name="udf07"><c:out value="${udfMapping.UDF07_VALUE}"/><br/>
        <input type="checkbox" name="udf08"><c:out value="${udfMapping.UDF08_VALUE}"/><br/>
        <input type="checkbox" name="udf09"><c:out value="${udfMapping.UDF09_VALUE}"/><br/>
        <input type="checkbox" name="udf10"><c:out value="${udfMapping.UDF10_VALUE}"/><br/>
        <input type="checkbox" name="udf11"><c:out value="${udfMapping.UDF11_VALUE}"/><br/>
        <input type="checkbox" name="udf12"><c:out value="${udfMapping.UDF12_VALUE}"/><br/>
        <input type="checkbox" name="udf13"><c:out value="${udfMapping.UDF13_VALUE}"/><br/>
        <input type="checkbox" name="udf14"><c:out value="${udfMapping.UDF14_VALUE}"/><br/>
        <input type="checkbox" name="udf15"><c:out value="${udfMapping.UDF15_VALUE}"/><br/>
        <input type="checkbox" name="udf16"><c:out value="${udfMapping.UDF16_VALUE}"/><br/>
        <input type="checkbox" name="udf17"><c:out value="${udfMapping.UDF17_VALUE}"/><br/>
        <input type="checkbox" name="udf18"><c:out value="${udfMapping.UDF18_VALUE}"/><br/>
        <input type="checkbox" name="udf19"><c:out value="${udfMapping.UDF19_VALUE}"/><br/>
        <input type="checkbox" name="udf20"><c:out value="${udfMapping.UDF20_VALUE}"/><br/>
        <input type="checkbox" name="udf21"><c:out value="${udfMapping.UDF21_VALUE}"/><br/>
        <input type="checkbox" name="udf22"><c:out value="${udfMapping.UDF22_VALUE}"/><br/>
        <input type="checkbox" name="udf23"><c:out value="${udfMapping.UDF23_VALUE}"/><br/>
        <input type="checkbox" name="udf24"><c:out value="${udfMapping.UDF24_VALUE}"/><br/>
        <input type="checkbox" name="udf25"><c:out value="${udfMapping.UDF25_VALUE}"/><br/>
        <input type="checkbox" name="udf26"><c:out value="${udfMapping.UDF26_VALUE}"/><br/>
        <input type="checkbox" name="udf27"><c:out value="${udfMapping.UDF27_VALUE}"/><br/>
        <input type="checkbox" name="udf28"><c:out value="${udfMapping.UDF28_VALUE}"/><br/>
        <input type="checkbox" name="udf29"><c:out value="${udfMapping.UDF29_VALUE}"/><br/>
        <input type="checkbox" name="udf30"><c:out value="${udfMapping.UDF30_VALUE}"/><br/>
        <input type="checkbox" name="udf31"><c:out value="${udfMapping.UDF31_VALUE}"/><br/>
        <input type="checkbox" name="udf32"><c:out value="${udfMapping.UDF32_VALUE}"/><br/>
    </div>
    <h3>Ключевые слова (#hash_tags):</h3>
    <div class="inner_div">
        <input type="text" name="hashTags" size="160"/><br/>
    </div>
    <br/>
    <div class="button_div">
        <input type="submit" class="bigbutton" value="Искать"/>
        <button type="cancel" class="bigbutton" onclick="history.back(); return false;">Вернуться назад</button>
    </div>
</form>
</div>
</body>
</html>
