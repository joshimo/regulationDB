<%@ page import="regulation.datamodel.DocumentHeader" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% DocumentHeader header = (DocumentHeader) request.getAttribute("header"); %>

<html>
<head>
    <title>Нормативная база КИП</title>
</head>
<style>
    <%@include file='style.css' %>
</style>
<body>
<h1>Подробное описание документа</h1>
<form action="/edit" method="post">
    <fieldset>
        <legend>Описание документа</legend>
        <p>Название документа:<br/>
            <b><i><%=header.getDocName()%></i></b>
        </p>
        <p>Краткое описание документа:<br/>
            <b><i><%=header.getDocDescription()%></i></b>
        </p>
        <p>Тип документа:<br/>
            <b><i><%=header.getDocType()%></i></b>
        </p>
    </fieldset>
    <fieldset>
        <legend>Область действия документа:</legend>
        <input type="checkbox" name="mandatoryUA" <%=header.getMandatoryUA()?"checked":""%> disabled>Действует в Украине</input><br/>
        <input type="checkbox" name="mandatoryRU" <%=header.getMandatoryRU()?"checked":""%> disabled>Действует в России</input><br/>
        <input type="checkbox" name="mandatoryRK" <%=header.getMandatoryRK()?"checked":""%> disabled>Действует в Казахстане</input><br/>
        <input type="checkbox" name="mandatoryEU" <%=header.getMandatoryEU()?"checked":""%> disabled>Действует в EC</input><br/>
    </fieldset>
    <fieldset>
        <legend>Область применения документа:</legend>
        <input type="checkbox" name="applicationGeneral" <%=header.getApplicationGeneral()?"checked":""%> disabled>Общая</input><br/>
        <input type="checkbox" name="applicationMeasurement" <%=header.getApplicationMeasurement()?"checked":""%> disabled>Технологические измерения</input><br/>
        <input type="checkbox" name="applicationInstrumentation" <%=header.getApplicationInstrumentation()?"checked":""%> disabled>КИП и А</input><br/>
        <input type="checkbox" name="applicationSafety" <%=header.getApplicationSafety()?"checked":""%> disabled>Безопасность</input><br/>
        <input type="checkbox" name="applicationASUTP" <%=header.getApplicationASUTP()?"checked":""%> disabled>АСУ ТП</input><br/>
        <input type="checkbox" name="applicationProcess" <%=header.getApplicationProcess()?"checked":""%> disabled>Технология</input><br/>
        <input type="checkbox" name="applicationPiping" <%=header.getApplicationPiping()?"checked":""%> disabled>Монтаж</input><br/>
        <input type="checkbox" name="applicationElectrical" <%=header.getApplicationElectrical()?"checked":""%> disabled>Электрика</input><br/>
        <input type="checkbox" name="applicationConstruction" <%=header.getApplicationConstruction()?"checked":""%> disabled>Архитектура и строительство</input><br/>
        <input type="checkbox" name="applicationCableRouting" <%=header.getApplicationCableRouting()?"checked":""%> disabled>Прокладка кабеля и кабельных трасс</input><br/>
        <input type="checkbox" name="applicationPID" <%=header.getApplicationPID()?"checked":""%> disabled>Схемы автоматизации</input><br/>
        <input type="checkbox" name="applicationSPDS" <%=header.getApplicationSPDS()?"checked":""%> disabled>СПДС и ЕСКД</input><br/>
        <input type="checkbox" name="applicationDocumentDesign" <%=header.getApplicationDocumentDesign()?"checked":""%> disabled>Разработка проектной документации</input><br/>
        <input type="checkbox" name="applicationForInformation" <%=header.getApplicationForInformation()?"checked":""%> disabled>Для сведения</input><br/>
        <input type="checkbox" name="applicationSTP" <%=header.getApplicationSTP()?"checked":"unchecked"%> disabled>СТП предприятия</input><br/>
    </fieldset>
    <fieldset>
        <legend>Ключевые слова (#hash_tags):</legend>
        <p><b><i><%=header.getHashTag01()%></i></b></p>
        <p><b><i><%=header.getHashTag02()%></i></b></p>
        <p><b><i><%=header.getHashTag03()%></i></b></p>
        <p><b><i><%=header.getHashTag04()%></i></b></p>
        <p><b><i><%=header.getHashTag05()%></i></b></p>
        <p><b><i><%=header.getHashTag06()%></i></b></p>
    </fieldset>
    <fieldset>
        <legend>Примечания и уточнения:</legend>
        <b><i><%=header.getNotes()%></i></b>
    </fieldset>
    <fieldset>
        <legend>Файл:</legend>
        <p>Имя файла: <b><i><%=header.getDocFileName()%></i></b></p>
        <p>Размер: <b><i><%=header.getFileSize()%></i></b></p>
    </fieldset>
    <br/>
    <input type="submit" id="submit" value="Редактировать">
</form>
</body>
</html>