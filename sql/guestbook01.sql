-- scheme
desc guestbook;

select no, name, password, message, reg_date
from guestbook
order by no desc;

insert
into guestbook
values (null, '둘리', '1234', '나는 둘리다', now());

insert
into guestbook
values (null, '마이콜', '마이콜1234', '나는 마이콜이다', now());

delete 
from guestbook
where no=?
and password=?;