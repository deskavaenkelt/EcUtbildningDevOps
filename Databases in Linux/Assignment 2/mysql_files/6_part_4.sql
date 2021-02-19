SHOW TABLES;

# PART 4
# CREATE
insert into bank_accounts (first_name, last_name, holding)
values ('Lars', 'Dsve', 333);

# READ
SELECT *
FROM bank_accounts;

SELECT *
FROM bank_accounts
WHERE first_name = 'Lars';

# UPDATE
SELECT *
FROM bank_accounts
WHERE first_name = 'Lars';

UPDATE bank_accounts
set holding = 666
WHERE first_name = 'Lars'
  AND last_name = 'Dsve';

# DELETE
SELECT count(*)
FROM bank_accounts;

DELETE
FROM bank_accounts
WHERE first_name = 'Lars'
  AND last_name = 'Dsve';
