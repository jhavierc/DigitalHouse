-- Crear una vista con los siguientes datos de los clientes:
-- Id, contacto, y el Fax. En caso que no tenga Fax, colocar el teléfono y este caso aclararlo. Por ejemplo 'TEL: (01) 123-4567'
-- Se espera una salida similar a la siguiente:
CREATE VIEW v_clientes AS
SELECT ClienteID,
	Contacto,
	CASE WHEN Fax = '' THEN CONCAT('TEL: ',Telefono)
	     ELSE Fax
	END AS telefono_fax
FROM Clientes;

-- Se necesita listar los números de teléfono de los clientes que no tengan fax. Hacerlo de dos formas distintas:
-- 1) Consultando la tabla de clientes
SELECT Contacto, Telefono 
FROM Clientes
WHERE FAX = '';

-- 2) Consultando la vista de clientes
SELECT Contacto, telefono_fax 
FROM v_clientes
WHERE telefono_fax LIKE 'TEL:%';


-- Crear una vista con los siguientes datos de los proveedores:
-- Id, contacto, compañia y la dirección. Para la dirección tomar la dirección, ciudad, código postal y país.
CREATE VIEW v_proveedores AS
SELECT ProveedorID, Contacto, Compania,
CONCAT(Direccion, ' - ', Ciudad, ' (', CodigoPostal,') ', Pais) as Domicilio
FROM Proveedores;

-- Listar los proveedores que vivan la calle Americanas en Brazil. Hacerlo de dos formas distintas:
-- 1) Consultando la tabla de proveedores
SELECT ProveedorID, Contacto, Compania, Direccion, Pais
FROM Proveedores
WHERE Direccion LIKE '%Americanas%' AND Pais = 'Brazil'
;

-- 2) Consultando la vista de proveedores
SELECT ProveedorID, Contacto, Domicilio
FROM v_proveedores
WHERE Domicilio LIKE '%Americanas%Brazil';


-- Crear una vista de productos que se usará para control de stock.
-- Incluir el id y nombre del producto, el precio unitario redondeado sin decimales, las unidades en stock y las unidades pedidas.
-- Incluir además una nueva columna PRIORIDAD con los siguientes valores:
-- BAJA si unidades pedidas es cero
-- MEDIA si unidades pedidas es menor que unidades en stock
-- URGENTE si unidades pedidas no duplica al número de unidades en stock
-- SUPERURGENTE en caso contrario
CREATE VIEW v_control_stock AS
SELECT
	ProductoID,
	ProductoNombre,
	ROUND(PrecioUnitario) as PrecioUnitario,
	UnidadesStock,
	UnidadesPedidas,
	CASE WHEN UnidadesPedidas = 0 THEN 'BAJA'
		WHEN UnidadesPedidas < UnidadesStock THEN 'MEDIA'
		WHEN UnidadesPedidas < 2*UnidadesStock THEN 'URGENTE'
	ELSE 'SUPERURGENTE'
	END AS Prioridad
FROM Productos;


-- Se necesita un reporte de productos que tienen problemas de stock. Para cada prioridad indicar cuántos productos hay y su precio promedio. No incluir las prioridades para las que haya menos de 5 productos.
SELECT Prioridad, count(*) AS cantidad_de_productos,
AVG(PrecioUnitario) AS precio_promedio
FROM v_control_stock 
GROUP BY Prioridad
HAVING count(*)>5

