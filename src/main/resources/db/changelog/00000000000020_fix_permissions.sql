--liquibase formatted sql
--changeset dungna:fix_permissions
INSERT INTO `group_permission` (`group_id`, `permission_name`) VALUES ('2', 'WRITE_TOPIC_SUBCRIBE');
INSERT INTO `group_permission` (`group_id`, `permission_name`) VALUES ('2', 'WRITE_TOPIC_CONFIG');
INSERT INTO `group_permission` (`group_id`, `permission_name`) VALUES ('3', 'WRITE_TOPIC_SUBCRIBE');
