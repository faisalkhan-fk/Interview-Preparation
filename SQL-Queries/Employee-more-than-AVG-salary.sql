--Find employees earning more than average salary
SELECT *
FROM Employee
WHERE salary > (SELECT AVG(salary) FROM Employee);
