-- 1. Listar todos los usuarios cuyo nombre comience con la letra A
SELECT `idUsuario`,`nombre`,`email`,`password`,`fechaNacimiento`,`codigoPostal`,`Pais_idPais`,`Avatar_idAvatar`
FROM `usuario` 
WHERE nombre LIKE 'A%';
 
-- 2. Listar todos los usuarios que no hayan cargado el email
SELECT `idUsuario`,`nombre`,`email`,`password`,`fechaNacimiento`,`codigoPostal`,`Pais_idPais`,`Avatar_idAvatar` 
FROM usuario 
WHERE email is null ;

-- 3. Mostrar todos los canales creados entre el 01/04/2021 y 01/06/2021
SELECT `idCanal`,`nombre`,`descripcion`,`fechaCreacion`,`Usuario_idUsuario`
FROM `canal`
WHERE fechaCreacion BETWEEN '2021/04/01' and '2021-06-01';

-- 4. Listar los 10 usuarios más jóvenes
SELECT `idUsuario`,`nombre`,`email`,`password`,`fechaNacimiento`,`codigoPostal`,`Pais_idPais`,`Avatar_idAvatar` 
FROM usuario
ORDER BY  fechaNacimiento DESC LIMIT 10;

-- 5. Mostrar todas las playlist que sean privadas .
SELECT idPlaylist playlist, nombre, fechaCreacion,privado, Usuario_idUsuario
FROM `playlist`
WHERE  privado = 1;
 
-- 6. Listar el Top 5 de videos con mas cantidad de Likes 
SELECT `idVideo`,`Usuario_idUsuario`,`titulo`,`descripcion`,`tamanio`,`nombreArchivo`,`duracion`,`imagen`,`cantidadReproducciones`,`cantidadLikes`,`cantidadDislikes`,`privado`,`fechaPublicacion`
FROM `video` 
ORDER BY cantidadLikes DESC LIMIT  5;

-- 7. Insertar un usuario con los siguientes datos :
	-- a. Nombre : Juan Jose Batzal
	-- b. email : jjbatzal@gmail.com
	-- c. password : jj1597
	-- d. fecha de nacimiento : 01/04/2000
	-- e. codigopostal : 1429
	-- f. país : Argentina
	-- g. Avatar : carita feliz
INSERT INTO usuario (nombre, email, password, fechaNacimiento, codigoPostal, Pais_idPais, Avatar_idAvatar)
VALUES ('Juan Jose Batzal', 'JJBATZAL@gmail.com',  'jj1597', '2020-04-01', 1429,9, 85 );

-- 	select * from usuario where email=?;
--  delete from usuario where idUsuario=?;

-- 8. Generar un listado con todos los usuarios que hayan nacido en el año 2000.
SELECT `idUsuario`,`nombre`,`email`,`password`,`fechaNacimiento`,`codigoPostal`,`Pais_idPais`,`Avatar_idAvatar` 
FROM usuario 
WHERE fechaNacimiento BETWEEN '2000-01-01' AND '2000-12-31';

-- 9. Listar todos los países ordenados alfabéticamente y su nombre en mayúsculas.
SELECT nombre PAIS
FROM pais
ORDER BY 1;

-- 10. Listar todos los videos que posean más de 500 reproducciones.
SELECT	`idVideo`,`Usuario_idUsuario`,`titulo`,`descripcion`,`tamanio`,`nombreArchivo`,`duracion`,`imagen`,
`cantidadReproducciones`,`cantidadLikes`,`cantidadDislikes`,`privado`,`fechaPublicacion`
FROM video 
WHERE cantidadReproducciones > 500000;

