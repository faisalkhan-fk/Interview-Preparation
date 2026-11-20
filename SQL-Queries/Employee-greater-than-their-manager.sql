SELECT e.name AS Employee_Name
FROM employees e
JOIN employees m 
  ON e.manager_id = m.id
WHERE e.salary > m.salary;
