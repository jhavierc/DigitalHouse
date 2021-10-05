-- JOINS
-- Realizar una consulta de la facturación de e-market. Incluir la siguiente información:
-- Id de la factura, fecha de la factura, empresa de correo, nombre del cliente, categoría del producto vendido, nombre del producto, precio unitario y cantidad.

SELECT f.FacturaID, FechaFactura, o.Compania as correo, Contacto as cliente, CategoriaNombre, ProductoNombre, d.PrecioUnitario, Cantidad
FROM Facturas f
JOIN Correos o ON f.enviovia = o.correoID
JOIN Clientes l ON f.ClienteID = l.ClienteID 
JOIN FacturaDetalle d ON f.FacturaID = d.FacturaID
JOIN Productos p ON d.ProductoID = p.ProductoID
JOIN Categorias c ON p.CategoriaID = c.CategoriaID
ORDER BY f.FacturaID, CategoriaNombre, ProductoNombre;


-- Listar todas las categorías junto con información de sus productos. Incluir todas las categorías aunque no tengan productos.
SELECT CategoriaNombre, ProductoId, ProductoNombre, CantidadPorUnidad, PrecioUnitario
FROM Categorias
LEFT JOIN Productos ON Categorias.CategoriaID = Productos.CategoriaID;

-- Listar la información de contacto de los clientes que no hayan comprado nunca en emarket.
SELECT Clientes.ClienteID, Contacto, Telefono
FROM Clientes
LEFT JOIN Facturas ON Facturas.ClienteID = Clientes.ClienteID
WHERE Facturas.ClienteID IS NULL;

-- Realizar un listado de productos. Para cada uno indicar su nombre, categoría, y la información de contacto de su proveedor. Tener en cuenta que puede haber productos para los cuales no se indicó quién es el proveedor.
SELECT productoNombre, c.CategoriaNombre, prov.Contacto, prov.Telefono
FROM Productos p
INNER JOIN Categorias c ON c.CategoriaID = p.CategoriaID
LEFT JOIN Proveedores prov on p.ProveedorID = prov.ProveedorID;

-- Para cada categoría listar el promedio del precio unitario de sus productos.
SELECT CategoriaNombre, avg(PrecioUnitario)
FROM Categorias c
LEFT JOIN Productos p
ON c.CategoriaID = p.CategoriaID
GROUP BY CategoriaNombre;

-- Para cada cliente, indicar la última factura de compra. Incluir los clientes que nunca hayan comprado en e-market.
SELECT Clientes.ClienteId,
       max(fechafactura) as ultima_factura
FROM Clientes
LEFT JOIN Facturas
ON Facturas.ClienteID = Clientes.ClienteID
GROUP BY Clientes.ClienteId;

-- Todas las facturas tienen una empresa de correo asociada (enviovia). Generar un listado con todas las empresas de correo, y la cantidad de facturas correspondientes. Realizar la consulta utilizando RIGHT JOIN.

SELECT compania, count(facturaID) 
FROM Facturas
RIGHT JOIN Correos
ON Facturas.enviovia = Correos.correoID
GROUP BY compania;
