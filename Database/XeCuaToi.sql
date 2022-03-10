create database `XeCuaToi`;

use `XeCuaToi`;
drop table `menu`
create table `menu`(
id_menu int auto_increment,
trangchu varchar(225),
mauxe varchar(225),
giaxe varchar(225),
tragop varchar(225),
tintuc varchar(225),
lienhe varchar(225),
primary key(id_menu)
);
insert into `Xecuatoi`.`menu`
(`trangchu`,`mauxe`,`giaxe`,`tragop`,`tintuc`,`lienhe`) values
('','huyndai_accent','','','',''),
('','huyndai_santafe','','','',''),
('','huyndai_tucson','','','',''),
('','huyndai_sonata','','','',''),
('','huyndai_elantra','','','','');

create table `mauxe`(
id_mauxe int auto_increment,
huyndai_accent varchar(225),
huyndai_santafe varchar(225),
huyndai_tucson varchar(225),
huyndai_sonata varchar(225),
huyndai_elantra varchar(225),
primary key(id_mauxe)
);
select * from `menu`


