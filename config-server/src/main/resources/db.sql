CREATE DATABASE IF NOT EXISTS `feature_flags_configuration` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `feature_flags_configuration`;

CREATE TABLE IF NOT EXISTS `properties`
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
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

INSERT INTO `properties` (`id`, `application`, `profile`, `label`, `key`, `value`, `updatedOn`)
VALUES (1, 'local', 'default', 'latest', 'feature-flags.feature', 'false', '2023-04-22 17:51:14'),
       (2, 'local', 'default', 'latest', 'feature-flags.book', 'false', '2023-04-22 17:56:48');
