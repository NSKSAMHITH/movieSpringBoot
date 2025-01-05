CREATE TABLE movieDB (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    genre VARCHAR(100) NOT NULL,
    director VARCHAR(255),
    duration DECIMAL(3,1) NOT NULL,
    imdbRating FLOAT CHECK (imdbRating >= 0 AND imdbRating <= 10)
);
