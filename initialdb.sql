create database airline;
use airline;

create table passenger(
pid int not null, 
pname varchar(50) not null, 
password varchar(30) not null, 
email varchar(50), 
contact bigint not null, 
primary key(pid));


create table booking(
    pnr_no bigint not null,
    travel_date date not null,
    source_airport varchar(50) not null,
    destination_airport varchar(50) not null,
    status enum('new','confirm','hold') not null,
    seat_preference enum('middle','aisle','window') not null,
    meal_preference enum('veg','non-veg') not null,
    pid int not null,
    primary key(pnr_no),
    foreign key(pid) references passenger(pid));




insert into passenger values(1111111 , 'Rajesh Vishwakarma','12345', 'rajeshvishwa@gmail.com', '7654646466' );
insert into passenger values(1111112, 'Shubham Rathani', '12345', 'shubhrathani@gmail.com', '7654546447' );
insert into passenger values(1111113, 'Vishnu Kalyan', '12345', 'vishkalyan@gmail.com', '7000035260' );
insert into passenger values(1111114, 'Param Durge', '12345', 'paramdurges@gmail.com', '7477076453' );
insert into passenger values(1111115, 'Ram Subramanian', '12345', 'ramsubramaniank@gmail.com', '8985265434' );



insert into booking values( 1111201,'2021-10-03','hyderabad','banglore','confirm','window','veg',1111111);
insert into booking values( 1111211,'2021-11-03','hyderabad','banglore','confirm','window','veg',1111112);
insert into booking values( 1211121,'2021-12-03','hyderabad','banglore','confirm','window','veg',1111113);
insert into booking values( 1131121,'2021-03-13','hyderabad','banglore','confirm','window','veg',1111114);
insert into booking values( 1114121,'2021-03-14','hyderabad','banglore','confirm','window','veg',1111115);
insert into booking values( 1111521,'2021-03-15','hyderabad','banglore','confirm','middle','non-veg',1111111);
insert into booking values( 1111261,'2021-03-16','hyderabad','banglore','confirm','middle','non-veg',1111112);
insert into booking values( 1111217,'2021-03-17','hyderabad','banglore','confirm','middle','non-veg',1111113);
insert into booking values( 1111218,'2021-03-18','hyderabad','banglore','confirm','middle','non-veg',1111114);
insert into booking values( 1111210,'2021-03-19','hyderabad','banglore','confirm','middle','non-veg',1111115);