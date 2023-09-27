--1045. Customers Who Bought All Products
--https://leetcode.com/problems/customers-who-bought-all-products/description/?envType=study-plan-v2&envId=top-sql-50
SELECT c.customer_id FROM Customer c GROUP BY c.customer_id HAVING  COUNT(DISTINCT c.product_key)=(SELECT count(*) FROM Product)
--1070. Product Sales Analysis III
--https://leetcode.com/problems/product-sales-analysis-iii/description/?envType=study-plan-v2&envId=top-sql-50
SELECT s.product_id, s.year first_year, s.quantity, s.price FROM Sales s INNER JOIN
      (SELECT s.product_id, MIN(s.year) year FROM Sales s GROUP BY product_id) ss
        ON s.product_id=ss.product_id AND s.year=ss.year
--1934. Confirmation Rate
--https://leetcode.com/problems/confirmation-rate/description/?envType=study-plan-v2&envId=top-sql-50
SELECT sig.user_id user_id, ROUND(IFNULL(com2.count/com1.count,0), 2) confirmation_rate FROM Signups sig
  LEFT JOIN
 (SELECT user_id, count(*) count FROM Confirmations GROUP BY user_id) com1 ON sig.user_id=com1.user_id
        LEFT JOIN (SELECT user_id, count(*) count FROM  Confirmations WHERE action='confirmed' GROUP BY user_id) com2
ON sig.user_id=com2.user_id
--602. Friend Requests II: Who Has the Most Friends
--https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends/description/?envType=study-plan-v2&envId=top-sql-50
SELECT id, num FROM (SELECT fr1 id, count(distinct fr2) num FROM
(SELECT requester_id fr1, accepter_id fr2 FROM RequestAccepted UNION SELECT accepter_id fr1, requester_id fr2  FROM RequestAccepted) tab1
GROUP BY fr1 ) tab2 ORDER BY num DESC LIMIT 1
--1164. Product Price at a Given Date
--https://leetcode.com/problems/product-price-at-a-given-date/description/?envType=study-plan-v2&envId=top-sql-50
SELECT tab1.product_id, IFNULL(tab3.new_price, 10) price FROM (SELECT product_id FROM Products GROUP BY product_id) tab1
 LEFT JOIN (SELECT product_id, max(change_date) change_date FROM Products WHERE change_date<='2019-08-16' GROUP BY product_id) tab2
 ON tab1.product_id=tab2.product_id
 LEFT JOIN Products tab3
 ON tab1.product_id=tab3.product_id AND tab2.change_date=tab3.change_date