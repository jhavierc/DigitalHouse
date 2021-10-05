
/*
 * Grupo 5
 * Evelyn Jorgelina
 * Maria Fernanda Garcia
 * Romina Cavallaro
 * Juana Forrester
 * Anna Ospina
 * */

/*---- CLIENTES -----*
/*1*/
create or replace view view_cliente as
select c.ClienteID , c.Contacto , case when c.Fax is null or LENGTH(c.Fax)=0 then CONCAT("TEL: ",c.Telefono) ELSE c.Fax end as telefono 
from Clientes c;

/*2*/
select * from view_cliente dc where dc.telefono like 'TEL%';
select * from Clientes c where c.Fax is null or LENGTH(c.Fax)=0;


/*---- PROVEEDORES -----*

/*1*/
create or replace view view_proveedores as
select p.ProveedorID, p.Contacto , p.Compania, CONCAT(p.Direccion,' ',p.Ciudad,' ',  p.CodigoPostal,' ', p.Pais) as Direccion
from Proveedores p;

/*2*/
select * from view_proveedores v where v.Direccion like '%Americanas%Brazil%'; 
select * from Proveedores p2  where p2.Direccion   like '%Americanas%' and p2.Pais ='Brazil'; 


/*---- PRODUCTOS -----*

/*1*/
create or replace view view_reporte as
select p.ProductoID, p.ProductoNombre, round(p.PrecioUnitario) 'precio unitario', p.UnidadesStock , p.UnidadesPedidas,
case when p.UnidadesPedidas =0 then 'BAJA'
when p.UnidadesPedidas <p.UnidadesStock  then 'MEDIA'
when p.UnidadesPedidas < p.UnidadesStock *2 then 'URGENTE' else 'SUPER URGENTE' end prioridad
from Productos p;

/*2*/
select r.prioridad , count(*) as cantidad, avg(r.`precio unitario`) from view_reporte r
group by r.prioridad
having cantidad >5;





