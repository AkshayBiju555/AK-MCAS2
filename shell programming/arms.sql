use yadhu;
delimiter //
create function arms(num int)
returns varchar(50)
deterministic
begin 
	declare sum int default 0;
    declare rem int;
    declare temp int;
    set temp = num;
    while num>0
    do
		set rem = temp%10;
        set sum=sum+(rem*rem*rem);
        set temp=floor(temp/10);
	end while;
    if sum = num
    then
		return "armstrong" ;
	else
		return "not armstrong";
	end if;
end //

delimiter ;

select arms(123);


