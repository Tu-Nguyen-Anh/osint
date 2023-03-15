--liquibase formatted sql
--changeset tunv:unfollow_table
CREATE TABLE `link` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `link_name` LONGTEXT NOT NULL,
  `created_by` varchar(50) NOT NULL,
  `created_date` datetime DEFAULT NULL DEFAULT now(),
  `last_modified_by` varchar(50) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`));
