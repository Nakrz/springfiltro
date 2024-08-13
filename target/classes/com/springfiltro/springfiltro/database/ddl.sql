

mysql -u campus2023 -pcampus2023

DROP DATABASE IF EXIST farmacia;
CREATE DATABASE farmacia;
USE farmacia;

CREATE TABLE modeadministration(
    id BIGINT PRIMARY KEY,
    descriptionmode VARCHAR(60)
);

CREATE TABLE unitmeasurement(
    idum BIGINT PRIMARY KEY,
    nameum VARCHAR(60)
);

CREATE TABLE farmacymedicine(
    idfarmacy BIGINT,
    idmedicinefatrm BIGINT PRIMARY KEY,
    price FLOAT,
    FOREIGN KEY idfarmacy REFERENCES farmacy(idfarmacy)
);

CREATE TABLE modeadministration(
    id BIGINT PRIMARY KEY,
    descriptionmode VARCHAR(60)
);

CREATE TABLE farmacy(
    idfarmacy BIGINT PRIMARY KEY,
    namefarmacy VARCHAR(60),
    addressfarmacy VARCHAR(100),
    longs FLOAT,
    latfarmacy FLOAT,
    codecityfarm VARCHAR(5),
    logofarmacy VARCHAR(50),
    FOREIGN KEY codecityfarm REFERENCES city(codecity)
);

CREATE TABLE country(
    codecountry VARCHAR(5) PRIMARY KEY,
    namecountry VARCHAR(50)
); 

CREATE TABLE region(
    codereg VARCHAR(5) PRIMARY KEY,
    namereg VARCHAR(50),
    codecountry VARCHAR(5) 
);


CREATE TABLE city(
    codecity VARCHAR(5) PRIMARY KEY,
    namecity VARCHAR(50),
    codereg VARCHAR (5),
    FOREIGN KEY codereg REFERENCES region(codereg)
);

CREATE TABLE labatory(
    id BIGINT PRIMARY KEY,
    namelab VARCHAR(50),
    codecityreg VARCHAR (5),
    FOREIGN KEY codecityreg REFERENCES city(codereg)
);

CREATE TABLE activeprinciple(
    idap BIGINT PRIMARY KEY,
    nameap VARCHAR(60),
);

CREATE TABLE customer(
    idcustomer VARCHAR(20) PRIMARY KEY,
    namecustomer VARCHAR(50),
    lastnamecustomer VARCHAR(50),
    codecitycustomer VARCHAR(5),
    emailcustomer VARCHAR(100),
    birthdate DATE,
    ion FLOAT,
    latitud FLOAT,
    FOREIGN KEY codecitycustomer REFERENCES city(codecity)
);

CREATE TABLE medicine(
    id BIGINT PRIMARY KEY,
    proceedings VARCHAR(10),
    namemedicine VARCHAR(100),
    healthregister VARCHAR(50),
    description TEXT,
    descriptionshort VARCHAR(60),
    codemodeadmin INT,
    codeap BIGINT,
    codeum INT
    namerol VARCHAR(100),
    codelab INT
    FOREIGN KEY codemodeadmin REFERENCES modeadministration(id),
    FOREIGN KEY codeap REFERENCES activeprinciple(idap),
    FOREIGN KEY codeum REFERENCES unitmeasurement(idum),
    FOREIGN KEY codelab REFERENCES labatory(id)
);