create database shop;
use shop;
create table product(pdtid int primary key,pname varchar(100),price decimal(10,2),qtyinstock int);
create table sale(saleid int primary key,Daddress varchar(250));
create table saleitem(saleid int,pdtid int,qty int,primary key(saleid,pdtid),foreign key(saleid) references sale(saleid),foreign key(pdtid) references product(pdtid));

DELIMITER //
create trigger updateAvailabilityQuantity
after insert on saleitem
for each row
begin
	update product
    set qtyinstock=qtyinstock-new.qty
    where pdtid=new.pdtid;
end;
// DELIMITER ;

insert into product values(2,'toothpaste',1000,500);
insert into sale values(3,"12 avenue lane");
insert into saleitem values(3,2,100);
select * from product;
select * from saleitem;
select * from sale;

