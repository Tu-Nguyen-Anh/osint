--liquibase formatted sql
--changeset dungna:create-group_permission-table
CREATE TABLE `group_permission` (
  `group_id` bigint(20) NOT NULL,
  `permission_name` varchar(50) NOT NULL,
  PRIMARY KEY (`group_id`,`permission_name`),
  KEY `FK1riqq1r4f9m0504y1858ctgws` (`permission_name`),
  CONSTRAINT `FK1riqq1r4f9m0504y1858ctgws` FOREIGN KEY (`permission_name`) REFERENCES `permission` (`name`),
  CONSTRAINT `FKdw7bnraty6qo3mdq6phatbglg` FOREIGN KEY (`group_id`) REFERENCES `group` (`id`)
);
--rollback DROP TABLE group_permission;
