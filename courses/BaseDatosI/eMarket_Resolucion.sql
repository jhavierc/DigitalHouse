-- Consignas

-- Clientes
-- 1. ¿Cuántos clientes existen?
SELECT COUNT(*)
FROM Clientes;

-- 2. ¿Cuántos clientes hay por ciudad?
SELECT Ciudad, COUNT(*)
FROM Clientes
GROUP BY Ciudad;

-- Facturas
-- 1. ¿Cual es el total de transporte?
SELECT SUM(transporte)
FROM Facturas;

-- 2. ¿Cual es el total de transporte por EnvioVia (empresa de envío)?
SELECT EnvioVia,SUM(transporte)
FROM Facturas
GROUP BY EnvioVia;

-- 3. Calcular la cantidad de facturas por cliente. Ordenar descendentemente por cantidad de facturas.
SELECT ClienteID, COUNT(*)
FROM Facturas
GROUP BY ClienteID
ORDER BY COUNT(*) desc;

-- 4. Obtener el Top 5 de clientes de acuerdo a su cantidad de facturas.
SELECT ClienteID, COUNT(*)
FROM Facturas
GROUP BY ClienteID
ORDER BY COUNT(*) desc
LIMIT 5;

-- 5. ¿Cual es el país de envío menos frecuente?
SELECT PaisEnvio, COUNT(*)
FROM Facturas
GROUP BY  PaisEnvio
ORDER BY COUNT(*) asc
Limit 1;

-- 6. Se quiere otorgar un bono al empleado con más ventas. ¿Qué ID de empleado realizó más operaciones de ventas?
SELECT EmpleadoID, COUNT(*)
FROM Facturas
GROUP BY  EmpleadoID
ORDER BY COUNT(*) desc
Limit 1;

-- Factura detalle
-- 1. ¿Cuál es el producto que aparece en más líneas de la tabla Factura Detalle?
SELECT ProductoID, COUNT(*)
FROM FacturaDetalle
GROUP BY ProductoID
ORDER BY COUNT(*) desc
LIMIT 1;

-- 2. ¿Cuál es el total facturado? Considerar que el total facturado es la suma de cantidad por precio unitario.
SELECT SUM(Cantidad*PrecioUnitario)
FROM FacturaDetalle;

-- 3. ¿Cuál es el total facturado para los productos ID entre 30 y 50?
SELECT SUM(Cantidad*PrecioUnitario)
FROM FacturaDetalle
WHERE ProductoID between 30 and 50;

-- 4. ¿Cuál es el precio unitario promedio de cada producto?
SELECT ProductoID, AVG(PrecioUnitario)
FROM FacturaDetalle
GROUP BY ProductoID;

-- 5. ¿Cuál es el precio unitario máximo?
SELECT MAX(PrecioUnitario)
FROM FacturaDetalle;

-- JOINS
-- 1. Generar un listado de todas las facturas del empleado 'Buchanan'.
SELECT *
FROM Facturas
JOIN Empleados ON Facturas.EmpleadoID = Empleados.EmpleadoID
WHERE Apellido = 'Buchanan';

-- 2. Generar un listado con todos los campos de las facturas del correo 'Speedy Express'.
SELECT * 
FROM Facturas
JOIN Correos ON Facturas.enviovia = Correos.correoID
WHERE compania = 'Speedy Express';

-- 3. Generar un listado de todas las facturas con el nombre y apellido de los empleados.
SELECT Facturas.*, Empleados.Apellido, Empleados.Nombre
FROM Facturas
JOIN Empleados
ON Facturas.EmpleadoID = Empleados.empleadoID;

-- 4. Mostrar un listado de las facturas de todos los clientes “Owner” y país de envío “USA”.
SELECT *
FROM Facturas
JOIN Clientes
ON Facturas.ClienteID = Clientes.ClienteID
WHERE Clientes.titulo = "Owner" and PaisEnvio = "Usa";

-- 5. Mostrar todos los campos de las facturas del empleado cuyo apellido  sea “Leverling” o que incluyan el producto id = “42”.
SELECT Facturas.*
FROM Facturas
JOIN Empleados ON Facturas.EmpleadoID = Empleados.empleadoID
JOIN FacturaDetalle  ON Facturas.facturaID = FacturaDetalle.facturaId
WHERE Empleados.Apellido ='Leverling' or  FacturaDetalle.ProductoID = 42;

-- 6. Mostrar todos los campos de las órdenes del empleado cuyo apellido  sea “Leverling” y que incluya el producto id = “80” 0 "42".
SELECT Facturas.*
FROM Facturas
JOIN Empleados ON Facturas.EmpleadoID = Empleados.empleadoID
JOIN FacturaDetalle  ON Facturas.facturaID = FacturaDetalle.facturaId
WHERE Empleados.Apellido ='Leverling' and  (FacturaDetalle.ProductoID = 80 or FacturaDetalle.ProductoID = 42);

-- 7. Generar un listado con los cinco mejores clientes, según sus importes de compras total (PrecioUnitario * Cantidad).
SELECT ClienteID, SUM(PrecioUnitario * Cantidad) as Total
FROM Facturas
JOIN FacturaDetalle ON Facturas.facturaID = FacturaDetalle.facturaId
GROUP By ClienteID
ORDER BY SUM(PrecioUnitario * Cantidad) desc
LIMIT 5;

-- 8. Generar un listado de facturas, con los campos id, nombre y apellido del cliente,  fecha de factura, y país de envío, 
-- ordenado de manera descendente por fecha de factura y limitado a 10 filas.
SELECT Facturas.FacturaID, 
		Clientes.contacto, 
		Facturas.FechaFactura, 
        Facturas.PaisEnvio
FROM Facturas
JOIN FacturaDetalle ON Facturas.facturaID = FacturaDetalle.facturaId
JOIN Clientes ON Facturas.ClienteID = Clientes.ClienteID
ORDER BY Facturas.FechaFactura desc
LIMIT 10;

