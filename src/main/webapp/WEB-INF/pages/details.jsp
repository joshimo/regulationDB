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
<div>
    <fieldset>
        <legend>Описание документа</legend>
        <p>Название документа:<br/>
            <b><i><c:out value="${hdr.docName}"/></i></b>
        </p>
        <p>Краткое описание документа:<br/>
            <b><i><c:out value="${hdr.docDescription}"/></i></b>
        </p>
        <p>Тип документа:<br/>
            <b><i><c:out value="${hdr.docType}"/></i></b>
        </p>
    </fieldset>
    <fieldset>
        <legend>Область действия документа:</legend>
        <input type="checkbox" name="mandatoryUA" <c:if test="${hdr.mandatoryUA == true}"><c:out value="checked"/></c:if> disabled>Действует в Украине</input><br/>
        <input type="checkbox" name="mandatoryRU" <c:if test="${hdr.mandatoryRU == true}"><c:out value="checked"/></c:if> disabled>Действует в России</input><br/>
        <input type="checkbox" name="mandatoryRK" <c:if test="${hdr.mandatoryRK == true}"><c:out value="checked"/></c:if> disabled>Действует в Казахстане</input><br/>
        <input type="checkbox" name="mandatoryEU" <c:if test="${hdr.mandatoryEU == true}"><c:out value="checked"/></c:if> disabled>Действует в EC</input><br/>
    </fieldset>
    <fieldset>
        <legend>Область применения документа:</legend>
        <input type="checkbox" name="applicationGeneral" <c:if test="${hdr.applicationGeneral == true}"><c:out value="checked"/></c:if> disabled>Общая</input><br/>
        <input type="checkbox" name="applicationMeasurement" <c:if test="${hdr.applicationMeasurement == true}"><c:out value="checked"/></c:if> disabled>Технологические измерения</input><br/>
        <input type="checkbox" name="applicationInstrumentation" <c:if test="${hdr.applicationInstrumentation == true}"><c:out value="checked"/></c:if> disabled>КИП и А</input><br/>
        <input type="checkbox" name="applicationSafety" <c:if test="${hdr.applicationSafety == true}"><c:out value="checked"/></c:if> disabled>Безопасность</input><br/>
        <input type="checkbox" name="applicationASUTP" <c:if test="${hdr.applicationASUTP == true}"><c:out value="checked"/></c:if> disabled>АСУ ТП</input><br/>
        <input type="checkbox" name="applicationProcess" <c:if test="${hdr.applicationProcess == true}"><c:out value="checked"/></c:if> disabled>Технология</input><br/>
        <input type="checkbox" name="applicationPiping" <c:if test="${hdr.applicationPiping == true}"><c:out value="checked"/></c:if> disabled>Монтаж</input><br/>
        <input type="checkbox" name="applicationElectrical" <c:if test="${hdr.applicationElectrical == true}"><c:out value="checked"/></c:if> disabled>Электрика</input><br/>
        <input type="checkbox" name="applicationConstruction" <c:if test="${hdr.applicationConstruction == true}"><c:out value="checked"/></c:if> disabled>Архитектура и строительство</input><br/>
        <input type="checkbox" name="applicationCableRouting" <c:if test="${hdr.applicationCableRouting == true}"><c:out value="checked"/></c:if> disabled>Прокладка кабеля и кабельных трасс</input><br/>
        <input type="checkbox" name="applicationPID" <c:if test="${hdr.applicationPID == true}"><c:out value="checked"/></c:if> disabled>Схемы автоматизации</input><br/>
        <input type="checkbox" name="applicationSPDS" <c:if test="${hdr.applicationSPDS == true}"><c:out value="checked"/></c:if> disabled>СПДС и ЕСКД</input><br/>
        <input type="checkbox" name="applicationDocumentDesign" <c:if test="${hdr.applicationDocumentDesign == true}"><c:out value="checked"/></c:if> disabled>Разработка проектной документации</input><br/>
        <input type="checkbox" name="applicationForInformation" <c:if test="${hdr.applicationForInformation == true}"><c:out value="checked"/></c:if> disabled>Для сведения</input><br/>
        <input type="checkbox" name="applicationSTP" <c:if test="${hdr.applicationSTP == true}"><c:out value="checked"/></c:if> disabled>СТП предприятия</input><br/>
    </fieldset>
    <fieldset>
        <legend>Ключевые слова (#hash_tags):</legend>
        <p><b><i><c:out value="${hdr.hashTag01}"/></i></b></p>
        <p><b><i><c:out value="${hdr.hashTag02}"/></i></b></p>
        <p><b><i><c:out value="${hdr.hashTag03}"/></i></b></p>
        <p><b><i><c:out value="${hdr.hashTag04}"/></i></b></p>
        <p><b><i><c:out value="${hdr.hashTag05}"/></i></b></p>
        <p><b><i><c:out value="${hdr.hashTag06}"/></i></b></p>
    </fieldset>
    <fieldset>
        <legend>Примечания и уточнения:</legend>
        <b><i><c:out value="${hdr.notes}"/></i></b>
    </fieldset>
    <fieldset>
        <legend>Файл:</legend>
        <p>Имя файла: <b><i><c:out value="${hdr.docFileName}"/></i></b></p>
        <p>Размер: <b><i><c:out value="${hdr.fileSize}"/></i></b></p>
    </fieldset>
    <br/>
</div>
<div>
    <fieldset>
        <form action="edit" method="get">
            <button type="submit" id="submit" name="id" value=<c:out value="${hdr.docNum}"/>>Редактировать документ</button>
            <button type="cancel" id="cancel" onclick="history.back(); return false;">Вернуться назад</button>
        </form>
    </fieldset>
</div>
</body>
</html>