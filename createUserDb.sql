create database `users`;

use `users`;

Drop table if exists `waf_users`;
create table `waf_users` (
    `id` int(16) auto_increment,
    `name` varchar(256) not null default 'name',
    `passwd` varchar(256) not null default 'passwd',
    primary key (`id`) using BTREE
) engine = InnoDb char set = utf8;

grant all privileges on *.* to 'apm'@'%' with grant option ;
insert into waf_users (name, passwd) values ("user1", "passwd1");