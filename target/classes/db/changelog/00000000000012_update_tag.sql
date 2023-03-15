--liquibase formatted sql
--changeset dungna:create_topic_subcribe_table
DROP TABLE `news_source_news_tag`;
ALTER TABLE `news_tag` DROP COLUMN `used`, DROP COLUMN `id`, DROP PRIMARY KEY, ADD PRIMARY KEY (`name`);
ALTER TABLE `news_source` ADD COLUMN `tags` LONGTEXT NULL AFTER `type_id`;
