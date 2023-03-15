--liquibase formatted sql
--changeset dungna:insert_permission_data
INSERT INTO `permission`
(`name`, `description`)
VALUES
('ROLE_ADMIN','ROLE FOR ADMIN'),
('ROLE_USER','ROLE FOR USER');