-- 11. Generar un reporte de todos los videos , publicados en el año 2020, que sean privados  y que posean más de 100 dislikes.
SELECT	`idVideo`,`Usuario_idUsuario`,`titulo`,`descripcion`,`tamanio`,`nombreArchivo`,`duracion`,`imagen`,
`cantidadReproducciones`,`cantidadLikes`,`cantidadDislikes`,`privado`,`fechaPublicacion`
FROM video 
WHERE YEAR(fechaPublicacion) = 2020 AND privado = 1 AND cantidaddislikes > 100;

-- 12. Por error hemos cargado mal los datos de Juan Jose Batzal, ya que la fecha de nacimiento no era 01/04/2000 , sino 04/01/2000, crear y ejecutar la sentencia necesaria para realizar la modificación.
UPDATE usuario SET fechaNacimiento = '2000-01-04' 
WHERE idUsuario = 25;

-- 	select * from usuario where nombre='Juan Jose Batzal'
 
-- 13. Listar todos los usuarios cuya password contenga menos de 5 caracteres (pista: ver la función length()) 
SELECT `idUsuario`,`nombre`,`email`,`password`,`fechaNacimiento`,`codigoPostal`,`Pais_idPais`,`Avatar_idAvatar` 
FROM usuario 
WHERE LENGTH(password)<5;
 
-- 14. Generar un reporte de los usuarios que muestre los siguientes tí­tulos de la consulta: Id, Nombre, 'E-mail', 'Fecha de Nacimiento', Edad, 'Codigo de País'
SELECT idUsuario as Id, nombre as Nombre, email as 'E-mail', fechaNacimiento as 'Fecha de Nacimiento'
,TIMESTAMPDIFF(YEAR, fechaNacimiento, now()) AS Edad, Pais_idPais as 'Codigo de Pais'
FROM usuario;

-- 15. Listar el video de mayor tamaño.
SELECT	`idVideo`,`Usuario_idUsuario`,`titulo`,`descripcion`,`tamanio`,`nombreArchivo`,`duracion`,`imagen`,`cantidadReproducciones`,`cantidadLikes`,`cantidadDislikes`,`privado`,`fechaPublicacion`
FROM video 
ORDER BY tamanio DESC LIMIT 1;

-- 16. Generar un reporte de las últimas 10 reacciones, listando la fecha, el código de reacción, el id de usuario y el video.
SELECT fecha, TipoReaccion_idTipoReaccion, Usuario_idUsuario, Video_idVideo 
FROM reaccion
ORDER BY fecha desc LIMIT 10;

-- 17. Listar todos los videos que tengan menos de 100000 reproducciones y más de 100 likes 
SELECT	`idVideo`,`Usuario_idUsuario`,`titulo`,`descripcion`,`tamanio`,`nombreArchivo`,`duracion`,`imagen`,`cantidadReproducciones`,`cantidadLikes`,`cantidadDislikes`,`privado`,`fechaPublicacion`
FROM video 
WHERE cantidadReproducciones <100000 AND cantidadLikes >=100;

-- 18. Mostrar todos los videos que incluyan la palabra FAN dentro de su descripción .
SELECT	`idVideo`,`Usuario_idUsuario`,`titulo`,`descripcion`,`tamanio`,`nombreArchivo`,`duracion`,`imagen`,`cantidadReproducciones`,`cantidadLikes`,`cantidadDislikes`,`privado`,`fechaPublicacion`
FROM video 
WHERE descripcion LIKE '%FAN%';

-- 19. Generar un listado de los usuarios cuyan passwords sean aquellas que no satisfacen las políticas de seguridad de la empresa, estas son las que matchean con (123,1234,12345,abc,clave,password)
SELECT `idUsuario`,`nombre`,`email`,`password`,`fechaNacimiento`,`codigoPostal`,`Pais_idPais`,`Avatar_idAvatar` 
FROM usuario 
WHERE  password IN ('123','1234','12345','abc','clave','password');

-- 20. Eliminar el avatar llamado apodo avDhTube
SET SQL_SAFE_UPDATES=0;
DELETE FROM avatar 
WHERE nombre = 'avDhTube';