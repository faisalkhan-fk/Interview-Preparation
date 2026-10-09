--SQL query to combine person and address tables
Select p.firstName, p.lastName,a.city,a.state
from person p
left join address a
ON p.personId=a.personId;
