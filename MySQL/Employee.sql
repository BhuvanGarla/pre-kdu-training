CREATE DATABASE IF NOT EXISTS employee;
USE employee;

CREATE TABLE department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(255)
);

CREATE TABLE employee (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(255),
    salary DECIMAL(10, 2),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES department(department_id)
);

INSERT INTO department VALUES (1, 'Develop');
INSERT INTO department VALUES (2, 'Production');
INSERT INTO department VALUES (3, 'Test');

INSERT INTO employee VALUES (1, 'Amit Gupta', 60000.00, 1);
INSERT INTO employee VALUES (2, 'Govind', 65000.00, 2);
INSERT INTO employee VALUES (3, 'Samarth', 40000.00, 1);
INSERT INTO employee VALUES (4, 'Sankalp', 35000.00, 3);
INSERT INTO employee VALUES (5, 'Harish', 56000.00, 2);


SELECT e.employee_id, e.employee_name, d.department_name
FROM employee e
JOIN department d ON e.department_id = d.department_id;

SELECT employee_id, employee_name, salary
FROM employee
ORDER BY salary DESC;

SELECT d.department_name, AVG(e.salary) AS average_salary
FROM department d
JOIN employee e ON d.department_id = e.department_id
GROUP BY d.department_name;