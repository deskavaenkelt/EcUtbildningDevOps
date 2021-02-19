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

SELECT * FROM bank_accounts;

SHOW TABLES;
