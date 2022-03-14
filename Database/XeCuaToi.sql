create database `XeCuaToi`;

use `XeCuaToi`;
drop table `menu`;
create table `menu`(
id_menu int auto_increment,
gia_tri varchar(225),
primary key(id_menu)
);
insert into `Xecuatoi`.`menu`
(`id_menu`,`gia_tri`) values
(12313,'Trang chu'),
(123131,'Cac mau xe'),
(1231311,'Gi xe huyndai');

create table `mauxe`(
id_mauxe int auto_increment,
huyndai_accent varchar(225),
huyndai_santafe varchar(225),
huyndai_tucson varchar(225),
huyndai_sonata varchar(225),
huyndai_elantra varchar(225),
primary key(id_mauxe)
);
drop table`ThuNghiem`;
create table `ThuNghiem`(
id int auto_increment,
name varchar(225),
primary key(id)
);
insert into`xecuatoi`.`ThuNghiem`
(`id`,`name`) values
(1,'ABC'),
(2,'ABC'),
(3,'ABC'),
(4,'ABC');
select * from `menu`


