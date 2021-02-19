SHOW TABLES;

# PART 3
SELECT b.first_name, b.last_name, l.country
FROM relationship r
         INNER JOIN bank_accounts b ON r.bank_accounts_id = b.id
         INNER JOIN locations l on r.locations_id = l.id
WHERE country = 'SE';
