SHOW DATABASES;

# Old database to create and use in this project
CREATE DATABASE databases_in_linux_assignment_2_mariadb;
USE databases_in_linux_assignment_2_mariadb;

CREATE TABLE bank_accounts
(
    id         INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name  VARCHAR(50),
    holding    INT
);
DESCRIBE bank_accounts;

SELECT *
FROM bank_accounts;

SHOW TABLES;

# Insert data from '2_insert_into_bank_accounts.sql'

# Plan part 1
CREATE TABLE locations
(
    id      INT PRIMARY KEY AUTO_INCREMENT,
    country VARCHAR(3),
    address VARCHAR(50)
);
DESCRIBE locations;

INSERT INTO locations (country, address)
VALUES ('SE', 'Vimmerbygatan 20'),
       ('US', 'Asteroid road 5'),
       ('US', 'Comet road 41'),
       ('SE', 'Brunnsgatan 7');

SELECT *
FROM locations;

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

# PART 3
SELECT b.first_name, b.last_name, l.country
FROM relationship r
         INNER JOIN bank_accounts b ON r.bank_accounts_id = b.id
         INNER JOIN locations l on r.locations_id = l.id
WHERE country = 'SE';

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

