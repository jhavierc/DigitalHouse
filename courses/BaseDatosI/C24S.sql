-- 1 Calculo de edad
-- a
DELIMITER $$
CREATE PROCEDURE sp_calculo_edad_empleados(IN edad_minima INT, IN edad_maxima INT)
BEGIN
SELECT e.Apellido, e.Nombre, TIMESTAMPDIFF(YEAR,e.FechaNacimiento,CURDATE()) AS edad FROM empleados e
WHERE TIMESTAMPDIFF(YEAR,e.FechaNacimiento,CURDATE()) BETWEEN edad_minima AND edad_maxima;
END $$
DELIMITER ;

-- b
CALL sp_calculo_edad_empleados(50,60);

-- 2 Actualizacion de productos
-- a // Funciona pero, tira una alerta . Error 1739.
DELIMITER $$
CREATE PROCEDURE sp_actualizacion_productos (IN porcentaje INT, IN nombre_categoria VARCHAR(15))
BEGIN
UPDATE productos p
INNER JOIN categorias c ON c.CategoriaID = p.CategoriaID
SET p.unidadesPedidas = p.unidadesPedidas *(porcentaje / 100 + 1)
WHERE c.CategoriaNombre = nombre_categoria;
END $$
DELIMITER ;

-- b
SELECT p.ProductoNombre, c.CategoriaNombre, p.UnidadesPedidas FROM productos p
INNER JOIN categorias c ON c.CategoriaID = p.CategoriaID
WHERE c.CategoriaNombre = "Condiments";

-- c
CALL  sp_actualizacion_productos(15, "Condiments");

-- DROP PROCEDURE IF EXISTS sp_actualizacion_productos

-- 3 Actualizacion de empleados






