/* 1: Parte 1 */
select f.FacturaID, f.FechaFactura, c.Compania, c2.Contacto, ct.CategoriaNombre, p.ProductoNombre, p.PrecioUnitario , fd.Cantidad 
from Facturas f 
inner join Correos c on f.EnvioVia = c.CorreoID 
inner join Clientes c2  on f.ClienteID =c2.ClienteID 
inner join FacturaDetalle fd on f.FacturaID = fd.FacturaID 
inner join Productos p on fd.ProductoID =p.ProductoID 
inner join Categorias ct on p.CategoriaID = ct.CategoriaID;

/*Parte 2*/

/*1*/
select * from Categorias c2 
left join Productos p2 on p2.CategoriaID =c2.CategoriaID;

/*2*/
SELECT DISTINCT c.Contacto 
from Clientes c 
left join Facturas f on c.ClienteID = f.ClienteID
where f.FacturaID is null;

/*3*/
SELECT  p.ProductoNombre ,c.CategoriaNombre , p2.Contacto 
from Productos p 
left join Proveedores p2 on p.ProveedorID =p2.ProveedorID 
inner join Categorias c on p.CategoriaID = c.CategoriaID;

/*4*/
SELECT c.CategoriaNombre, avg(p.PrecioUnitario) 
from Productos p 
inner join Categorias c on p.CategoriaID = c.CategoriaID 
group by 1;

/*5*/

select c.Contacto ,max(f.FacturaID) as factura
from Clientes c 
left join Facturas f on c.ClienteID = f.ClienteID 
group by 1;

/*6*/

select c.Compania , count(*)from Correos c 
right join Facturas f on f.EnvioVia =c.CorreoID 
GROUP by c.Compania;






