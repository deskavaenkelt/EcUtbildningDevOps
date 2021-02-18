CREATE DATABASE api_uses CHARACTER SET UTF8MB4;

DROP DATABASE api_uses;

USE api_uses;

# Create Tables
CREATE TABLE location
(
    id      INT         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    address VARCHAR(45) NOT NULL
);
DESCRIBE location;

CREATE TABLE users
(
    id       INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name     VARCHAR(45)  NOT NULL,
    email    VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL,
    location_id  INT          NOT NULL,
    FOREIGN KEY (location_id) REFERENCES location (id)
);
DESCRIBE users;

# CREATE
INSERT INTO location (address)
VALUES ('Göteborg'),
       ('Malmö'),
       ('Stockholm');

INSERT INTO users (name, email, password, location_id)
VALUES ('Adam', 'adam@mail.com', 'something', 1);

# READ
SELECT *
FROM location;
SELECT *
FROM users;

# UPDATE
UPDATE users
SET location_id = 3
WHERE name = 'Adam'
  AND password = 'something';

# DELETE
DELETE
FROM users
WHERE name = 'Adam';

# GET Id for at location
SELECT id
FROM location
WHERE address = 'Göteborg';

# View
CREATE VIEW all_info_minus_password AS
SELECT u.name, u.email, u.location_id
FROM users u
         JOIN location l on l.id = u.location_id;

SELECT *
FROM all_info_minus_password;



