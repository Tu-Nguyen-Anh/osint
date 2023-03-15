--liquibase formatted sql
--changeset dungna:insert_user_group_data
INSERT INTO `user_group`
(`group_id`, `user_id`)
 VALUES 
(1,1),
(1,3),
(2,4);
