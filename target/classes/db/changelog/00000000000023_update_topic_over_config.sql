--liquibase formatted sql
--changeset sonvh:update_topic_over_config_table
alter table topic_over_config add column created_by varchar(50) NOT NULL;
alter table topic_over_config add column created_date datetime DEFAULT NULL DEFAULT now();
alter table topic_over_config add column last_modified_by varchar(50) DEFAULT NULL;
alter table topic_over_config add column last_modified_date datetime DEFAULT NULL;
