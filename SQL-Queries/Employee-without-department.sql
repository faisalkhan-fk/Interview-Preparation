--Find employees without a department
SELECT *
FROM Employee
WHERE department_id IS NULL;
