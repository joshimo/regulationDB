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
MANDATORY_EU BIT(1) NOT NULL DEFAULT false,
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
APPLICATION_FOR_INFORMATION BIT(1) NOT NULL DEFAULT false,
APPLICATION_STP BIT(1) NOT NULL DEFAULT false,
APPLICATION_FLD01 BIT(1) NOT NULL DEFAULT false,
APPLICATION_FLD02 BIT(1) NOT NULL DEFAULT false,
APPLICATION_FLD03 BIT(1) NOT NULL DEFAULT false,
APPLICATION_FLD04 BIT(1) NOT NULL DEFAULT false,
APPLICATION_FLD05 BIT(1) NOT NULL DEFAULT false,
APPLICATION_FLD06 BIT(1) NOT NULL DEFAULT false,
HASH_TAG01 VARCHAR(36),
HASH_TAG02 VARCHAR(36),
HASH_TAG03 VARCHAR(36),
HASH_TAG04 VARCHAR(36),
HASH_TAG05 VARCHAR(36),
HASH_TAG06 VARCHAR(36),
NOTES VARCHAR(255),
HASH_SUM int default '0' null,
FILE_SIZE int default '0' null) ENGINE InnoDB DEFAULT CHARSET=utf8;
ALTER TABLE instrumentation_main ADD INDEX (DOCUMENT_NAME(64));
ALTER TABLE instrumentation_main ADD INDEX (DOCUMENT_TYPE(16));
ALTER TABLE instrumentation_main ADD INDEX (MANDATORY_UA(1));
ALTER TABLE instrumentation_main ADD INDEX (MANDATORY_RK(1));
ALTER TABLE instrumentation_main ADD INDEX (MANDATORY_RU(1));
ALTER TABLE instrumentation_main ADD INDEX (MANDATORY_EU(1));
ALTER TABLE instrumentation_main ADD INDEX (HASH_TAG01(36));
ALTER TABLE instrumentation_main ADD INDEX (HASH_TAG02(36));
ALTER TABLE instrumentation_main ADD INDEX (HASH_TAG03(36));
ALTER TABLE instrumentation_main ADD INDEX (HASH_TAG04(36));
ALTER TABLE instrumentation_main ADD INDEX (HASH_TAG05(36));
ALTER TABLE instrumentation_main ADD INDEX (HASH_TAG06(36));