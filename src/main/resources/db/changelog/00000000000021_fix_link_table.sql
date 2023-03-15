--liquibase formatted sql
--changeset dungna:fix_link_table
TRUNCATE `link`;
alter table link add column user_id bigint not null;
alter table link add constraint FKg1mwmfya7kqb7ddxw0fdkse8t foreign key (user_id) references user (id);
