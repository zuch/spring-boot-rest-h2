DROP TABLE IF EXISTS carriers;

CREATE TABLE carriers
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    name      VARCHAR(250) NOT NULL,
    call_sign VARCHAR(250) NOT NULL,
    country   VARCHAR(250) NOT NULL,
    iata      VARCHAR(2)   NOT NULL,
    icao      VARCHAR(3)   NOT NULL,
);

INSERT INTO carriers (name, call_sign, country, iata, icao)
VALUES ('Qantas', 'QANTAS', 'Australia', 'QF', 'QFA'),
       ('South African Airways', 'SPRINGBOK', 'South Africa', 'SA', 'SAA'),
       ('Emirates Airlines', 'EMIRATES', 'United Arab Emirates', 'EK', 'UAE'),
       ('Ethiopian Airlines', 'ETHIOPIAN', 'Ethiopia', 'ET', 'ETH'),
       ('American Airlines', 'AMERICAN', 'United States', 'AA', 'AAL'),
       ('Delta Air Lines', 'DELTA', 'United States', 'DL', 'DAL'),
       ('Lufthansa', 'LUFTHANSA', 'Germany', 'LH', 'DLH'),
       ('Air New Zealand', 'NEW ZEALAND', 'New Zealand', 'NZ', 'ANZ');
