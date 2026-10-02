SELECT email, COUNT(*) AS cnt
FROM employee
GROUP BY email
HAVING COUNT(*) > 1;
