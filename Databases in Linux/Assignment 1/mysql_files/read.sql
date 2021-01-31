SELECT *
FROM bank_accounts;

SELECT COUNT(*)
FROM bank_accounts;

SELECT *
FROM bank_accounts
WHERE first_name = 'Barn';

SELECT *
FROM bank_accounts
WHERE last_name = 'Heckner';

SELECT *
FROM bank_accounts
WHERE holding = 666;

SELECT *
FROM bank_accounts
WHERE holding > 400000;

SELECT COUNT(*)
FROM bank_accounts
WHERE holding > 400000;