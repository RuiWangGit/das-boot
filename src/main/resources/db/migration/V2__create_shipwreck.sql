CREATE TABLE IF NOT EXISTS shipwreck(
  id INT AUTO_INCREMENT,
  name VARCHAR(255),
  description TEXT,
  status VARCHAR(50),
  depth INT,
  latitude DOUBLE,
  longitude DOUBLE,
  year_discovered INT,
  PRIMARY KEY(id)
);

