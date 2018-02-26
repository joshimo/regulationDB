CREATE TABLE instrumentation_main (
DOCUMENT_NUMBER SMALLINT NOT NULL AUTO_INCREMENT KEY, 
DOCUMENT_NAME VARCHAR(255),
DOCUMENT_DESCRIPTION VARCHAR(255), 
DOCUMENT_FILE_NAME VARCHAR(255),
DOCUMENT_BLOB LONGBLOB,
DOCUMENT_TYPE VARCHAR(64), 
MANDATORY_UA BIT(1) NOT NULL DEFAULT false,
MANDATORY_RK BIT(1) NOT NULL DEFAULT false,
MANDATORY_RU BIT(1) NOT NULL DEFAULT false,
APPLICATION_GENERAL BIT(1) NOT NULL DEFAULT false,
APPLICATION_MEASUREMENT BIT(1) NOT NULL DEFAULT false,
APPLICATION_INSTRUMENTATION BIT(1) NOT NULL DEFAULT false,
APPLICATION_SAFETY BIT(1) NOT NULL DEFAULT false,
APPLICATION_ASUTP BIT(1) NOT NULL DEFAULT false,
APPLICATION_PROCESS BIT(1) NOT NULL DEFAULT false,
APPLICATION_PIPING BIT(1) NOT NULL DEFAULT false,
APPLICATION_ELECTRICAL BIT(1) NOT NULL DEFAULT false,
APPLICATION_CONSTRUCTION BIT(1) NOT NULL DEFAULT false,
APPLICATION_CABLE_ROUTING BIT(1) NOT NULL DEFAULT false,
APPLICATION_PID BIT(1) NOT NULL DEFAULT false,
APPLICATION_SPDS_ESKD BIT(1) NOT NULL DEFAULT false,
APPLICATION_DOCUMENTS_DESIGN BIT(1) NOT NULL DEFAULT false,
UDF01 VARCHAR(255),
UDF02 VARCHAR(255),
UDF03 VARCHAR(255),
UDF04 VARCHAR(255),
UDF05 VARCHAR(255),
UDF06 VARCHAR(255),
UDF07 VARCHAR(255),
UDF08 VARCHAR(255),
UDF09 VARCHAR(255),
UDF10 VARCHAR(255),
UDF11 VARCHAR(255),
UDF12 VARCHAR(255),
NOTES VARCHAR(255)) ENGINE InnoDB DEFAULT CHARSET=utf8;
ALTER TABLE instrumentation_main ADD INDEX (DOCUMENT_NAME(64));
ALTER TABLE instrumentation_main ADD INDEX (DOCUMENT_TYPE(16));
ALTER TABLE instrumentation_main ADD INDEX (MANDATORY_UA(1));
ALTER TABLE instrumentation_main ADD INDEX (MANDATORY_RK(1));
ALTER TABLE instrumentation_main ADD INDEX (MANDATORY_RU(1));
ALTER TABLE instrumentation_main ADD INDEX (UDF01(64));
ALTER TABLE instrumentation_main ADD INDEX (UDF02(64));
ALTER TABLE instrumentation_main ADD INDEX (UDF03(64));
ALTER TABLE instrumentation_main ADD INDEX (UDF04(64));