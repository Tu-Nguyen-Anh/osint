--liquibase formatted sql
--changeset dungna:create_topic_album_table
create table topic_album (id bigint not null auto_increment, name varchar(255), topic_id bigint, primary key (id));
create table topic_image (id bigint not null auto_increment, path varchar(255), topic_album_id bigint, primary key (id));
alter table topic_album add constraint FKb8aa2h3ycyybt82aobcd8pdgi foreign key (topic_id) references topic (id);
alter table topic_image add constraint FKakt97qq5tju5aw3imn8uf3ikh foreign key (topic_album_id) references topic_album (id);
