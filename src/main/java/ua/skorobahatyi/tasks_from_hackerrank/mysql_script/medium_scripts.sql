--The PADS
--https://www.hackerrank.com/challenges/the-pads/problem?isFullScreen=true
SELECT CONCAT(Name,'(',SUBSTRING(Occupation,1,1),')')  FROM Occupations ORDER BY Name;
SELECT CONCAT('There are a total of ',count(*),' ',LCASE(occupation),'s.')
                FROM Occupations GROUP BY Occupation ORDER BY count(*);
-- Top Competitors
-- https://www.hackerrank.com/challenges/full-score/problem?isFullScreen=true
 SELECT CONCAT(tab2.hacker_id,' ',h.name) FROM (SELECT s.hacker_id, count(*) count1 FROM Submissions s
     INNER JOIN
     (SELECT c.challenge_id, d.score  FROM Challenges c
         LEFT JOIN Difficulty d ON c.difficulty_level=d.difficulty_level) t1 ON
         s.challenge_id=t1.challenge_id AND s.score=t1.score
     GROUP BY s.hacker_id HAVING count(*)>1) tab2
     JOIN Hackers h ON tab2.hacker_id=h.hacker_id
     ORDER BY tab2.count1 desc, tab2.hacker_id