--liquibase formatted sql
--changeset dungna:insert_group_data
INSERT INTO `group`
(`name`,`activated`, `created_by`, `last_modified_by`)
VALUES
('Admin', 1,'system@localhost','system@localhost'),
('Mod', 1,'system@localhost','system@localhost'),
('View', 1,'system@localhost','system@localhost');
