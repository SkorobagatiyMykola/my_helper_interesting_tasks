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

--1280. Students and Examinations
--https://leetcode.com/problems/students-and-examinations/
SELECT tabl1.student_id, tabl1.student_name, tabl1.subject_name, IFNULL(tabl2.attents,0) attended_exams FROM
        (SELECT * from Students, Subjects order by Students.student_id, Subjects.subject_name) tabl1
        LEFT JOIN
            (SELECT ex.student_id, ex.subject_name, count(*) attents  FROM Examinations ex
                 GROUP BY ex.student_id, ex.subject_name) tabl2
        on tabl1.student_id=tabl2.student_id and tabl1.subject_name=tabl2.subject_name
    ORDER BY tabl1.student_id, tabl1.subject_name;
--570. Managers with at Least 5 Direct Reports
--https://leetcode.com/problems/managers-with-at-least-5-direct-reports/description/?envType=study-plan-v2&envId=top-sql-50
SELECT e.name FROM Employee e INNER JOIN
        (SELECT e.managerId id, count(*) cnt FROM Employee e GROUP BY e.managerId HAVING count(*)>=5) grp
    ON e.id = grp.id;
--1075. Project Employees I
--https://leetcode.com/problems/project-employees-i/?envType=study-plan-v2&envId=top-sql-50
SELECT p.project_id project_id, cast( avg(e.experience_years) as decimal (10,2)) average_years FROM Project p
            LEFT JOIN Employee e ON p.employee_id=e.employee_id GROUP BY p.project_id;
--1068. Product Sales Analysis I
--https://leetcode.com/problems/product-sales-analysis-i/description/?envType=study-plan-v2&envId=top-sql-50
SELECT p.product_name product_name, s.year, s.price FROM Sales s LEFT JOIN Product p ON s.product_id=p.product_id;
--1661. Average Time of Process per Machine
--https://leetcode.com/problems/average-time-of-process-per-machine/description/?envType=study-plan-v2&envId=top-sql-50
SELECT a.machine_id, cast( 2*avg(a.time1) as decimal (10,3)) processing_time
        FROM (SELECT  machine_id, IF(activity_type='end',timestamp,-timestamp) time1 FROM Activity) a GROUP BY machine_id;
--1327. List the Products Ordered in a Period
--https://leetcode.com/problems/list-the-products-ordered-in-a-period/description/?envType=study-plan-v2&envId=top-sql-50
SELECT p.product_name, sum(unit) unit FROM Orders o LEFT JOIN Products p ON o.product_id=p.product_id
        WHERE o.order_date BETWEEN '2020-02-01' AND  '2020-02-29' GROUP BY o.product_id HAVING sum(unit)>=100;
--1667. Fix Names in a Table
--https://leetcode.com/problems/fix-names-in-a-table/description/?envType=study-plan-v2&envId=top-sql-50
SELECT user_id, CONCAT(UPPER(SUBSTRING(name,1,1)),LOWER(SUBSTRING(name,2))) name  FROM Users ORDER BY user_id;
--1978. Employees Whose Manager Left the Company
--https://leetcode.com/problems/employees-whose-manager-left-the-company/description/?envType=study-plan-v2&envId=top-sql-50
SELECT employee_id FROM Employees WHERE salary<30000 AND manager_id NOT IN (SELECT employee_id FROM Employees)  ORDER BY employee_id;
--610. Triangle Judgement
--https://leetcode.com/problems/triangle-judgement/description/?envType=study-plan-v2&envId=top-sql-50
SELECT x,y,z, IF ((x+y>z AND x+z>y AND y+z>x),'Yes','No') triangle FROM Triangle;
--1731. The Number of Employees Which Report to Each Employee
--https://leetcode.com/problems/the-number-of-employees-which-report-to-each-employee/description/?envType=study-plan-v2&envId=top-sql-50
SELECT e.employee_id, e.name, e2.count2 reports_count, CAST(e2.age2 AS SIGNED )average_age
    FROM Employees e RIGHT JOIN (SELECT e.reports_to reports_to, count(*) count2, avg(e.age) age2 FROM Employees e GROUP BY e.reports_to) e2 ON e.employee_id=e2.reports_to
    WHERE e.employee_id IS NOT NULL ORDER BY e.employee_id;
