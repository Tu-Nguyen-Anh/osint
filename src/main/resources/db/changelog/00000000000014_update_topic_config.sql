--liquibase formatted sql
--changeset dungna:create_topic_subcribe_table
alter table topic_config add column avatar varchar(255);
alter table post add column thumbnail varchar(255);
create table topic_post (id bigint not null auto_increment, created_by varchar(50) not null, created_date datetime, last_modified_by varchar(50), last_modified_date datetime, content varchar(255), thumbnail varchar(255), title varchar(255), topic_id bigint not null, primary key (id));
alter table topic_post add constraint FKruj4bvl8qadej54lwqkex3dpu foreign key (topic_id) references topic (id);
