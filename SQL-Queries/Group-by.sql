SELECT dept_id, COUNT(*) AS total
FROM Employee
GROUP BY dept_id;
