--liquibase formatted sql
--changeset dungna:create-persistent_audit_evt_data-table
CREATE TABLE `persistent_audit_evt_data` (
  `event_id` bigint(20) NOT NULL,
  `name` varchar(150) NOT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`event_id`,`name`),
  KEY `idx_persistent_audit_evt_data` (`event_id`),
  CONSTRAINT `fk_evt_pers_audit_evt_data` FOREIGN KEY (`event_id`) REFERENCES `persistent_audit_event` (`event_id`)
);
--rollback DROP TABLE persistent_audit_evt_data;
