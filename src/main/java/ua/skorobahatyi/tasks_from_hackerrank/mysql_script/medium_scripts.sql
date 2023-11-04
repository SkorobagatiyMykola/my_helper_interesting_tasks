The PADS
https://www.hackerrank.com/challenges/the-pads/problem?isFullScreen=true
SELECT CONCAT(Name,'(',SUBSTRING(Occupation,1,1),')')  FROM Occupations ORDER BY Name;
SELECT CONCAT('There are a total of ',count(*),' ',LCASE(occupation),'s.')
                FROM Occupations GROUP BY Occupation ORDER BY count(*);