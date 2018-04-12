create table tbl_customer(
	id number(7) primary key,
	name varchar2(50),
	address varchar2(255),
	phone varchar2(255),
	fax varchar2(255),
	levels varchar2(10)
);
create sequence tbl_customer_id;

create sequence tbl_visitrecord_id;
create table tbl_visitrecord(
	id NUMBER primary key,
	visitdate DATE not null,
	type varchar2(20) not null,
	contact varchar2(20) not null,
	context varchar2(200) not null,
	customer_id number(7)
);

insert into tbl_customer values(tbl_customer_id.nextval,'张三','江苏','188789','456789','1');
insert into tbl_visitrecord values(tbl_visitrecord_id.nextval,sysdate,'电话','李四','gjhkl',1);
