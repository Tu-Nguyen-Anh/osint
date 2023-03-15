--liquibase formatted sql
--changeset dungna:insert_user_data
INSERT INTO `user`
(`password_hash`, `name`, `mobile`, `email`, `activated`, `deleted`, `created_by`, `last_modified_by`)
 VALUES
('$2a$10$mE.qmcV0mFU5NcKh73TZx.z4ueI/.bDWbj0T1BYyqP481kGGarKLG','System','0123456789','system@localhost',1,0,'system@localhost','system@localhost'),
('$2a$10$j8S5d7Sr7.8VTOYNviDPOeWX8KcYILUVJBsYV83Y5NtECayypx9lO','Anonymous','0123456789','anonymous@localhost',1,0,'system@localhost','system@localhost'),
('$2a$10$gSAhZrxMllrbgj/kkK9UceBPpChGWJA7SYIb1Mqo.n5aNLq1/oRrC','Administrator','0123456789','admin@localhost',1,0,'system@localhost','system@localhost'),
('$2a$10$VEjxo0jq2YG9Rbk2HmX9S.k1uZBGYUHdUcid3g/vfiEl7lwWgOH/K','User','0123456789','user@localhost',1,0,'system@localhost', 'system@localhost');
