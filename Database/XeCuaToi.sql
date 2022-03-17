create database `Xecuatoi`;

use `Xecuatoi`;
drop table `menu`;
create table `menu`(
	id int auto_increment,
    `name` varchar(225),
    url char(225),
    id_cha int,
    primary key(id)
);
insert into `Xecuatoi`.`menu`
(`id`, `name`,`url`, `id_cha`) values
('2', 'TRANG CHU','http://localhost:8080/xecuatoi','0'),
('3', 'CÁC MẪU XE','http://localhost:8080/cacmauxe','0'),
('4', 'GIÁ XE HUYNDAI','','0'),
('5', 'MUA XE TRẢ GÓP','','0'),
('6', 'TIN TƯC','http://localhost:8080/tintuc','0'),
('7', 'LIÊN HỆ','http://localhost:8080/lienhe','0'),
('8', 'Huyndai Sedan','','3'),
('9', 'Huyndai Accent','','3'),
('10', 'Huyndai Santafe','','3'),
('11', 'Huyndai Tucson','','3'),
('12', 'Huyndai Sonata','','3'),
('13', 'Huyndai Elantra','','3');