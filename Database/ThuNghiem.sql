create database `ThuNghiem`;

use `ThuNghiem`;
drop table`thunghiem`;
create table `test`(
	id int auto_increment,
    `name` varchar(225),
    primary key(id)
);
insert into `ThuNghiem`.`test`
(`id`, `name`) values
('1', 'Nguyen van A'),
('2', 'Nguyen van B'),
('3', 'Nguyen van C'),
('4', 'Nguyen van D');


select * from `test`;