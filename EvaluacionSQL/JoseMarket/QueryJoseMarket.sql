create schema if not exists `joseMarket_schema`;
#primero se crean todas las tablas#
create table `joseMarket_schema`.`proveedor`(
`proveedor_id` int not null auto_increment,
`nombre` varchar(30),
`rut` varchar(15),
`telefono` int not null,
primary key(`proveedor_id`));

create table `joseMarket_schema`.`cliente`(
`cliente_id` int not null auto_increment,
`nombre` varchar(30),
`rut` varchar(15),
`telefono` int not null,
primary key(`cliente_id`));

create table `joseMarket_schema`.`DocumentoVenta`(
`documentoVenta_id` int not null auto_increment,
`tipoDocumento` varchar(30),
`fecha` date,
primary key(`documentoVenta_id`));

create table `joseMarket_schema`.`DocumentoCompra`(
`documentoCompra_id` int not null auto_increment,
`tipoDocumento` varchar(30),
`fecha` date,
primary key(`documentoCompra_id`));

create table `joseMarket_schema`.`DetalleVenta`(
`detalleVenta_id` int not null auto_increment,
`cantidad` int not null,
`valor` int not null,
primary key(`detalleVenta_id`));

create table `joseMarket_schema`.`DetalleCompra`(
`detalleCompra_id` int not null auto_increment,
`cantidad` int not null,
`valor` int not null,
primary key(`detalleCompra_id`));

create table `joseMarket_schema`.`Producto`(
`producto_id` int not null auto_increment,
`nombre` varchar(30),
`stock` int not null,
primary key(`producto_id`));

create table `joseMarket_schema`.`TipoProducto`(
`tipoProducto_id` int not null auto_increment,
`categoria` varchar(20),
primary key(`tipoProducto_id`));

#luego se crean todas las foreing key#

ALTER TABLE josemarket_schema.producto ADD tipoProducto_id INT NOT NULL;
ALTER TABLE josemarket_schema.producto ADD constraint productoTipoProducto foreign key (tipoProducto_id) references josemarket_schema.tipoproducto(tipoproducto_id);

ALTER TABLE josemarket_schema.documentoventa ADD cliente_id INT NOT NULL;
ALTER TABLE josemarket_schema.documentoventa ADD constraint documentoventacliente foreign key (cliente_id) references josemarket_schema.cliente(cliente_id);

ALTER TABLE josemarket_schema.documentocompra ADD proveedor_id INT NOT NULL;
ALTER TABLE josemarket_schema.documentocompra ADD constraint documentocompraproveedor foreign key (proveedor_id) references josemarket_schema.proveedor(proveedor_id);

ALTER TABLE josemarket_schema.detallecompra ADD documentocompra_id INT NOT NULL;
ALTER TABLE josemarket_schema.detallecompra ADD constraint detalledocumentocompra foreign key (documentocompra_id) references josemarket_schema.documentocompra(documentocompra_id);

ALTER TABLE josemarket_schema.detalleventa ADD documentoventa_id INT NOT NULL;
ALTER TABLE josemarket_schema.detalleventa ADD constraint detalledocumentoventa foreign key (documentoventa_id) references josemarket_schema.documentoventa(documentoventa_id);

ALTER TABLE josemarket_schema.detallecompra ADD producto_id INT NOT NULL;
ALTER TABLE josemarket_schema.detallecompra ADD constraint detallecompraproducto foreign key (producto_id) references josemarket_schema.producto(producto_id);

ALTER TABLE josemarket_schema.detalleventa ADD producto_id INT NOT NULL;
ALTER TABLE josemarket_schema.detalleventa ADD constraint detalleventaproducto foreign key (producto_id) references josemarket_schema.producto(producto_id);

#se crean algunos tipos de productos#
insert into josemarket_schema.tipoproducto (categoria) values ('carnes');
insert into josemarket_schema.tipoproducto (categoria) values ('vegetales');
insert into josemarket_schema.tipoproducto (categoria) values ('helados');
insert into josemarket_schema.tipoproducto (categoria) values ('quesos');
insert into josemarket_schema.tipoproducto (categoria) values ('jamones');

