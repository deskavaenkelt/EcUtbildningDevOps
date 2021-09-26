# First database run
USE mydb;

CREATE TABLE books
(
    id    INT         NOT NULL AUTO_INCREMENT,
    title VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO books(title)
VALUES ("jack");

SELECT *
FROM books;

# Second database run
USE mydb;

SELECT title
FROM books
WHERE id = 1;