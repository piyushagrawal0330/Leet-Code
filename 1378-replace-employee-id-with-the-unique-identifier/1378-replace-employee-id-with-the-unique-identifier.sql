# Write your MySQL query statement below
select Employees.name,EmployeeUNI.unique_id from Employees left join employeeUNI on Employees.id = EmployeeUNI.id;