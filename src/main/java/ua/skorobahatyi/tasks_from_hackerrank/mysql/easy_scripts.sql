-- TRIANGLES
--https://www.hackerrank.com/challenges/what-type-of-triangle/problem?isFullScreen=true
SELECT
    CASE
        WHEN A>=B+C OR B>=A+C OR C>=A+b THEN 'Not A Triangle'
        WHEN A=B AND B=C THEN 'Equilateral'
        WHEN A=B OR B=C OR A=C THEN 'Isosceles'
        ELSE 'Scalene'
    END
FROM TRIANGLES;
--Top Earners
--https://www.hackerrank.com/challenges/earnings-of-employees/problem?isFullScreen=true
SELECT (salary*months) s, count(*)  FROM Employee GROUP BY s HAVING s=(SELECT max(salary*months)  FROM Employee) ;