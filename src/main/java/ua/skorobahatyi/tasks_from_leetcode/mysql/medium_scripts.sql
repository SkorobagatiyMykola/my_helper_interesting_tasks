--1045. Customers Who Bought All Products
--https://leetcode.com/problems/customers-who-bought-all-products/description/?envType=study-plan-v2&envId=top-sql-50
SELECT c.customer_id FROM Customer c GROUP BY c.customer_id HAVING  COUNT(DISTINCT c.product_key)=(SELECT count(*) FROM Product)
--1070. Product Sales Analysis III
--https://leetcode.com/problems/product-sales-analysis-iii/description/?envType=study-plan-v2&envId=top-sql-50
SELECT s.product_id, s.year first_year, s.quantity, s.price FROM Sales s INNER JOIN
      (SELECT s.product_id, MIN(s.year) year FROM Sales s GROUP BY product_id) ss
        ON s.product_id=ss.product_id AND s.year=ss.year