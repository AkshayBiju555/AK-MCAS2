create database yadhu;

use yadhu;

create table department(dept_no varchar(10) primary key,dept_name varchar(50), location varchar(100));
create table employee(emp_no varchar(10) primary key,emp_name varchar(50),salary int,dept_no varchar(10),foreign key(dept_no) references department(dept_no));

insert into department values(001,"mca","tvm"),(002,"cse","cet");
insert into employee values(101,"yadhu",20000,001),(102,"anu",15000,001),(201,"anjaly",30000,002);

select * from department;
select * from employee;

select SUM(salary) as total_salary from employee;

select d.dept_name, COUNT(e.emp_no) as employee_count from department d left join employee e on d.dept_no = e.dept_no group by d.dept_name;

select emp_name as NAME1 from employee where emp_name like "a%";
