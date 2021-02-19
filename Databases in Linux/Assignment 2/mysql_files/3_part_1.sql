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

SELECT * FROM locations;

SHOW TABLES;
