create table worker(
WORKER_ID SERIAL PRIMARY KEY,
FIRST_NAME VARCHAR(40),
LAST_NAME VARCHAR(40),
SALARY NUMERIC,
JOINING_DATE DATE,
DEPARTMENT VARCHAR(40)
);

CREATE TABLE bonus(
WORKER_REF_ID INT REFERENCES worker(WORKER_ID),
BONUS_AMOUNT NUMERIC,
BONUS_DATE DATE,
PRIMARY KEY (WORKER_REF_ID,BONUS_DATE)
);

CREATE TABLE title(
WORKER_REF_ID INT REFERENCES worker(WORKER_ID),
WORKER_TITLE VARCHAR(40),
AFFECTED_FROM DATE,
PRIMARY KEY(WORKER_REF_ID , AFFECTED_FROM)
);

INSERT INTO worker (FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
('Monika', 'Arora', 100000, '2020-02-14', 'HR'),
('Niharika', 'Verma', 80000, '2011-02-14', 'Admin'),
('Vishal', 'Singhal', 300000, '2020-02-14', 'HR'),
('Amitabh', 'Singh', 500000, '2020-02-14', 'Admin'),
('Vivek', 'Bhati', 500000, '2011-06-14', 'Admin'),
('Vipul', 'Diwan', 200000, '2011-06-14', 'Account'),
('Satish', 'Kumar', 75000, '2020-01-14', 'Account'),
('Geetika', 'Chauhan', 90000, '2011-04-14', 'Admin');
SELECT * FROM WORKER;

INSERT INTO bonus  VALUES
(1, 5000, '2020-02-16'),
(2, 3000, '2011-06-16'),
(3, 4000, '2020-02-16'),
(4, 4500, '2020-02-16'),
(5, 3500, '2011-02-16');

INSERT INTO title VALUES
(1, 'Manager', '2016-02-20'),
(2, 'Executive', '2016-06-11'),
(8, 'Executive', '2016-06-11'),
(5, 'Manager', '2016-06-11'),
(4, 'Asst. Manager', '2016-06-11'),
(7, 'Executive', '2016-06-11'),
(6, 'Lead', '2016-06-11'),
(3, 'Lead', '2016-06-11');

--QUESTION 1
SELECT W.FIRST_NAME,W.SALARY,T.WORKER_TITLE
FROM WORKER W JOIN TITLE T ON
W.WORKER_ID = T.WORKER_REF_ID;

--QUESTION 2
CREATE FUNCTION get_worker_count_by_nth_highest_salary(nth integer)
RETURNS integer as $$
DECLARE 
	nth_highest_salary numeric;
	count_workers integer;
BEGIN
	SELECT DISTINCT SALARY INTO nth_highest_salary
	FROM worker
	ORDER BY SALARY DESC
	OFFSET nth - 1 	LIMIT 1;

	SELECT COUNT(*) INTO count_workers
	FROM worker WHERE SALARY = nth_highest_salary;

	RETURN count_workers;
END;
$$ LANGUAGE plpgsql;

select get_worker_count_by_nth_highest_salary(1);
select get_worker_count_by_nth_highest_salary(2);
select get_worker_count_by_nth_highest_salary(3);
select get_worker_count_by_nth_highest_salary(4);
select get_worker_count_by_nth_highest_salary(5);
select get_worker_count_by_nth_highest_salary(6);
select get_worker_count_by_nth_highest_salary(7);
