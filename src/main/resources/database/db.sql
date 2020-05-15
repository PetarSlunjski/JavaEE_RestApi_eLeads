CREATE TABLE
    engine_type
    (
        id SERIAL,
        name VARCHAR(20) NOT NULL,
        PRIMARY KEY (id)
    );

INSERT INTO engine_type (id, name) VALUES ('1', 'Petrol');
INSERT INTO engine_type (id, name) VALUES ('2', 'Diesel');
INSERT INTO engine_type (id, name) VALUES ('3', 'Hybrid');
INSERT INTO engine_type (id, name) VALUES ('4', 'Electric');

CREATE TABLE
    car_brand
    (
        id SERIAL,
        name VARCHAR(50) NOT NULL ,
        PRIMARY KEY (id)
    );

INSERT INTO car_brand (id, name) VALUES ('1', 'BMW');
INSERT INTO car_brand (id, name) VALUES ('2', 'KIA');;
INSERT INTO car_brand (id, name) VALUES ('3', 'Peugeot');
INSERT INTO car_brand (id, name) VALUES ('4', 'Toyota');
INSERT INTO car_brand (id, name) VALUES ('5', 'Volvo');

CREATE TABLE
    car_model
    (
        id SERIAL,
        name VARCHAR(50) NOT NULL ,
        PRIMARY KEY (id)
    );
INSERT INTO car_model (id, name) VALUES ('1', 'i3');
INSERT INTO car_model (id, name) VALUES ('2', 'M5');
INSERT INTO car_model (id, name) VALUES ('3', 'X6');
INSERT INTO car_model (id, name) VALUES ('4', 'Ceed');
INSERT INTO car_model (id, name) VALUES ('5', 'Sportage');
INSERT INTO car_model (id, name) VALUES ('6', 'Soul');
INSERT INTO car_model (id, name) VALUES ('7', '208');
INSERT INTO car_model (id, name) VALUES ('8', '308');
INSERT INTO car_model (id, name) VALUES ('9', '508');
INSERT INTO car_model (id, name) VALUES ('10', 'Avensis');
INSERT INTO car_model (id, name) VALUES ('11', 'Corolla');
INSERT INTO car_model (id, name) VALUES ('12', 'Yaris');
INSERT INTO car_model (id, name) VALUES ('13', 'V40');
INSERT INTO car_model (id, name) VALUES ('14', 'V50');
INSERT INTO car_model (id, name) VALUES ('15', 'V60');

CREATE TABLE
    car
    (
        id SERIAL,
        color VARCHAR(20) NOT NULL,
        engine_type_id INTEGER NOT NULL,
        car_brand_id INTEGER NOT NULL,
        car_model_id INTEGER NOT NULL,
        PRIMARY KEY (id)
    );

ALTER TABLE car ADD CONSTRAINT car_fk_1 FOREIGN KEY (engine_type_id) REFERENCES engine_type (id);
ALTER TABLE car ADD CONSTRAINT car_fk_2 FOREIGN KEY (car_brand_id) REFERENCES car_brand (id);
ALTER TABLE car ADD CONSTRAINT car_fk_3 FOREIGN KEY (car_model_id) REFERENCES car_model (id);
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('1', 'White', '4', '1', '1');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('2', 'Blue', '4', '1', '1');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('3', 'Blue', '1', '1', '2');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('4', 'Grey', '1', '1', '2');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('5', 'Black', '2', '1', '3');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('6', 'White', '2', '1', '3');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('7', 'Red', '1', '2', '4');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('8', 'Blue', '1', '2', '4');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('9', 'Blue', '2', '2', '5');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('10', 'Orange', '1', '2', '5');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('11', 'Blue', '4', '2', '6');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('12', 'Red', '1', '3', '7');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('13', 'Grey', '1', '3', '7');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('14', 'White', '2', '3', '8');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('15', 'Blue', '2', '3', '8');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('16', 'Black', '2', '3', '9');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('17', 'White', '2', '3', '9');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('18', 'Black', '2', '4', '10');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('19', 'Grey', '2', '4', '10');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('20', 'White', '3', '4', '11');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('21', 'Grey', '1', '4', '11');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('22', 'White', '3', '4', '12');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('23', 'Red', '1', '4', '12');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('24', 'Black', '2', '5', '13');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('25', 'Blue', '2', '5', '13');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('26', 'White', '2', '5', '14');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('27', 'Grey', '2', '5', '14');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('28', 'Black', '3', '5', '15');
INSERT INTO car (id, color, engine_type_id, car_brand_id, car_model_id) VALUES ('29', 'Orange', '2', '5', '15');

CREATE TABLE
    lead
    (
        id SERIAL,
        first_name VARCHAR(50) NOT NULL ,
        last_name VARCHAR(50) NOT NULL ,
        city VARCHAR(50) NOT NULL ,
        PRIMARY KEY (id)
    );

CREATE TABLE
    lead_car
    (
        lead_id SERIAL,
        car_id INTEGER NOT NULL,
        PRIMARY KEY (lead_id , car_id) ,
        CONSTRAINT lead_car_fk_1 FOREIGN KEY (lead_id) REFERENCES lead (id),
        CONSTRAINT lead_car_fk_2 FOREIGN KEY (car_id) REFERENCES car (id)
    );