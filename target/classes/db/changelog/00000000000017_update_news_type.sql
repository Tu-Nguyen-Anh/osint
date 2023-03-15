--liquibase formatted sql
--changeset sonvh:update_news_type
INSERT INTO `news_type` (`name`) VALUES ('Báo chí');
INSERT INTO `news_type` (`name`) VALUES ('Mạng xã hội');
INSERT INTO `news_type` (`name`) VALUES ('Blog');
INSERT INTO `news_type` (`name`) VALUES ('Forum');
INSERT INTO `news_type` (`name`) VALUES ('Youtube');
