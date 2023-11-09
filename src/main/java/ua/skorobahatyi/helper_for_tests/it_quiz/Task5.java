package ua.skorobahatyi.helper_for_tests.it_quiz;

/**
 *
 * Consider the following tables. All columns in both tables are not null.
 * image
 *
 *
 *
 * Assume that a single person may have any number of loans (including zero), and a loan must be paid in full on the stipulated end date.
 *
 * What will the following query return?
 *
 *
 * SELECT
 * p.person_id,
 * p.full_name,
 * SUM(CASE WHEN 1.end_date < CURRENT_DATE THEN 1.amount ELSE 0 END) AS total
 * FROM people p
 * JOIN loans 1 ON p.person_id = l.person_id AND 1.is_paid_out = FALSE
 * GROUP BY p.person_id, p.full_name
 *
 *
 *
 * The list of people who have only overdue payments with the sum of their overdue payments.
 * The list of people who have only remaining payments with the sum of their remaining payments.
 * The list of people who have overdue and/or remaining payments with the sum of their overdue payments.   (!!!)
 * The list of all people with the sum of their remaining payments.
 *
 *
 * */
public class Task5 {
}
