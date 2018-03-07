<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Нормативная база КИП</title>
</head>
<style>
    <%@include file='style.css' %>
</style>
<body>
<h1>Подробное описание документа</h1>
<form action="/save" method="post">
    <fieldset>
        <legend>Описание документа</legend>
        <input type="text" name="docNum" size="8" value=<c:out value="${hdr.docNum}"/> hidden/><br/>
        <p>Название документа:</p>
        <input type="text" name="docName" size="100" value="<c:out value="${hdr.docName}"/>"  required/><br/>
        <p>Краткое описание документа:</p>
        <input type="text" name="docDescription" size="100" value="<c:out value="${hdr.docDescription}"/>" required/><br/>
        <p>Тип документа:</p>
        <input type="text" name="docType" size="100" value="<c:out value="${hdr.docType}"/>" required/><br/>
    </fieldset>
    <fieldset>
        <legend>Область действия документа:</legend>
        <input type="checkbox" name="mandatoryUA" <c:if test="${hdr.mandatoryUA == true}"><c:out value="checked"/></c:if>>Действует в Украине</input><br/>
        <input type="checkbox" name="mandatoryRU" <c:if test="${hdr.mandatoryRU == true}"><c:out value="checked"/></c:if>>Действует в России</input><br/>
        <input type="checkbox" name="mandatoryRK" <c:if test="${hdr.mandatoryRK == true}"><c:out value="checked"/></c:if>>Действует в Казахстане</input><br/>
        <input type="checkbox" name="mandatoryEU" <c:if test="${hdr.mandatoryEU == true}"><c:out value="checked"/></c:if>>Действует в EC</input><br/>
    </fieldset>
    <fieldset>
        <legend>Область применения документа:</legend>
        <input type="checkbox" name="applicationGeneral" <c:if test="${hdr.applicationGeneral == true}"><c:out value="checked"/></c:if>>Общая</input><br/>
        <input type="checkbox" name="applicationMeasurement" <c:if test="${hdr.applicationMeasurement == true}"><c:out value="checked"/></c:if>>Технологические измерения</input><br/>
        <input type="checkbox" name="applicationInstrumentation" <c:if test="${hdr.applicationInstrumentation == true}"><c:out value="checked"/></c:if>>КИП и А</input><br/>
        <input type="checkbox" name="applicationSafety" <c:if test="${hdr.applicationSafety == true}"><c:out value="checked"/></c:if>>Безопасность</input><br/>
        <input type="checkbox" name="applicationASUTP" <c:if test="${hdr.applicationASUTP == true}"><c:out value="checked"/></c:if>>АСУ ТП</input><br/>
        <input type="checkbox" name="applicationProcess" <c:if test="${hdr.applicationProcess == true}"><c:out value="checked"/></c:if>>Технология</input><br/>
        <input type="checkbox" name="applicationPiping" <c:if test="${hdr.applicationPiping == true}"><c:out value="checked"/></c:if>>Монтаж</input><br/>
        <input type="checkbox" name="applicationElectrical" <c:if test="${hdr.applicationElectrical == true}"><c:out value="checked"/></c:if>>Электрика</input><br/>
        <input type="checkbox" name="applicationConstruction" <c:if test="${hdr.applicationConstruction == true}"><c:out value="checked"/></c:if>>Архитектура и строительство</input><br/>
        <input type="checkbox" name="applicationCableRouting" <c:if test="${hdr.applicationCableRouting == true}"><c:out value="checked"/></c:if>>Прокладка кабеля и кабельных трасс</input><br/>
        <input type="checkbox" name="applicationPID" <c:if test="${hdr.applicationPID == true}"><c:out value="checked"/></c:if>>Схемы автоматизации</input><br/>
        <input type="checkbox" name="applicationSPDS" <c:if test="${hdr.applicationSPDS == true}"><c:out value="checked"/></c:if>>СПДС и ЕСКД</input><br/>
        <input type="checkbox" name="applicationDocumentDesign" <c:if test="${hdr.applicationDocumentDesign == true}"><c:out value="checked"/></c:if>>Разработка проектной документации</input><br/>
        <input type="checkbox" name="applicationForInformation" <c:if test="${hdr.applicationForInformation == true}"><c:out value="checked"/></c:if>>Для сведения</input><br/>
        <input type="checkbox" name="applicationSTP" <c:if test="${hdr.applicationSTP == true}"><c:out value="checked"/></c:if>>СТП предприятия</input><br/>
    </fieldset>
    <fieldset>
        <legend>Ключевые слова (#hash_tags):</legend>
        <p>#01</p>
        <input type="text" name="hashTag01" value="<c:out value="${hdr.hashTag01}"/>"><br/>
        <p>#02</p>
        <input type="text" name="hashTag02" value="<c:out value="${hdr.hashTag02}"/>"><br/>
        <p>#03</p>
        <input type="text" name="hashTag03" value="<c:out value="${hdr.hashTag03}"/>"><br/>
        <p>#04</p>
        <input type="text" name="hashTag04" value="<c:out value="${hdr.hashTag04}"/>"><br/>
        <p>#05</p>
        <input type="text" name="hashTag05" value="<c:out value="${hdr.hashTag05}"/>"><br/>
        <p>#06</p>
        <input type="text" name="hashTag06" value="<c:out value="${hdr.hashTag06}"/>"><br/>
    </fieldset>
    <fieldset>
        <legend>Примечания и уточнения:</legend>
        <input type="text" name="notes" size="160" value="<c:out value="${hdr.notes}"/>"><br/>
    </fieldset>
    <fieldset>
        <legend>Файл:</legend>
        <p>Имя файла: <b><i><c:out value="${hdr.docFileName}"/></i></b></p>
        <p>Размер: <b><i><c:out value="${hdr.fileSize}"/></i></b></p>
    </fieldset>
    <br/>
    <input type="submit" id="submit" value="Сохранить">
</form>
</body>
</html>