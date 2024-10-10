CREATE TABLE pizza (
    pizza_id VARCHAR(10) PRIMARY KEY,
    cust_id VARCHAR(10),
    partner_id VARCHAR(10),
    pizza_name VARCHAR(15),
    pizza_type VARCHAR(15),
    order_date DATE,
    amount BIGINT
);

CREATE TABLE customer (
    cust_id VARCHAR(10) PRIMARY KEY,
    cust_name VARCHAR(20),
    cust_phone BIGINT,
    cust_address VARCHAR(50)
);

CREATE TABLE delivery_partner (
    partner_id VARCHAR(10) PRIMARY KEY,
    partner_name VARCHAR(15),
    rating BIGINT
);

INSERT INTO pizza (pizza_id, cust_id, partner_id, pizza_name, pizza_type, order_date, amount) VALUES
('P001', 'C001', 'D001', 'Pepperoni', 'Extra Large', '2024-10-01', 1500),
('P002', 'C002', 'D002', 'Veggie', 'Large', '2024-10-02', 1200),
('P003', 'C003', 'D001', 'Margherita', 'Medium', '2024-10-03', 1000),
('P004', 'C001', 'D003', 'BBQ Chicken', 'Extra Large', '2024-10-04', 1600),
('P005', 'C004', 'D002', 'Hawaiian', 'Small', '2024-10-05', 800);

INSERT INTO customer (cust_id, cust_name, cust_phone, cust_address) VALUES
('C001', 'John Doe', 1234567890, '123 Main St'),
('C002', 'Jane Smith', 9876543210, '456 Oak St'),
('C003', 'Alice Johnson', 5556667777, '789 Pine St'),
('C004', 'Bob Brown', 2223334444, '321 Maple St');

INSERT INTO delivery_partner (partner_id, partner_name, rating) VALUES
('D001', 'UberEats', 4),
('D002', 'DoorDash', 5),
('D003', 'GrubHub', 3);

select * from pizza;
select * from customer;
select * from delivery_partner;

update pizza set amount = amount*0.97 
where pizza_type= 'Extra Large'

select * from pizza

