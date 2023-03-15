--liquibase formatted sql
--changeset dungna:update_topic_post
ALTER TABLE `topic_post` ADD COLUMN `summary` LONGTEXT NULL AFTER `last_modified_date`, CHANGE COLUMN `content` `content` LONGTEXT NULL DEFAULT NULL ;
