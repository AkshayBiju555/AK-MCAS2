create database frizz;
use frizz;
create table customer(cid int primary key,name varchar(30));
create table product(pcode int primary key,pname varchar(30),unit_price int);
create table cust_order(ocode int primary key,address varchar(30),cid int,foreign key(cid) references customer(cid));
create table order_product(ocode int,pcode int,no_of_units int,primary key(ocode,pcode),foreign key(ocode) references cust_order(ocode),foreign key(pcode) references product(pcode));

insert into customer values(10,"Aaron"),(2,"Sravan"),(3,"Reggie");
insert into product values(110,"Pen",10),(111,"Pencil",5),(112,"Eraser",2);
insert into cust_order values(1,"Kollam",10),(2,"Tvm",2);
insert into order_product values(1,110,5),(1,111,5),(2,112,10);

create view cust_order_details as select p.pcode,p.pname,o.no_of_units from product p join order_product o on p.pcode=o.pcode join cust_order c on o.ocode=c.ocode where c.cid=10;
select * from cust_order_details; 