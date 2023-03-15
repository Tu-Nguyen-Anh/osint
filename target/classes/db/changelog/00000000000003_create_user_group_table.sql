--liquibase formatted sql
--changeset dungna:create-user_group-table
CREATE TABLE `user_group` (
  `group_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`,`group_id`),
  KEY `FK71ue7uuqo0neoodkx7smf7e3o` (`group_id`),
  CONSTRAINT `FK1c1dsw3q36679vaiqwvtv36a6` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `FK71ue7uuqo0neoodkx7smf7e3o` FOREIGN KEY (`group_id`) REFERENCES `group` (`id`)
);
--rollback DROP TABLE user_group;
