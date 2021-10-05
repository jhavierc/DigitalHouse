-- Crear una vista para poder organizar los envíos de las facturas. Indicar número de factura, fecha de la factura y fecha de envío, ambas en formato dd/mm/yyyy, valor del transporte formateado con dos decimales, y la información del domicilio del destino incluyendo dirección, ciudad, código postal y país, en ua columna llamada Destino.
CREATE VIEW detalles_envio AS
SELECT
FacturaID,
DATE_FORMAT(FechaFactura,'%d/%m/%Y') as fechaFactura,
DATE_FORMAT(FechaEnvio,'%d/%m/%Y') as MesEnvio,
FORMAT(Transporte, 2) as Transporte,
CONCAT(DireccionEnvio, ' - ', CiudadEnvio, ' (', CodigoPostalEnvio,') ', PaisEnvio) as Destino
FROM Facturas f;

-- Realizar una consulta con todos los correos y el detalle de las facturas que usaron ese correo. Utilizar la vista creada.
SELECT c.Compania, d.*
FROM Correos c
LEFT JOIN Facturas f ON f.enviovia = c.correoID
JOIN detalles_envio d ON f.FacturaID = d.FacturaID;

-- PROBLEMAS: la vista no tiene el ID de correo. Sí o sí hay que joinear con la tabla de facturas
-- una solución sería agregar el correo a la vista.

-- Crear una vista con un detalle de los productos en stock. Indicar id, nombre del producto, nombre de la categoría y precio unitario.
CREATE VIEW productos_en_stock AS
SELECT CategoriaNombre, ProductoId, ProductoNombre, PrecioUnitario
FROM Categorias
LEFT JOIN Productos ON Categorias.CategoriaID = Productos.CategoriaID
WHERE UnidadesStock > 0;

-- Escribir una consulta que liste el nombre y la categoría de todos los productos vendidos. Utilizar la vista creada.
SELECT DISTINCT p.*
FROM FacturaDetalle f 
LEFT JOIN productos_en_stock p ON f.ProductoID = p.ProductoID;

-- PROBLEMAS: solo se pueden visualizar los productos que están en stock. Una opción es no usar la vista.
-- sino las tablas, otra opción es crear una vista diferente que no considere el stock.
 