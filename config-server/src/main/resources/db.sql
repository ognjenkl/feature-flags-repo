CREATE DATABASE IF NOT EXISTS `feature_flags_configuration` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `feature_flags_configuration`;

CREATE TABLE IF NOT EXISTS `ff_properties`
(
    `id`          int      NOT NULL AUTO_INCREMENT,
    `application` varchar(255)      DEFAULT NULL,
    `profile`     varchar(255)      DEFAULT NULL,
    `label`       varchar(255)      DEFAULT NULL,
    `key`         varchar(255)      DEFAULT NULL,
    `value`       varchar(255)      DEFAULT NULL,
    `updatedOn`   datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

INSERT INTO `ff_properties` (`application`, `profile`, `label`, `key`, `value`)
VALUES ('local', 'default', 'latest', 'feature-flags.feature', 'false'),
       ('local', 'default', 'latest', 'feature-flags.book', 'false'),
       ('local', 'default', 'latest', 'feature-flags.movie', 'false'),
       ('local', 'default', 'latest', 'feature-flags.music', 'false');
