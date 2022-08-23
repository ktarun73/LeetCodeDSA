# Write your MySQL query statement below

SELECT A.name as "Employee"
FROM Employee A 
LEFT JOIN Employee B
ON A.managerId=b.id
WHERE A.salary>B.salary;



# select a.name as "Employee"
# from Employee a
# LEFT JOIN Employee b
# ON a.managerId=b.id
# where a.salary>b.salary;