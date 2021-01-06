create database vast_inbk;
use vast_inbk;

drop table if exists base_users;
create table base_users(
    id int primary key auto_increment comment 'ID',
    username varchar(50) not null comment '用户名',
    pwd varchar(64) not null comment '密码',
    status int not null default 1 comment '账号状态 0：不可用，1：可用，默认为1',
    city varchar(20) comment '城市',
    wealth decimal(12,2) comment '财富',
    sex int comment '性别',
    locked int comment '锁定'
);

insert into base_users(username,pwd,status,city,wealth,sex,locked) value('admin','123456',1,3021,1200932223.32,1,0);