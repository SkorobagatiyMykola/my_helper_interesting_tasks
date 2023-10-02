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
--176. Second Highest Salary
--https://leetcode.com/problems/second-highest-salary/description/?envType=study-plan-v2&envId=top-sql-50
SELECT max(salary) SecondHighestSalary FROM  (SELECT distinct salary FROM Employee ORDER BY salary DESC LIMIT 1 OFFSET 1) tab LIMIT 1
--1193. Monthly Transactions I
--https://leetcode.com/problems/monthly-transactions-i/description/?envType=study-plan-v2&envId=top-sql-50
SELECT T1.month, T1.country, T1.trans_count, IFNULL(T2.approved_count,0) approved_count,
                      T1.trans_total_amount, IFNULL(T2.approved_total_amount,0) approved_total_amount FROM
(SELECT month, country, count(*) trans_count, sum(amount) trans_total_amount FROM (SELECT DATE_FORMAT(trans_date,"%Y-%m") month, country, state, amount FROM Transactions) tab1 GROUP BY month, country) T1 LEFT JOIN
(SELECT month, country, count(*) approved_count, sum(amount) approved_total_amount FROM (SELECT DATE_FORMAT(trans_date,"%Y-%m") month, country, state, amount FROM Transactions WHERE state='approved') tab2 GROUP BY month, country) T2
ON T1.month=T2.month and T1.country=T2.country
--1174. Immediate Food Delivery II
--https://leetcode.com/problems/immediate-food-delivery-ii/description/?envType=study-plan-v2&envId=top-sql-50
SELECT ROUND (100*(SELECT count(*) FROM (SELECT customer_id, min(order_date) ord1, min(customer_pref_delivery_date) del2 FROM Delivery GROUP BY customer_id HAVING ord1=del2) tab2)/count(*),2) immediate_percentage  FROM (SELECT customer_id, min(order_date) ord1, min(customer_pref_delivery_date) del2 FROM Delivery GROUP BY customer_id) tab1
--550. Game Play Analysis IV
--https://leetcode.com/problems/game-play-analysis-iv/description/?envType=study-plan-v2&envId=top-sql-50
 SELECT ROUND((SELECT count(*) FROM Activity tab1 RIGHT JOIN  (SELECT player_id, DATE_ADD(min(event_date),INTERVAL 1 DAY) next FROM Activity GROUP BY player_id) tab2  ON tab1.player_id= tab2.player_id WHERE tab1.event_date=tab2.next)/ (SELECT count(distinct player_id) FROM Activity),2) fraction FROM Activity LIMIT 1
--180. Consecutive Numbers
--https://leetcode.com/problems/consecutive-numbers/description/?envType=study-plan-v2&envId=top-sql-50
 SELECT  distinct l1.num  ConsecutiveNums FROM
(SELECT id, num FROM Logs) l1
INNER JOIN (SELECT (id-1) id2, num FROM Logs) l2 ON l1.id=l2.id2 and l1.num=l2.num
INNER JOIN (SELECT (id-2) id3, num FROM Logs) l3 ON l1.id=l3.id3 and l1.num=l3.num
--1907. Count Salary Categories
--https://leetcode.com/problems/count-salary-categories/description/?envType=study-plan-v2&envId=top-sql-50
SELECT tab1.category, IFNULL(tab2.accounts_count,0) accounts_count FROM (SELECT IF(1>0,'Low Salary','') category FROM Accounts
  UNION SELECT IF(1>0,'High Salary','') category FROM Accounts
  UNION SELECT IF(1>0,'Average Salary','') category FROM Accounts) tab1
  LEFT JOIN
  (SELECT category, count(*) accounts_count FROM (SELECT IF(income<20000,'Low Salary', IF(income>50000,'High Salary','Average Salary')) category, income FROM  Accounts) t1 GROUP BY category) tab2
  ON tab1.category=tab2.category
--1341. Movie Rating
--https://leetcode.com/problems/movie-rating/description/?envType=study-plan-v2&envId=top-sql-50
(SELECT name results FROM Users u LEFT JOIN
 (SELECT user_id, count(*) count_movies FROM MovieRating  GROUP BY user_id) tab1
 ON u.user_id=tab1.user_id ORDER BY tab1.count_movies DESC, u.name limit 1)
UNION ALL
(SELECT title results FROM Movies m LEFT JOIN
(SELECT movie_id, ROUND(avg(rating),2) rating FROM MovieRating WHERE DATE_FORMAT(created_at,'%Y-%m')='2020-02' GROUP BY movie_id) tab2
ON m.movie_id=tab2.movie_id ORDER BY tab2.rating DESC, m.title limit 1)
