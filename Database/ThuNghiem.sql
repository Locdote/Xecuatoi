create database `ThuNghiem`;

use `ThuNghiem`;
drop table`menu`;
create table `menu`(
	id int auto_increment,
    `name` varchar(225),
    id_cha int,
    primary key(id)
);
insert into `ThuNghiem`.`menu`
(`id`, `name`,`id_cha`) values
('2', 'TRANG CHU','0'),
('3', 'CÁC MẪU XE','0'),
('4', 'GIÁ XE HUYNDAI','0'),
('5', 'MUA XE TRẢ GÓP','0'),
('6', 'TIN TƯC','0'),
('7', 'LIÊN HỆ','0'),
('8', 'Huyndai Sedan','3'),
('9', 'Huyndai Accent','3'),
('10', 'Huyndai Santafe','3'),
('11', 'Huyndai Tucson','3'),
('12', 'Huyndai Sonata','3'),
('13', 'Huyndai Elantra','3');



select * from `test`;