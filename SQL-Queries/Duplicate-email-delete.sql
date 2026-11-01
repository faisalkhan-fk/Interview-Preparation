DELETE e1
FROM employee e1
JOIN employee e2
    ON e1.email = e2.email
    AND e1.emp_id > e2.emp_id;
