<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Нормативная база КИП</title>
    </head>
    <style>
        <%@include file='style.css' %>
    </style>
    <body>
        <h1>Добавление нового документа в базу</h1>
        <form action="/create" method="post" enctype="multipart/form-data">
            <fieldset>
                <legend>Описание документа</legend>
                <p>Название документа:</p>
                <input type="text" name="docName" size="100" value="Название документа" required/><br/>
                <p>Краткое описание документа:</p>
                <input type="text" name="docDescription" size="100" value="Описание документа" required/><br/>
                <p>Тип документа:</p>
                <input type="text" name="docType" size="100" value="Тип документа" required/><br/>
            </fieldset>
            <fieldset>
                <legend>Область действия документа:</legend>
                <input type="checkbox" name="mandatoryUA">Действует в Украине</input><br/>
                <input type="checkbox" name="mandatoryRU">Действует в России</input><br/>
                <input type="checkbox" name="mandatoryRK">Действует в Казахстане</input><br/>
                <input type="checkbox" name="mandatoryEU">Действует в EC</input><br/>
            </fieldset>
            <fieldset>
                <legend>Область применения документа:</legend>
                <input type="checkbox" name="applicationGeneral">Общая</input><br/>
                <input type="checkbox" name="applicationMeasurement">Технологические измерения</input><br/>
                <input type="checkbox" name="applicationInstrumentation">КИП и А</input><br/>
                <input type="checkbox" name="applicationSafety">Безопасность</input><br/>
                <input type="checkbox" name="applicationASUTP">АСУ ТП</input><br/>
                <input type="checkbox" name="applicationProcess">Технология</input><br/>
                <input type="checkbox" name="applicationPiping">Монтаж</input><br/>
                <input type="checkbox" name="applicationElectrical">Электрика</input><br/>
                <input type="checkbox" name="applicationConstruction">Архитектура и строительство</input><br/>
                <input type="checkbox" name="applicationCableRouting">Прокладка кабеля и кабельных трасс</input><br/>
                <input type="checkbox" name="applicationPID">Схемы автоматизации</input><br/>
                <input type="checkbox" name="applicationSPDS">СПДС и ЕСКД</input><br/>
                <input type="checkbox" name="applicationDocumentDesign">Разработка проектной документации</input><br/>
                <input type="checkbox" name="applicationForInformation">Для сведения</input><br/>
                <input type="checkbox" name="applicationSTP">СТП предприятия</input><br/>
            </fieldset>
            <fieldset>
                <legend>Ключевые слова (#hash_tags):</legend>
                <p>#01</p>
                <input type="text" name="hashTag01"><br/>
                <p>#02</p>
                <input type="text" name="hashTag02"><br/>
                <p>#03</p>
                <input type="text" name="hashTag03"><br/>
                <p>#04</p>
                <input type="text" name="hashTag04"><br/>
                <p>#05</p>
                <input type="text" name="hashTag05"><br/>
                <p>#06</p>
                <input type="text" name="hashTag06"><br/>
            </fieldset>
            <fieldset>
                <legend>Примечания и уточнения:</legend>
                <input type="text" name="notes" size="160" value="Примечания"><br/>
            </fieldset>
            <fieldset>
                <legend>Выберите файл для загрузки:</legend>
                <input type="file" name="file">
            </fieldset>
            <br/>
            <input type="submit" id="submit" value="Добавить документ в базу">
            <input type="reset" id="cancel" value="Очистить">
        </form>
    </body>
</html>