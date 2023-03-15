--liquibase formatted sql
--changeset dungna:create_topic_subcribe_table
create table topic_subscribe (id bigint not null auto_increment, created_by varchar(50) not null, created_date datetime, last_modified_by varchar(50), last_modified_date datetime, topic_id bigint, user_id bigint, primary key (id));
alter table topic_subscribe add constraint FK3sa4iwkt8hqu6b6l4lcpqdq42 foreign key (topic_id) references topic (id);
alter table topic_subscribe add constraint FKrgqadftid8b5xk4jkjsmq2bhu foreign key (user_id) references user (id);
