--https://leetcode.com/problems/invalid-tweets/
-- 1683. Invalid Tweets
select t.tweet_id from Tweets t where length(t.content)>15;

--https://leetcode.com/problems/article-views-i/?envType=study-plan-v2&envId=top-sql-50
--1148. Article Views I
select distinct v.author_id id from Views v where v.author_id=v.viewer_id order by v.author_id;
--1141. User Activity for the Past 30 Days I
--https://leetcode.com/problems/user-activity-for-the-past-30-days-i/?envType=study-plan-v2&envId=top-sql-50
select a.activity_date day, count(distinct user_id) active_users from Activity a
          where a.activity_date between '2019-06-27' and '2019-07-27'
          group by a.activity_date;
--182. Duplicate Emails
--https://leetcode.com/problems/duplicate-emails/
SELECT p.email Email FROM Person p GROUP BY p.email HAVING count(p.email)>=2;
--183. Customers Who Never Order
--https://leetcode.com/problems/customers-who-never-order/description/
SELECT c.name Customers FROM Customers c LEFT JOIN Orders o ON c.id=o.customerId WHERE o.customerId IS NULL;
--1729. Find Followers Count
--https://leetcode.com/problems/find-followers-count/?envType=study-plan-v2&envId=top-sql-50
SELECT f.user_id user_id, count(f.follower_id) followers_count FROM Followers f GROUP BY f.user_id ORDER BY f.user_id;
--1251. Average Selling Price
--https://leetcode.com/problems/average-selling-price/?envType=study-plan-v2&envId=top-sql-50
SELECT tab.product_id, cast(SUM(tab.all_price)/SUM(tab.units) as decimal (10,2))average_price FROM
      (SELECT p.product_id product_id,  p.price*u.units all_price, u.units units FROM Prices p
                LEFT JOIN UnitsSold u on p.product_id=u.product_id
                 and (u.purchase_date>=p.start_date and u.purchase_date<=p.end_date)) as tab
   GROUP BY tab.product_id;
--577. Employee Bonus
--https://leetcode.com/problems/employee-bonus/description/?envType=study-plan-v2&envId=top-sql-50
SELECT e.name name, b.bonus bonus FROM Employee e LEFT JOIN Bonus b on e.empId=b.empId
        where ( b.bonus<1000 OR b.bonus IS NULL);
--620. Not Boring Movies
--https://leetcode.com/problems/not-boring-movies/description/?envType=study-plan-v2&envId=top-sql-50
SELECT id, movie, description, rating FROM Cinema WHERE MOD (id,2)=1 AND description !='boring' ORDER BY rating DESC;