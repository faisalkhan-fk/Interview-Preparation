SELECT department, AVG(salary)
FROM Employee
GROUP BY department
HAVING AVG(salary) > 30000;
