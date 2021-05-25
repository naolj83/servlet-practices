-- scheme
desc emaillist;

-- list
select no, first_name, last_name, email 
from emaillist
order by no desc;

-- add
insert 
into emaillist
values (null, '둘', '리', 'dooly@gmail.com');

insert 
into emaillist
values (null, '마', '이콜', 'michol@gmail.com');