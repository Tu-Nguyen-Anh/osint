--liquibase formatted sql
--changeset dungna:after_topic_config_table
alter table topic_config add column other_news_source_selected longtext;
