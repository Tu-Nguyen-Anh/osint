--liquibase formatted sql
--changeset sonvh:create-topic_over_config-table
CREATE TABLE `topic_over_config` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NULL,
  `status` VARCHAR(45) NULL,
  `topic_id` BIGINT(20) NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `topic_id` FOREIGN KEY (`topic_id`) REFERENCES `topic` (`id`)
);
--rollback DROP TABLE topic_over_config;