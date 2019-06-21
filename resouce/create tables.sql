create database restaurant;
use restaurant;
create table menuitem(
id int primary key,
name varchar(50) not null,
description varchar(255),
menucategory varchar(20),
price double
);

create table customer(
cid int primary key auto_increment,
username varchar(20),
password varchar(20),
cname varchar(30),
cphonenumber varchar(20),
cemail varchar(30),
address varchar(50)
);
select * from menuitem;

create table orderdetail(
detailid int primary key auto_increment,
menuid int,
quantity int,
foreign key (menuid) references menuitem(id)
);
select * from orderdetail;

create table orders(
oid int primary key auto_increment,
ostatus varchar(20),
orderdetailid int,
customerid int,
foreign key (orderdetailid) references orderdetail(detailid),
foreign key (customerid) references customer(cid)
);
select * from orders;

