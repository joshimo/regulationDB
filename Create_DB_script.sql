CREATE TABLE instrumentation_regulation_main (
DOCUMENT_NUMBER SMALLINT NOT NULL AUTO_INCREMENT KEY,
DOCUMENT_NAME VARCHAR(255),
DOCUMENT_DESCRIPTION VARCHAR(255),
DOCUMENT_FILE_NAME VARCHAR(255),
DOCUMENT_BLOB LONGBLOB,
DOCUMENT_TYPE VARCHAR(64),
EXPIRATION_DATE DATE,
MANDATORY_UA BIT(1) NOT NULL DEFAULT false,
MANDATORY_RK BIT(1) NOT NULL DEFAULT false,
MANDATORY_RU BIT(1) NOT NULL DEFAULT false,
MANDATORY_EU BIT(1) NOT NULL DEFAULT false,
IS_UP_TO_DATE BIT(1) NOT NULL DEFAULT false,
UDF01 BIT(1) NOT NULL DEFAULT false,
UDF02 BIT(1) NOT NULL DEFAULT false,
UDF03 BIT(1) NOT NULL DEFAULT false,
UDF04 BIT(1) NOT NULL DEFAULT false,
UDF05 BIT(1) NOT NULL DEFAULT false,
UDF06 BIT(1) NOT NULL DEFAULT false,
UDF07 BIT(1) NOT NULL DEFAULT false,
UDF08 BIT(1) NOT NULL DEFAULT false,
UDF09 BIT(1) NOT NULL DEFAULT false,
UDF10 BIT(1) NOT NULL DEFAULT false,
UDF11 BIT(1) NOT NULL DEFAULT false,
UDF12 BIT(1) NOT NULL DEFAULT false,
UDF13 BIT(1) NOT NULL DEFAULT false,
UDF14 BIT(1) NOT NULL DEFAULT false,
UDF15 BIT(1) NOT NULL DEFAULT false,
UDF16 BIT(1) NOT NULL DEFAULT false,
UDF17 BIT(1) NOT NULL DEFAULT false,
UDF18 BIT(1) NOT NULL DEFAULT false,
UDF19 BIT(1) NOT NULL DEFAULT false,
UDF20 BIT(1) NOT NULL DEFAULT false,
UDF21 BIT(1) NOT NULL DEFAULT false,
UDF22 BIT(1) NOT NULL DEFAULT false,
UDF23 BIT(1) NOT NULL DEFAULT false,
UDF24 BIT(1) NOT NULL DEFAULT false,
UDF25 BIT(1) NOT NULL DEFAULT false,
UDF26 BIT(1) NOT NULL DEFAULT false,
UDF27 BIT(1) NOT NULL DEFAULT false,
UDF28 BIT(1) NOT NULL DEFAULT false,
UDF29 BIT(1) NOT NULL DEFAULT false,
UDF30 BIT(1) NOT NULL DEFAULT false,
UDF31 BIT(1) NOT NULL DEFAULT false,
UDF32 BIT(1) NOT NULL DEFAULT false,
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