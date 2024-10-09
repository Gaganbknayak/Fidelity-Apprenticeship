create table Customers(
customer_id varchar(15) primary key,
customer_name varchar(20) not null,
address varchar(20),
phone_no bigint,
email_id varchar(20) not null
);

create table Delivery_partners(
partner_id varchar(10) primary key,
partner_name varchar(20) not null,
phone_no bigint,
rating int check (rating between 1 and 5)
);

create table Hotel_details(
hotel_id varchar(10) primary key,
hotel_name varchar(20) not null,
hotel_type varchar(20),
rating int
);

create table Orders(
order_id varchar(10) primary key,
customer_id varchar(10),
hotel_id varchar(10),
partner_id varchar(10),
order_date date,
order_amount int not null,
foreign key (customer_id) references Customers(customer_id),
foreign key (hotel_id) references Hotel_details(hotel_id),
foreign key (partner_id) references Delivery_partners(partner_id)
);

insert into Customers values('CUST1001','GAGAN','KOCHI',9513475687,'gaganbk@gmail.com'),
('CUST1002','CHARLES','ALLEPY',9856367486,'charles@gmail.com'),
('CUST1003','SUDHAKAR','KOCHI',9856323869,'sudhakar@gmail.com'),
('CUST1004','JAGADISH','CHENNAI',9856326666,'jagadish@gmail.com'),
('CUST1005','ALBERT','ALLEPY',9856328659,'albert@gmail.com');

insert into Delivery_partners values('DP1001','Gaganbk',9876543210,4),
('DP1002','Sanjay Gupta',9988776655,5),
('DP1003','Manoj Sharma',9123465788,3),
('DP1004','Vikram Patil',9846273826,2);


insert into Hotel_Details values ('H1001','A2B','VEG',1),
('H1002','BBQ Nation','NONVEG',1),
('H1003','Dominos','VEG',0);

insert into Orders values('ORD1001','CUST1001','H1001','DP1001','2024-10-01',500),
('ORD1002','CUST1002','H1002','DP1002','2024-10-02',1200),
('ORD1003','CUST1003','H1003','DP1003','2024-10-03',1500),
('ORD1004','CUST1004','H1001','DP1004','2024-10-04',1000);

select * from Orders;
select * from Hotel_Details;
select * from Customers;
select * from Delivery_partners;

--display dp details based on ratings
select partner_id,partner_name,phone_no
from Delivery_partners
where rating between 3 and 5
order by partner_id;

--updating phone number 
Update Customers set phone_no='9876543210'
where customer_id = 'CUST1004'

--display customers having gmail
select customer_id,customer_name,address,phone_no from Customers
where email_id like '%@gmail.com'
order by customer_id

--change data type of customer id to int
alter table Customers modify customer_id int;

--change field name Rating to hotel_rating 
alter table Hotel_Details CHANGE rating  Hotel_Rating int;

-- display hotel info
select Concat(hotel_name, ' is a ' , hotel_type , ' Hotel.') as HOTEL_INFO
from Hotel_Details order by hotel_name desc

--hotel that took more than 5 orders (I checked for more than 1 orders )
select hd.hotel_id, hd.hotel_name,count(o.order_id) as No_Of_Orders
from Hotel_Details hd
JOIN Orders o ON hd.hotel_id = o.hotel_id
group by hd.hotel_id, hd.hotel_name
having count(o.order_id) > 1
order by hd.hotel_id;

--display hotel not taking orders in may 2019
select hd.hotel_id, hd.hotel_name, hd.hotel_type
from Hotel_Details hd
Left JOIN Orders o on hd.hotel_id = o.hotel_id 
and Extract(Month from o.order_date) = 5
and Extract(Year from o.order_date) = 2019
where o.order_id is  null
order by hd.hotel_id

--display order details
select o.order_id,c.customer_name,hd.hotel_name,o.order_amount
from Orders o JOIN Customers c on o.customer_id = c.customer_id
Join Hotel_Details hd on o.hotel_id = hd.hotel_id
Order by o.order_id

--Thank You

