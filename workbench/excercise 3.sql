create database ghost;
use ghost;
create table student (name varchar(50),student_number int primary key,class int,major varchar(50));
create table course(course_name varchar(25),course_number varchar(10) primary key,credit_hours int,department varchar(25));
create table section(section_identifier int primary key,course_number varchar(10),semester varchar(10),year int,instructor varchar(25),foreign key(course_number) references course(course_number));
create table grade_report(student_number int,section_identifier int,grade char(1),primary key(student_number,section_identifier),foreign key(student_number) references student(student_number),foreign key(section_identifier) references  section(section_identifier));
create table prerequisite(course_number varchar(10),prerequisite_number varchar(10),primary key(course_number,prerequisite_number),foreign key(course_number) references course(course_number));
insert into student values('Smith',17,1,'CS'),('Brown',8,2,'CS');

insert into course values('Intro to computer science','CS1310',4,'CS'),('Data structures','CS3320',4,'CS'),('Discrete mathematics','MATH2410',3,'MATH'),('Database','CS3380',3,'CS');
insert into section values(85,'MATH2410','Fall',2007,'King'),(92,'CS1310','Fall',2007,'Anderson'),(102,'CS3320','Spring',2008,'Knuth'),(112,'MATH2410','Fall',2008,'Chang'),(119,'CS1310','Fall',2008,'Anderson'),(135,'CS3380','Fall',2008,'Stone');
insert into grade_report values(17,112,'B'),(17,119,'C'),(8,85,'A'),(8,92,'A'),(8,102,'B'),(8,135,'A');
insert into grade_report values(25,85,'B');
insert into prerequisite values('CSS3380','CSS3320'),('CSS3380','MATH2410'),('CSS3320','CSS1310');
INSERT INTO prerequisite VALUES
('CS3380','CS3320'),
('CS3380','MATH2410'),
('CS3320','CS1310');
Select C.course_name,G.grade from student s join grade_report g on s.student_number=g.student_number join section SE on SE.section_identifier=G.section_identifier join course C on SE.course_number=C.course_number where S.name='Smith';
select s.name,g.grade from student s join grade_report g on s.student_number=g.student_number join section se on g.section_identifier=se.section_identifier join course c on se.course_number=c.course_number where c.course_name='Database' and se.semester='Fall' and se.year=2008;
select p.prerequiste_number from prerequisite p where  p.course_number='CS3380';
SELECT prerequisite_number
FROM prerequisite
WHERE course_number = 'CS3380';
select name from student where class=2 and major='CS';
select c.course_name from section se join course c on se.course_number=c.course_number where se.instructor='King' and se.year in (2007,2008);
select se.course_number,se.year,se.semester,count(g.student_number) from section se left join grade_report g on se.section_identifier=g.section_identifier where se.instructor='King' group by se.section_identifier;
insert into student values('Johnson',25,1,'Math');
update student set class=2 where name='Smith';
insert into course values('Knowledge Engineering','CS4390',3,'CS');
delete from student where name='Smith' and student_number=17;
select * from student;

SHOW CREATE TABLE grade_report;
DELETE FROM grade_report
WHERE student_number = 17;

DELETE FROM student
WHERE student_number = 17;

select se.course_number,se.year,se.semester,count(g.student_number) as student_count from section se left join grade_report g on se.section_identifier=g.section_identifier where se.instructor='King' group by se.section_identifier;