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