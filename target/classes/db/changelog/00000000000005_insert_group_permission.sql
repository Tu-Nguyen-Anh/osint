--liquibase formatted sql
--changeset dungna:insert_group_permission_data
INSERT INTO `group_permission`
(`group_id`, `permission_name`)
 VALUES 
(1,'ROLE_ADMIN'),
(1,'ROLE_USER'),
(2,'ROLE_USER');
