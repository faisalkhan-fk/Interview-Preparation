select MAX(salary) AS second_maximum
from Employee 
where salary < (select MAX(salary) from Employee);
