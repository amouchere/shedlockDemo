drop database if exists shedlock;
create database if not exists shedlock;

grant all privileges on shedlock.* to 'shed'@'%'
identified by 'shed'
with grant option;
