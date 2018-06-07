delete from comment;
delete from  restaurant;
delete from Category;
delete from city;

delete from User;


INSERT INTO category(id, nombre) VALUES (100, 'Pizza');
INSERT INTO category(id, nombre) VALUES (101, 'Comida Rapida');
INSERT INTO category(id, nombre) VALUES (102, 'Heladeria');
INSERT INTO category(id, nombre) VALUES (103, 'Comidas exóticas');
INSERT INTO category(id, nombre) VALUES (104, 'Pastas');


INSERT INTO city(id, nombre) VALUES (50,'Cochabamba');
INSERT INTO city(id, nombre) VALUES (51,'La Paz');
INSERT INTO city(id, nombre) VALUES (52,'Santa Cuz');
INSERT INTO city(id, nombre) VALUES (53,'Chuquisaca');
INSERT INTO city(id, nombre) VALUES (54,'Oruro');
INSERT INTO city(id, nombre) VALUES (55,'Pando');
INSERT INTO city(id, nombre) VALUES (56,'Tarija');
INSERT INTO city(id, nombre) VALUES (57,'Beni');
INSERT INTO city(id, nombre) VALUES (58,'Potosi');


INSERT INTO restaurant(id, name,phone,description,likes,category_id,city_id, latitude, longitud) VALUES (50,'Elis',4785698,'Muy bueno',0,100,50, -17.373320, -66.152807);
INSERT INTO restaurant(id, name,phone,description,likes,category_id,city_id, latitude, longitud) VALUES (51,'Burger king',4569823,'Muy bueno igualmente',0,101,50,-17.383354, -66.159636);
INSERT INTO restaurant(id, name,phone,description,likes,category_id,city_id, latitude, longitud) VALUES (52,'Tropical Chicken',4965832,'Bueno',0,101,50,-17.373865, -66.149476);
INSERT INTO restaurant(id, name,phone,description,likes,category_id,city_id, latitude, longitud) VALUES (53,'Globos',4788898,'Delicioso',0,102,50, -17.387475, -66.155610);
INSERT INTO restaurant(id, name,phone,description,likes,category_id,city_id, latitude, longitud) VALUES (54,'Big Joy',4784498,'Regular',0,101,50, -17.377357, -66.153778);
INSERT INTO restaurant(id, name,phone,description,likes,category_id,city_id, latitude, longitud) VALUES (55,'Los Castores',4555698,'Excelente',0,101,50, -17.383741, -66.158375);
INSERT INTO restaurant(id, name,phone,description,likes,category_id,city_id, latitude, longitud) VALUES (56,'Shawarma King',4665698,'Buen lugar',0,103,50, -17.375345, -66.151010);
INSERT INTO restaurant(id, name,phone,description,likes,category_id,city_id, latitude, longitud) VALUES (57,'La Cantonata',4665698,'Elegante',0,104,50, -17.388921, -66.157468);




INSERT INTO user (id,admin,name,last_name,password,username) VALUES (1,1,'Grillo','Pepe','$2a$10$QVUYllnp1PMD4aQN/TDese/L78dN0ABWhnolJl0xmMtmTt.7ajx72','a');
INSERT INTO user (id,admin,name,last_name,password,username) VALUES (2,0,'ElHonrado','Juan','$2a$10$QVUYllnp1PMD4aQN/TDese/L78dN0ABWhnolJl0xmMtmTt.7ajx72','aa');

