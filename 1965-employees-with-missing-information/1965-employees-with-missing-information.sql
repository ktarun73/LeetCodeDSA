SELECT employee_id FROM Employees
WHERE employee_id NOT IN(
                    SELECT E.employee_id FROM Employees 
                    AS E INNER JOIN Salaries AS S ON
                    E.employee_id=S.employee_id
)
UNION
SELECT employee_id FROM Salaries
WHERE employee_id NOT IN(
                    SELECT E.employee_id FROM Employees 
                    AS E INNER JOIN Salaries AS S ON
                    E.employee_id=S.employee_id
)

ORDER BY employee_id;
