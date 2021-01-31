CREATE DATABASE databases_in_linux_assignment_1_mariadb;
USE databases_in_linux_assignment_1_mariadb;

CREATE TABLE bank_accounts (
	id INT AUTO_INCREMENT,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	holding INT,
  PRIMARY KEY (id)
);

SHOW TABLES;
DESCRIBE bank_accounts;
