SELECT department, name, salary
FROM (
    SELECT department, name, salary,
           RANK() OVER(PARTITION BY department ORDER BY salary DESC) as rnk
    FROM employees
) ranked_table
WHERE rnk = 1;
