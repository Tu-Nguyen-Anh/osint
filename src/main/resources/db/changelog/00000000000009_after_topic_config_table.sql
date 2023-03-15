--liquibase formatted sql
--changeset dungna:after_topic_config_table
alter table topic_config add column children_topic longtext;
alter table topic_config add column news_types_excludes longtext;
alter table topic_config add column news_types_selected longtext;
