SELECT e1.name, e2.name, e1.salary
FROM Employee e1
JOIN Employee e2
ON e1.salary = e2.salary
AND e1.emp_id < e2.emp_id;
