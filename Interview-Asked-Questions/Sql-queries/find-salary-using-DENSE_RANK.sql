SELECT salary
from (
      select salary,
      DENSE_RANK() over (order by salary DESC) as rnk
      from employee
)as t 
where rnk=9;
