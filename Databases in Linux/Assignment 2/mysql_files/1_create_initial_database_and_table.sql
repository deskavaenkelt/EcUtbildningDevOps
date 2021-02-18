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

SHOW TABLES;

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
