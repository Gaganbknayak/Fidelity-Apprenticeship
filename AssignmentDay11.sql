create table Customers(
CustomerID int primary key,
CustomerName varchar(100) not null,
ContactName varchar(100),
Country varchar(50) default 'India'
)

create table Suppliers(
SupplierID int primary key,
SupplierName varchar(50) not null,
ContactName varchar(50),
country varchar(50)
);

create table Shipperrs(
ShipperID int primary key,
CompanyName varchar(50) not null unique
)

Create table Products(
ProductID int primary key,
ProductName varchar(50) not null,
SupplierID int,
UnitPrice decimal(10,2),
foreign key(SupplierID) references Suppliers(SupplierID)
)

create table Orders(
OrderID int primary key,
CustomerID int not null,
OrderDate date not null,
ShippedDate date,
ShipperId int,
foreign key(CustomerID) references Customers(CustomerID),
Foreign key (ShipperID) references Shipperrs(ShipperID),
Check(ShippedDate> OrderDate)
)

Create table OrderDetails(
OrderID int primary key,
ProductID int not null,
Quantity int not null check(Quantity > 0),
UnitPrice decimal(10,2),
Foreign key (OrderID) references Orders(OrderID) ,
Foreign key (ProductID) references Products(ProductID)
)

insert into Customers(CustomerID, CustomerName,ContactName,Country) values(1,'Gagan','Madhu','India'),
(2,'Ajith','Sumanth','USA');
insert into Suppliers values (1,'supplier A','Ganesh','UK'),(2,'supplier B','Kiran','Canada');
insert into Shipperrs values(1,'shipper A'),(2,'shipper B')
insert into Products values(1,'Laptop',1,50000.00),(2,'Mobile',2,100000.00)
insert into Orders values(1,1,'2024-01-01','2024-02-05',1),(2,2,'2024-02-10','2024-02-20',2)
insert into OrderDetails values(1,1,5,50000.00),(2,2,10,100000.00)
select * from Customers;
select * from Suppliers;
select * from Shipperrs;
select * from Orders;
select * from OrderDetails;