#se llenan de informacion diferentes productos con un stock inicial#
insert into josemarket_schema.producto (nombre, stock, tipoProducto_id) values ('queso parmesano', 2 , 4);
insert into josemarket_schema.producto (nombre, stock, tipoProducto_id) values ('truto entero', 4 , 1);
insert into josemarket_schema.producto (nombre, stock, tipoProducto_id) values ('choclo', 3 , 2);
insert into josemarket_schema.producto (nombre, stock, tipoProducto_id) values ('helado de fresa', 3 , 3);
insert into josemarket_schema.producto (nombre, stock, tipoProducto_id) values ('jamon colonial', 1 , 5);
insert into josemarket_schema.producto (nombre, stock, tipoProducto_id) values ('queso fresco', 5 , 4);
insert into josemarket_schema.producto (nombre, stock, tipoProducto_id) values ('pechuga entera', 3 , 1);

#para probar la tabla relacional se crea un proveedor, se genera un documento de compra y un detalle de venta#
insert into josemarket_schema.proveedor (nombre, rut, telefono) values ('Jumbo', '98.234.765-k' , 943217654);
insert into josemarket_schema.documentocompra (tipoDocumento, fecha, proveedor_id) values ('Factura', '2022-11-10' , 1);
insert into josemarket_schema.detallecompra (cantidad, valor, documentocompra_id, producto_id) values (20, 1500 , 1, 4);
insert into josemarket_schema.detallecompra (cantidad, valor, documentocompra_id, producto_id) values (10, 2500 , 1, 6);

#también se crea un cliente, un documento de venta y un detalle de una venta#
insert into josemarket_schema.cliente (nombre, rut, telefono) values ('Jose Vidal', '12.654.876-9', 923457654);
insert into josemarket_schema.documentoventa (tipodocumento, fecha, cliente_id) values ('Boleta', '2022-11-11', 1);

insert into josemarket_schema.detalleventa (cantidad, valor, documentoventa_id, producto_id) values (1, 2500 , 1, 4);
insert into josemarket_schema.detalleventa (cantidad, valor, documentoventa_id, producto_id) values (1, 4000 , 1, 6);

#jose vidal es cliente fiel y compra de nuevo#
insert into josemarket_schema.documentoventa (tipodocumento, fecha, cliente_id) values ('Boleta', '2022-11-11', 1);
insert into josemarket_schema.detalleventa (cantidad, valor, documentoventa_id, producto_id) values (1, 2500 , 2, 4);
insert into josemarket_schema.detalleventa (cantidad, valor, documentoventa_id, producto_id) values (2, 4000 , 2, 6);

#se le cambia el nombre al nombre del proveedor de la tabla de proveedor para evitar confusiones#
alter table josemarket_schema.proveedor change column nombre nombreProveedor varchar(30);

#se le cambia el nombre al nombre producto de la tabla de producto para evitar confusiones#
alter table josemarket_schema.producto change column nombre nombreProducto varchar(30);

#se le cambia el nombre al nombre del cliente de la tabla de cliente para evitar confusiones#
alter table josemarket_schema.cliente change column nombre nombreCliente varchar(30);

#este join permite ver los productos que se han comprado y a qué proveedor#
select distinct producto.nombreproducto, producto.tipoProducto_id, detallecompra.valor, detallecompra.cantidad, detallecompra.documentocompra_id, proveedor.nombreproveedor from josemarket_schema.detallecompra 
 join josemarket_schema.producto join josemarket_schema.documentocompra JOIN josemarket_schema.proveedor on josemarket_schema.detallecompra.producto_id = josemarket_schema.producto.producto_id;

#en este join se puede ver el nombre del producto, la cantidad de venta que ha tenido, el valor y el documento en que se vendió#
select distinct producto.nombreproducto, detalleventa.cantidad, detalleventa.documentoventa_id, detalleventa.valor from josemarket_schema.producto
right join josemarket_schema.detalleventa on josemarket_schema.producto.producto_id = josemarket_schema.detalleventa.producto_id;

#este join muestra los productos existentes y la categoría la que pertenecen, así como el producto_id y el tipoProducto_id#
select distinct producto.nombreproducto, producto.producto_id, tipoproducto.categoria, tipoproducto.tipoproducto_id from josemarket_schema.producto
left join josemarket_schema.tipoproducto on josemarket_schema.producto.tipoProducto_id = josemarket_schema.tipoproducto.tipoProducto_id;

select * from josemarket_schema.tipoproducto;
select * from josemarket_schema.producto;
select * from josemarket_schema.proveedor;
select * from josemarket_schema.documentocompra;
select * from josemarket_schema.detallecompra;
select * from josemarket_schema.detalleventa;