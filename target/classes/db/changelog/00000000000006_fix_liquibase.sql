--liquibase formatted sql
--changeset dungna:fix_liquibase
create table `media` (id bigint not null auto_increment, created_by varchar(50) not null, created_date datetime, last_modified_by varchar(50), last_modified_date datetime, name varchar(255), path varchar(255), size bigint, type varchar(255), post_id bigint, primary key (id));
create table news_source (id bigint not null auto_increment, activated bit not null, deleted bit not null, description varchar(255), link varchar(255), name varchar(255) not null, type_id bigint not null, primary key (id));
create table news_source_news_tag (news_source_id bigint not null, news_tag_id bigint not null, primary key (news_source_id, news_tag_id));
create table news_tag (id bigint not null auto_increment, name varchar(255) not null, used bit not null, primary key (id));
create table news_type (id bigint not null auto_increment, name varchar(255) not null, primary key (id));
create table post (id bigint not null auto_increment, created_by varchar(50) not null, created_date datetime, last_modified_by varchar(50), last_modified_date datetime, content longtext, date datetime, name varchar(255), summary longtext, news_source_id bigint, news_type_id bigint, typical_news_id bigint, primary key (id));
create table topic (id bigint not null auto_increment, created_by varchar(50) not null, created_date datetime, last_modified_by varchar(50), last_modified_date datetime, level integer, name varchar(255), parent_id bigint, path varchar(255), primary key (id));
create table topic_config (id bigint not null, created_by varchar(50) not null, created_date datetime, last_modified_by varchar(50), last_modified_date datetime, about longtext, action longtext, biography longtext, emails longtext, enable_action bit not null, enable_album bit not null, enable_biography bit not null, enable_working_schedule bit not null, experience longtext, interaction_operation bigint, interaction_value bigint, keyword_excludes varchar(255), keyword_includes varchar(255), nuance_balance bit not null, nuance_balance_operation bigint, nuance_balance_value bigint, nuance_negative bit not null, nuance_negative_operation bigint, nuance_negative_value bigint, nuance_positive bit not null, nuance_positive_operation bigint, nuance_positive_value bigint, phones longtext, time_warning bigint, time_warning_custom bigint, working_schedule_method varchar(255), working_schedule_param varchar(255), working_scheduleurl varchar(255), primary key (id));
create table typical_news (id bigint not null auto_increment, name varchar(255), settings longtext, primary key (id));
alter table `user` add column `gender` varchar(255);
create table user_history (id bigint not null auto_increment, created_by varchar(50) not null, created_date datetime, last_modified_by varchar(50), last_modified_date datetime, description varchar(255) not null, author_id bigint not null, user_id bigint not null, primary key (id));
create table user_typical_news_read (user_id bigint not null, typical_news_id bigint not null, primary key (user_id, typical_news_id));
create table user_typical_news_write (user_id bigint not null, typical_news_id bigint not null, primary key (user_id, typical_news_id));
alter table `group` add constraint FKk5y92ry6lrjqy1vwaqrb31crx foreign key (parent) references `group` (id);
alter table `media` add constraint FK4iebhahhw9gu0in9p2o2fspdk foreign key (post_id) references post (id);
alter table news_source add constraint FKtltbnwd6rfrx2bihttadwxiib foreign key (type_id) references news_type (id);
alter table news_source_news_tag add constraint FK3n7jccnc84fkk8jygq1wmea16 foreign key (news_tag_id) references news_tag (id);
alter table news_source_news_tag add constraint FKdhon0rfae61sjiq6973i3dpd4 foreign key (news_source_id) references news_source (id);
alter table post add constraint FKjmyfl109amr8um5w59rpskwa5 foreign key (news_source_id) references news_source (id);
alter table post add constraint FKm319eqjvnwosgu316vhs60fr3 foreign key (news_type_id) references news_type (id);
alter table post add constraint FKgfbvcxq97vygjj7ts5gl8p6fc foreign key (typical_news_id) references typical_news (id);
alter table user_history add constraint FKducj6pmr9xdltr2tldx97xs0y foreign key (author_id) references user (id);
alter table user_history add constraint FKaa6ilb6iqih95bntoeyysb2pc foreign key (user_id) references user (id);
alter table user_typical_news_read add constraint FKk1050qcdbltpnkeigfidhpb6w foreign key (typical_news_id) references user (id);
alter table user_typical_news_read add constraint FKrxchsln38xqugl441g406pv4b foreign key (user_id) references typical_news (id);
alter table user_typical_news_write add constraint FKh1pnc3e1535x14evt17e2s03p foreign key (typical_news_id) references user (id);
alter table user_typical_news_write add constraint FKf8v7l866c6pwrlkw7adaxfd55 foreign key (user_id) references typical_news (id);
