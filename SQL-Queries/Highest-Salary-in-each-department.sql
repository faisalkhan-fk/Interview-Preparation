--Find the highest salary in each department
select Department,MAX(salary) 
from employee
group by department;
