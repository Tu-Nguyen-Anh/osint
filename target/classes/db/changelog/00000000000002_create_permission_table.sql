--liquibase formatted sql
--changeset dungna:create-permission-table
CREATE TABLE `permission` (
  `name` varchar(50) NOT NULL,
  `description` text,
  PRIMARY KEY (`name`)
);
--rollback DROP TABLE permission;
