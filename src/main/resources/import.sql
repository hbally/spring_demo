drop table if exists city;

create table city (id int primary key auto_increment, name varchar(64), state varchar(64),country varchar(64));

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');
insert into city (name, state, country) values ('San Francisco2', 'CA', 'US');
insert into city (name, state, country) values ('San Francisco3', 'CA', 'US');
insert into city (name, state, country) values ('San Francisco4', 'CA', 'US');