--619. Biggest Single Number
--https://leetcode.com/problems/biggest-single-number/description/?envType=study-plan-v2&envId=top-sql-50
SELECT max(num) num FROM MyNumbers WHERE num in (SELECT num FROM MyNumbers GROUP BY num HAVING count(*)=1)
--1581. Customer Who Visited but Did Not Make Any Transactions
--https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions/description/?envType=study-plan-v2&envId=top-sql-50
SELECT v.customer_id, count(*) count_no_trans  FROM Visits v LEFT JOIN Transactions t ON v.visit_id=t.visit_id where t.visit_id is NULL GROUP BY v.customer_id;
--197. Rising Temperature
--https://leetcode.com/problems/rising-temperature/description/?envType=study-plan-v2&envId=top-sql-50
SELECT w.id FROM Weather w LEFT JOIN
  (SELECT DATE_ADD(recordDate, Interval 1 DAY) recordDate, temperature FROM Weather) w2
    ON w.recordDate=w2.recordDate
        WHERE w2.recordDate IS NOT NULL AND w.temperature>w2.temperature;
--1211. Queries Quality and Percentage
--https://leetcode.com/problems/queries-quality-and-percentage/description/?envType=study-plan-v2&envId=top-sql-50
SELECT tab1.query_name query_name, tab1.quality quality, cast( IFNULL(100*count2/count1,0) as decimal(10,2)) poor_query_percentage FROM
 (SELECT query_name, cast(avg(rating/position) as decimal(10,2)) quality, count(*)  count1
 FROM Queries q GROUP BY query_name) tab1
  LEFT JOIN
      (SELECT query_name, count(*)  count2 FROM Queries q WHERE rating<3 GROUP BY query_name ) tab2
  ON tab1.query_name=tab2.query_name;
--196. Delete Duplicate Emails
--https://leetcode.com/problems/delete-duplicate-emails/description/?envType=study-plan-v2&envId=top-sql-50
DELETE p1 FROM Person p1 INNER JOIN Person p2 WHERE p1.id>p2.id AND p1.email=p2.email;
--1789. Primary Department for Each Employee
--https://leetcode.com/problems/primary-department-for-each-employee/description/?envType=study-plan-v2&envId=top-sql-50
SELECT employee_id, department_id FROM Employee WHERE primary_flag='Y'
        OR employee_id IN (SELECT employee_id FROM Employee GROUP BY employee_id HAVING count(*)=1)
--1517. Find Users With Valid E-Mails
--https://leetcode.com/problems/find-users-with-valid-e-mails/description/?envType=study-plan-v2&envId=top-sql-50
SELECT * FROM Users u WHERE REGEXP_LIKE(mail,'^[a-zA-Z]{1}[a-zA-Z0-9-._]*@leetcode\\.com$')
--1484. Group Sold Products By The Date
--https://leetcode.com/problems/group-sold-products-by-the-date/description/?envType=study-plan-v2&envId=top-sql-50
SELECT sell_date, count(DISTINCT product) num_sold, group_concat(DISTINCT product) products FROM Activities GROUP BY sell_date
                                       ORDER BY  sell_date, group_concat(DISTINCT product) ASC
--596. Classes More Than 5 Students
--https://leetcode.com/problems/classes-more-than-5-students/description/?envType=study-plan-v2&envId=top-sql-50
SELECT class FROM Courses GROUP BY class HAVING COUNT(*)>=5
--1633. Percentage of Users Attended a Contest
--https://leetcode.com/problems/percentage-of-users-attended-a-contest/description/?envType=study-plan-v2&envId=top-sql-50
SELECT contest_id, ROUND(100*count(*)/(SELECT count(*) FROM Users),2) percentage FROM Register r GROUP BY contest_id ORDER BY percentage DESC, contest_id