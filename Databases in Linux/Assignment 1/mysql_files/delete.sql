SELECT count(*)
FROM bank_accounts;

SELECT count(*)
FROM bank_accounts
WHERE holding = 666;

DELETE
FROM bank_accounts
WHERE holding = 666;
