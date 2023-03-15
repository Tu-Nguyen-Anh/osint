--liquibase formatted sql
--changeset dungna:update_permissions_table
INSERT INTO `group_permission` (`group_id`, `permission_name`) VALUES ('2', 'WRITE_TOPIC_POST');
