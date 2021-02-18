CREATE DATABASE diamonds;

USE diamonds;

CREATE TABLE specifications
(
    id      INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    carat   FLOAT,
    cut     VARCHAR(30),
    color   VARCHAR(5),
    clarity VARCHAR(5),
    depth   FLOAT,
    table_d INT,
    price   INT,
    x       FLOAT,
    y       FLOAT,
    z       FLOAT
);

#DROP TABLE specifications;

# INSERT INTO specifications (carat, cut, color, clarity, depth, table_d, price, x, y, z) VALUES ();

DESCRIBE specifications;

SELECT * FROM specifications;