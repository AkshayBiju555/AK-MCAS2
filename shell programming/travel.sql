USE travel;
CREATE TABLE hotel(h_id int PRIMARY KEY,h_name varchar(40),noofrooms int,rate REAL);
CREATE TABLE travel.guest(g_id int PRIMARY KEY,g_name varchar(40),address varchar(50),phone int,no_of_days int,h_id int,
FOREIGN KEY(h_id) REFERENCES hotel(h_id));
CREATE TABLE travel.staff(s_id int PRIMARY KEY,s_name varchar(40),h_id int,salary REAL,designation varchar(50),FOREIGN KEY(h_id) REFERENCES hotel(h_id));

INSERT INTO `travel`.`hotel`(`h_id`,`h_name`,`noofrooms`,`rate`)VALUES(1,'samudra',12,1500);
INSERT INTO `travel`.`hotel`(`h_id`,`h_name`,`noofrooms`,`rate`)VALUES(2,'leela',10,1600);
INSERT INTO `travel`.`hotel`(`h_id`,`h_name`,`noofrooms`,`rate`)VALUES(3,'grand',7,1300);
INSERT INTO `travel`.`hotel`(`h_id`,`h_name`,`noofrooms`,`rate`)VALUES(4,'dwani',8,2000);
INSERT INTO `travel`.`hotel`(`h_id`,`h_name`,`noofrooms`,`rate`)VALUES(5,'abc',5,1100);
INSERT INTO `travel`.`hotel`(`h_id`,`h_name`,`noofrooms`,`rate`)VALUES(6,'xyz',9,1500);


INSERT INTO `travel`.`guest`(`g_id`,`g_name`,`address`,`phone`,`no_of_days`,`h_id`)VALUES(12,'shankar','kollam',002245,2,4);
INSERT INTO `travel`.`guest`(`g_id`,`g_name`,`address`,`phone`,`no_of_days`,`h_id`)VALUES(13,'deepu','trivandrum',003345,1,2);
INSERT INTO `travel`.`guest`(`g_id`,`g_name`,`address`,`phone`,`no_of_days`,`h_id`)VALUES(14,'diya','mumbai',004445,4,1);
INSERT INTO `travel`.`guest`(`g_id`,`g_name`,`address`,`phone`,`no_of_days`,`h_id`)VALUES(15,'riya','delhi',005545,1,3);
INSERT INTO `travel`.`guest`(`g_id`,`g_name`,`address`,`phone`,`no_of_days`,`h_id`)VALUES(16,'shanu','mumbai',006645,3,1);
INSERT INTO `travel`.`guest`(`g_id`,`g_name`,`address`,`phone`,`no_of_days`,`h_id`)VALUES(17,'neethu','kochi',007745,1,5);

INSERT INTO `travel`.`staff`(`s_id`,`s_name`,`h_id`,`salary`,`designation`)VALUES(21,'dev',2,25000,'receptionist');
INSERT INTO `travel`.`staff`(`s_id`,`s_name`,`h_id`,`salary`,`designation`)VALUES(22,'saritha',3,15000,'receptionist');
INSERT INTO `travel`.`staff`(`s_id`,`s_name`,`h_id`,`salary`,`designation`)VALUES(23,'nia',2,8000,'sweeper');
INSERT INTO `travel`.`staff`(`s_id`,`s_name`,`h_id`,`salary`,`designation`)VALUES(24,'nandhu',5,11000,'catering');
INSERT INTO `travel`.`staff`(`s_id`,`s_name`,`h_id`,`salary`,`designation`)VALUES(25,'anu',1,10000,'administration');
INSERT INTO `travel`.`staff`(`s_id`,`s_name`,`h_id`,`salary`,`designation`)VALUES(26,'amal',6,50000,'manager');


SELECT gu.g_id,gu.g_name,gu.address,gu.phone,h.h_name FROM guest gu JOIN hotel h on gu.h_id=h.h_id WHERE h.h_name='samudra' and gu.address='mumbai';

SELECT gu.g_name,h.h_name,h.rate,gu.no_of_days,(gu.no_of_days * h.rate ) as total_rate FROM guest gu JOIN hotel h on gu.h_id=h.h_id where gu.g_name='shankar';

SELECT st.s_id,st.s_name,st.salary,st.designation,hotel.h_name FROM staff st JOIN hotel on st.h_id=hotel.h_id where hotel.h_name='leela' ORDER BY st.salary DESC;

SELECT * FROM hotel where noofrooms=(SELECT max(noofrooms) FROM hotel);

SELECT * FROM guest;