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