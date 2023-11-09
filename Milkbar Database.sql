drop database Milkbar;
create database if not exists Milkbar;
use milkbar;
create table  customer(
cus_id varchar(10) primary key,
cus_name varchar (25),
address text,
tel_number varchar(10)
);
create table  employee(
emp_id varchar(10) primary key,
emp_name varchar (25),
address text,
email varchar(40),
salary double
);