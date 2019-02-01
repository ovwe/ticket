create schema ticket;

alter schema ticket owner to postgres;

create table if not exists ticket
(
	uid varchar(64) not null
		constraint ticket_pk
			primary key,
	train varchar(16),
	carriage integer,
	row_number integer,
	alphabet varchar(16),
	seat varchar(64)
);

alter table ticket owner to postgres;

create unique index if not exists ticket_uid_uindex
	on ticket (uid);