DROP TABLE IF EXISTS carriers;

CREATE TABLE carriers (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  call_sign VARCHAR(250) NOT NULL,
  country VARCHAR(250) NOT NULL,
  iata VARCHAR(250) NOT NULL,
  icao VARCHAR(250) NOT NULL,
);

INSERT INTO carriers (name, call_sign, country, iata, icao) VALUES
  ('Qantas', 'QANTAS', 'Australia', 'QF', 'QFA'),
  ('South African Airways', 'SPRINGBOK', 'South Africa', 'SA', 'SAA'),
  ('Emirates Airlines', 'EMIRATES', 'United Arab Emirates', 'EK', 'UAE');
  //NZ  ANZ	Air New Zealand	NEW ZEALAND	New Zealand
//ET	ETH	Ethiopian Airlines	ETHIOPIAN	Ethiopia
//AA	AAL	American Airlines	AMERICAN	United States
//DL	DAL	Delta Air Lines	DELTA	United States
//LH	DLH	Lufthansa	LUFTHANSA	Germany

