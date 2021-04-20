INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('denzel', 'washington', 'dwashington@gmail.com','2021-03-01', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('harry', 'potter', 'hpooter@gmail.com', '2021-03-02','');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('hermione', 'granger', 'hgranger@gmail.com', '2021-03-02','');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Linus', 'Torvalds', 'linus.torvalds@gmail.com','2021-03-03', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Jane', 'Doe', 'jane.doe@gmail.com', '2021-03-04','');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Rasmus', 'Lerdorf', 'rasmus.lerdorf@gmail.com','2021-03-05', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Erich', 'Gamma', 'erich.gamma@gmail.com', '2021-03-06', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Richard', 'Helm', 'richard.helm@gmail.com', '2021-03-07', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Ralph', 'Johnson', 'ralph.johnson@gmail.com','2021-03-03', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('John', 'Vlissides', 'john.vlissides@gmail.com','2021-03-09', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('James', 'Gosling', 'james.gosling@gmail.com','2021-03-010', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Bruce', 'Lee', 'bruce.lee@gmail.com', '2021-03-11', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Johnny', 'Doe', 'johnny.doe@gmail.com', '2021-03-12', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('John', 'Roe', 'john.roe@gmail.com', '2021-03-13','');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Jane', 'Roe', 'jane.roe@gmail.com', '2021-03-14','');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Richard', 'Doe', 'richard.doe@gmail.com', '2021-03-15', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Janie', 'Doe', 'janie.doe@gmail.com', '2021-03-16', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Phillip', 'Webb', 'phillip.webb@gmail.com', '2021-03-17', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Stephane', 'Nicoll', 'stephane.nicoll@gmail.com','2021-03-18', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Sam', 'Brannen', 'sam.brannen@gmail.com', '2021-03-19', '');  
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Juergen', 'Hoeller', 'juergen.Hoeller@gmail.com','2021-03-20', ''); 
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Janie', 'Roe', 'janie.roe@gmail.com', '2021-03-21', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('John', 'Smith', 'john.smith@gmail.com', '2021-03-22', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Joe', 'Bloggs', 'joe.bloggs@gmail.com', '2021-03-23', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('John', 'Stiles', 'john.stiles@gmail.com', '2021-03-24', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('Richard', 'Roe', 'stiles.roe@gmail.com', '2021-03-25', '');
INSERT INTO client (nombre, apellido, email, create_at, foto) VALUES('velazquez', 'Romy', 'rvelazquez@gmail.com', '2021-04-07', '');

INSERT INTO product (nombre, precio, create_at) VALUES('Seagate Portable 2TB External Hard Drive Portable HDD – USB',956990, NOW());
INSERT INTO product (nombre, precio, create_at) VALUES('Roku Streaming Stick+ | HD/4K/HDR Streaming Device with Long-range Wireless and Voice Remote with TV Controls ', 743090, NOW());
INSERT INTO product (nombre, precio, create_at) VALUES('Apple iPod shuffle', 7899990, NOW());
INSERT INTO product (nombre, precio, create_at) VALUES('TP-Link AC1750 Smart WiFi Router (Archer A7) -Dual Band GigabitWireless Internet Router for Home, Works with Alexa, VPN Server, Parental Control, QoS', 187990, NOW());
INSERT INTO product (nombre, precio, create_at) VALUES('SanDisk 128GB Extreme PRO SDXC UHS-I Card - C10, U3, V30, 4K UHD, SD Card - SDSDXXY-128G-GN4IN ', 69990, NOW());
INSERT INTO product (nombre, precio, create_at) VALUES('TP-Link AC750 WiFi Extender (RE220), Covers Up to 1200 Sq.ft and 20 Devices, Up to 750Mbps Dual Band WiFi Range Extender, WiFi Booster to Extend Range of WiFi Internet Connection ',69990, NOW());
INSERT INTO product (nombre, precio, create_at) VALUES('Brother Genuine High Yield Toner Cartridge, TN660, Replacement Black Toner, Page Yield Up To 2,600 Pages, Amazon Dash Replenishment Cartridge ', 486990, NOW());

INSERT INTO invoice (descripcion, observacion, client_id, create_at) VALUES('Factura equipos electronicos', 'alguna descripcion', 1, NOW());
INSERT INTO invoice (descripcion, observacion, client_id, create_at) VALUES('Factura equipos electronicos', 'alguna descripcion2', 8, NOW());
INSERT INTO invoice (descripcion, observacion, client_id, create_at) VALUES('Factura equipos electronicos', 'no quiso pagar', 10, NOW());


INSERT INTO item_invoice (cantidad, invoice_id, producto_id) VALUES(2, 1, 3);
INSERT INTO item_invoice (cantidad, invoice_id, producto_id) VALUES(3, 1, 4);
INSERT INTO item_invoice (cantidad, invoice_id, producto_id) VALUES(1, 1, 5);
INSERT INTO item_invoice (cantidad, invoice_id, producto_id) VALUES(1, 1, 7);

INSERT INTO item_invoice (cantidad, invoice_id, producto_id) VALUES(2, 2, 1);
INSERT INTO item_invoice (cantidad, invoice_id, producto_id) VALUES(3, 2, 2);

INSERT INTO item_invoice (cantidad, invoice_id, producto_id) VALUES(1, 3, 4);
INSERT INTO item_invoice (cantidad, invoice_id, producto_id) VALUES(1, 3, 6);
