--https://leetcode.com/problems/invalid-tweets/
-- 1683. Invalid Tweets
select t.tweet_id from Tweets t where length(t.content)>15;