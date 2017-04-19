--数据库初始脚本

--创建数据库
create database seckill;
--使用数据库
use seckill;

--创建秒杀库存表(原先是把create_time的那条语句放在了start_time和end_time的后面，之后就报错了，调换顺序之后就可以.)
--
create table seckill(
   `seckill_id` bigint not null auto_increment comment'商品库存id',
   `name` varchar(120) not null comment'商品名称',
   `number` int not null comment '库存数量',
   `create_time` timestamp not null default current_timestamp comment'创建时间',
   `start_time` timestamp not null comment '秒杀开启时间',
   `end_time` timestamp not null comment '秒杀结束时间',
   primary key(seckill_id),
   key idx_start_time(start_time),
   key idx_end_time(end_time),
   key idx_create_time(create_time)
)ENGINE=InnoDB auto_increment=1000 default charset=utf8 comment='秒杀库存表';

--初始化数据
insert into seckill(name,number,start_time,end_time)values('1000元秒杀iphone6',100,'2017-04-17 12:00:00','2017-04-18 12:00:00');
insert into seckill(name,number,start_time,end_time)values('500元秒杀ipad2',200,'2017-04-17 12:00:00','2017-04-18 12:00:00');
insert into seckill(name,number,start_time,end_time)values('300元秒杀小米4',300,'2017-04-17 12:00:00','2017-04-18 12:00:00');
insert into seckill(name,number,start_time,end_time)values('200元秒杀红米note',400,'2017-04-17 12:00:00','2017-04-18 12:00:00');


--秒杀成功明细表
--用户登录认证相关的信息

create table success_killed(
 `seckill_id` bigint not null comment'秒杀商品Id',
 `user_phone` bigint not null comment'用户手机号',
 `state` tinyint not null default -1 comment '状态标识： -1：无效，0：成功，1：已付款，2：已发货',
 `create_time` timestamp not null comment'创建时间',
 primary key (seckill_id,user_phone),/*联合主键*/
 foreign key (seckill_id) references seckill(seckill_id),
 key idx_create_time(create_time)
)ENGINE=InnoDB default charset=utf8 comment='秒杀成功明细表';