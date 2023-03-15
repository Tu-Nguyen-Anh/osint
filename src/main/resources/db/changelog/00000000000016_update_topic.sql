--liquibase formatted sql
--changeset dungna:update_topic_post
alter table topic add column activated tinyint(1) default 1;
