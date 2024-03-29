# Write your MySQL query statement below
with temporary_table(name,salary,departmentId,top_salary) as
(select e.name,e.salary,e.departmentId,FIRST_VALUE(e.salary) over(partition by departmentId order by salary desc) as      top_salary from Employee e)


select d.name as Department, t.name as Employee, t.salary as Salary 
from temporary_table t inner join Department d
on t.departmentId=d.id
where t.salary=t.top_salary;
