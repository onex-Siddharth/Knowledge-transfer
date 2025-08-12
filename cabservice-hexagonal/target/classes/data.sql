CREATE TABLE cabs (
  id INT PRIMARY KEY,
  driver_name VARCHAR(255),
  car_model VARCHAR(255),
  available BOOLEAN
);

INSERT INTO cabs (id, driver_name, car_model, available) VALUES (1, 'John Doe', 'Toyota Camry', true);
INSERT INTO cabs (id, driver_name, car_model, available) VALUES (2, 'Jane Smith', 'Honda Civic', false);
INSERT INTO cabs (id, driver_name, car_model, available) VALUES (3, 'Mike Johnson', 'Ford Focus', true);
