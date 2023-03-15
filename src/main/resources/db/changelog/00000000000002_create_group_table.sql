--liquibase formatted sql
--changeset dungna:create-group-table
CREATE TABLE `group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `parent` bigint(20) DEFAULT NULL,
  `activated` bit(1) NOT NULL,
  `created_by` varchar(50) NOT NULL,
  `created_date` datetime DEFAULT NULL DEFAULT now(),
  `last_modified_by` varchar(50) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);
--rollback DROP TABLE group;
