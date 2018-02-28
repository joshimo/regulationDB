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
        <form action="/create" method="get">
            <fieldset>
                <legend>Описание документа</legend>
                <p>Название документа:</p>
                <input type="text" name="document_name" required><br/>
                <p>Краткое описание документа:</p>
                <input type="text" name="document_description" required><br/>
                <p>Тип документа:</p>
                <input type="text" name="document_type" required><br/>
            </fieldset>
            <fieldset>
                <legend>Область действия документа:</legend>
                <input type="checkbox" name="mandatory_ua">Действует в Украине</input><br/>
                <input type="checkbox" name="mandatory_ru">Действует в России</input><br/>
                <input type="checkbox" name="mandatory_kz">Действует в Казахстане</input><br/>
                <input type="checkbox" name="mandatory_eu">Действует в EC</input><br/>
            </fieldset>
            <fieldset>
                <legend>Область применения документа:</legend>
                <input type="checkbox" name="application_general">Общая</input><br/>
                <input type="checkbox" name="application_measurement">Технологические измерения</input><br/>
                <input type="checkbox" name="application_instrumentation">КИП и А</input><br/>
                <input type="checkbox" name="application_safety">Безопасность</input><br/>
                <input type="checkbox" name="application_asutp">АСУ ТП</input><br/>
                <input type="checkbox" name="application_process">Технология</input><br/>
                <input type="checkbox" name="application_piping">Монтаж</input><br/>
                <input type="checkbox" name="application_electrical">Электрика</input><br/>
                <input type="checkbox" name="application_construction">Архитектура и строительство</input><br/>
                <input type="checkbox" name="application_cable_routing">Прокладка кабеля и кабельных трасс</input><br/>
                <input type="checkbox" name="application_pid">Схемы автоматизации</input><br/>
                <input type="checkbox" name="application_spds_eskd">СПДС и ЕСКД</input><br/>
                <input type="checkbox" name="application_document_design">Разработка проектной документации</input><br/>
                <input type="checkbox" name="application_for_information">Для сведения</input><br/>
                <input type="checkbox" name="application_stp">СТП предприятия</input><br/>
            </fieldset>
            <fieldset>
                <legend>Ключевые слова (#hash_tags):</legend>
                <p>#01</p>
                <input type="text" name="hash_tag01"><br/>
                <p>#02</p>
                <input type="text" name="hash_tag02"><br/>
                <p>#03</p>
                <input type="text" name="hash_tag03"><br/>
                <p>#04</p>
                <input type="text" name="hash_tag04"><br/>
                <p>#05</p>
                <input type="text" name="hash_tag05"><br/>
                <p>#06</p>
                <input type="text" name="hash_tag06"><br/>
            </fieldset>
            <fieldset>
                <legend>Примечания и уточнения:</legend>
                <input type="text" name="notes"><br/>
            </fieldset>
            <br/>
            <input type="file" value="Загрузить файл">
            <input type="submit" value="Добавить">
            <input type="reset" value="Очистить">
        </form>
    </body>
</html>