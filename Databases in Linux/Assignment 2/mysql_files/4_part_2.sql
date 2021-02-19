SHOW TABLES;

# Plan part 2
CREATE TABLE relationship
(
    id               INT PRIMARY KEY AUTO_INCREMENT,
    bank_accounts_id INT,
    locations_id     INT,
    FOREIGN KEY (bank_accounts_id) REFERENCES bank_accounts (id),
    FOREIGN KEY (locations_id) REFERENCES locations (id)
);
DESCRIBE relationship;

SELECT *
FROM bank_accounts;

SELECT id
FROM bank_accounts
WHERE first_name = 'Corbin'
  AND last_name = 'Hauck';

SELECT id
FROM bank_accounts
WHERE first_name = 'Vanya'
  AND last_name = 'Worsell';

SELECT id
FROM bank_accounts
WHERE first_name = 'Eldon'
  AND last_name = 'McCartan';

SELECT id
FROM bank_accounts
WHERE first_name = 'Ingunna'
  AND last_name = 'Castellucci';

SELECT id
FROM locations
WHERE country = 'SE'
  AND address = 'Vimmerbygatan 20';

SELECT id
FROM locations
WHERE country = 'US'
  AND address = 'Asteroid road 5';

SELECT id
FROM locations
WHERE country = 'US'
  AND address = 'Comet road 41';

SELECT id
FROM locations
WHERE country = 'SE'
  AND address = 'Brunnsgatan 7';

INSERT INTO relationship (bank_accounts_id, locations_id)
VALUES ((SELECT id FROM bank_accounts WHERE first_name = 'Corbin' AND last_name = 'Hauck'),
        (SELECT id FROM locations WHERE country = 'SE' AND address = 'Brunnsgatan 7')),
       ((SELECT id FROM bank_accounts WHERE first_name = 'Vanya' AND last_name = 'Worsell'),
        (SELECT id FROM locations WHERE country = 'US' AND address = 'Asteroid road 5')),
       ((SELECT id FROM bank_accounts WHERE first_name = 'Eldon' AND last_name = 'McCartan'),
        (SELECT id FROM locations WHERE country = 'SE' AND address = 'Vimmerbygatan 20')),
       ((SELECT id FROM bank_accounts WHERE first_name = 'Ingunna' AND last_name = 'Castellucci'),
        (SELECT id FROM locations WHERE country = 'US' AND address = 'Comet road 41'));

SELECT *
FROM relationship;

SHOW TABLES;

