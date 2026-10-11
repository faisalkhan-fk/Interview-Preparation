-- Query to select employees with above-average salary
select * from
employee
where salary > (select AVG(salary) from employee);
