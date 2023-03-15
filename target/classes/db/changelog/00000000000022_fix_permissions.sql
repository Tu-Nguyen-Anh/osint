--liquibase formatted sql
--changeset dungna:fix_permissions
INSERT INTO `group_permission` (`group_id`, `permission_name`) VALUES ('2', 'WRITE_LINK');
INSERT INTO `group_permission` (`group_id`, `permission_name`) VALUES ('3', 'WRITE_LINK');
