package ua.skorobahatyi.helper_for_tests.it_quiz;

/**
 * How many rows does the following query return, and how many values in the result are NULL?
 *
 *
 * SELECT *
 * FROM a RIGHT JOIN b LEFT JOIN c
 * ON b.id = c.id ON a.id = b.id
 *
 *
 *
 * Two rows and two NULL values (both in the first row)
 * Four rows and six NULL values
 * Two rows and four NULL values
 * Two rows and two NULL values (one in each row)  (!!)
 *
 * */
public class Task3 {
}
