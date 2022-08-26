# Write your MySQL query statement below
SELECT user_id , CONCAT(UCASE(SUBSTR(NAME,1,1)) , LCASE(SUBSTR(NAME,2))) AS name FROM Users
ORDER BY user_id;