-- Reportes parte 1: 
/* 1. Obtener el nombre y apellido de los primeros 5 actores disponibles, utilizar alias para mostrar 
los nombres de las columnas en español.*/
Select first_name As Nombre, last_name As Apellido 
From actor
LIMIT 5;

/* 2. Obtener un listado que incluya nombre, apellido y correo electrónico de los clientes (customers) inactivos, 
utilizar alias para mostrar los nombres de las columnas en español.*/
Select first_name As Nombre, last_name As Apellido, email As Correo
From customer
Where active <> True
;
-- o
Select first_name As Nombre, last_name As Apellido, email As Correo
From customer
Where active = False
;
-- o
Select first_name As Nombre, last_name As Apellido, email As Correo
From customer
Where active = 0
;

/* 3. Obtener un listado de films incluyendo título, año y descripción de los films que tienen un 
rental_duration mayor a cinco. Ordenar por rental_duration de mayor a menor y utilizar aliases para mostrar 
los nombres de las columnas en español */
Select title as Titulo, description as Descripcion, release_year as "Año"
From film
Where rental_duration > 5
order by rental_duration DESC
;
/* 4. Obtener un listado de alquileres (rentals) que se hicieron durante el mes de mayo de 2005, 
incluir en el resultado todas las columnas disponibles.*/
SELECT * 
From rental
WHERE DATE(rental_date) between '2005-05-01' and '2005-05-31'
;
-- o
SELECT * 
From rental
WHERE DATE(rental_date) >= '2005-05-01' and rental_date <='2005-05-31'
;
-- o 
SELECT * 
From rental
WHERE MONTH(rental_date) = 5 AND YEAR(rental_date) = 2005
GROUP BY 1;

-- Reportes parte 2: Sumemos complejidad
/* 1. Obtener la cantidad TOTAL de alquileres (rentals), utilizar un alias para mostrarlo en una columna llamada “cantidad”
*/
SELECT COUNT(*) AS Cantidad
from rental;
/* 2. Obtener la suma TOTAL de todos los pagos (payments), utilizar un alias para mostrarlo en una columna 
llamada “total”, 
una columna con la cantidad de alquileres con el alias “Cantidad”, 
y una columna que indique el “Importe promedio” por alquiler.
*/
SELECT sum(amount) AS TOTAL
, count(distinct rental_id) AS CANTIDAD 
, sum(amount) / count(distinct rental_id) AS 'Importe Promedio'
FROM payment;
/* 3. Generar un reporte que responda la pregunta: ¿cuáles son los diez clientes que más dinero gastan 
y en cuantos alquileres lo hacen?
*/
SELECT customer_id, sum(amount), count(distinct rental_id) FROM payment
group by customer_id
order by sum(amount) desc 
limit 10;
/* 4. Generar un reporte que indique: id de cliente, cantidad de alquileres y monto total para todos los 
clientes que hayan gastado más de 150 dólares en alquileres.
*/
SELECT customer_id, sum(amount), count(*) FROM payment
group by customer_id
having sum(amount)>150
;
/* 5. Generar un reporte que muestre por mes de alquiler (rental_date de tabla rental), 
la cantidad de alquileres y la suma total pagado (amount de tabla payment) para el año de alquiler 2005 
(rental_date de tabla rental).
Pista: Las tablas a utilizar son rental y payment.
*/
Select month(rental_date) mes,
       SUM(amount) AS Monto, 
	   COUNT(*) AS CantidadAlquileres
From payment
JOIN rental
ON payment.rental_id = rental.rental_id
Where year(rental_date) = 2005
Group By month(rental_date) 
;

/* 6. Generar un reporte que responda a la pregunta: 
¿cuáles son los 5 inventarios más alquilados? (columna inventory_id en la tabla rental) 
para cada una de ellas indicar la cantidad de alquileres.
*/
SELECT inventory_id, count(*)
from rental
group by inventory_id
order by count(*) desc
Limit 5;
