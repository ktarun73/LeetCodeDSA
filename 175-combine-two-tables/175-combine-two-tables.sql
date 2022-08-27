# Write your MySQL query statement below
SELECT p.firstName , p.lastName , a.city , a.state FROM Person as P
INNER JOIN Address as a ON p.personId=a. personId
UNION
SELECT p.firstName , p.lastName , a.city , a.state FROM Person as P
LEFT JOIN Address as a ON p.personId=a. personId;