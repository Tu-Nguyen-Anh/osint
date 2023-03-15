--liquibase formatted sql
--changeset dungna:create_topic_permission_table
create table topic_permission (id bigint not null auto_increment, created_by varchar(50) not null, created_date datetime, last_modified_by varchar(50), last_modified_date datetime, permission varchar(255), topic_id bigint, user_id bigint, primary key (id));
alter table topic_permission add constraint FK4vp9lw1ur0ldei8t2myimohxd foreign key (topic_id) references topic (id);
alter table topic_permission add constraint FKbk5prfe1q9i10tfolkokf9qph foreign key (user_id) references user (id);
