INSERT INTO country (codecountry, namecountry) VALUES (1, 'Chile');
INSERT INTO country (codecountry, namecountry) VALUES (2, 'Cuba');

INSERT INTO region (codereg, namereg, codecountry) VALUES (1, 'Prueba Region 1', 1);
INSERT INTO region (codereg, namereg, codecountry) VALUES (2, 'Prueba Region 2', 2);

INSERT INTO city (codecity, namecity, codereg) VALUES (1, 'Ciudad 1', 1);
INSERT INTO city (codecity, namecity, codereg) VALUES (2, 'Ciudad 2', 2);

INSERT INTO farmacy (latfarmacy, longs, codecity, idfarmacy, addressfarmacy, logofarmacy, namefarmacy ) VALUES(4512, 249, 1, 1, 'Calle 123', 'Somos la mejor farmacia XD', 'Farmacia 1');
INSERT INTO farmacy (latfarmacy, longs, codecity, idfarmacy, addressfarmacy, logofarmacy, namefarmacy ) VALUES(45412, 24349, 2, 2, 'Calle 143', 'Somos la mejor farmacia  2 XD', 'Farmacia 2');


