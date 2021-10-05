SELECT * FROM cancion
WHERE titulo LIKE "%z%";

SELECT * FROM cancion
WHERE titulo LIKE "_a%s";

SELECT idPlaylist AS "Id Playlist", 
idusuario AS "Id Usuario", 
titulo AS Titulo, 
idestado AS "Id Estado", 
Fechacreacion AS "Fecha Creación",  
Fechaeliminada AS "Fecha Eliminada"
FROM playlist
ORDER BY cantcanciones DESC
LIMIT 1;

SELECT * FROM usuario
ORDER BY fecha_nac 
LIMIT 10
offset 5;

SELECT * FROM cancion
ORDER BY cantreproduccion DESC
LIMIT 5;

-- 6
SELECT * FROM album
ORDER BY titulo;

-- 7
SELECT * FROM album
WHERE imagenportada IS NULL OR imagenportada = ""
ORDER BY titulo;

-- 8
INSERT INTO usuario
(idUsuario,nombreusuario, nyap, fecha_nac, sexo, CP, password, Pais_idPais, IdTipoUsuario)
VALUES(20,'nuevousuariodespotify@gmail.com', 'Elmer Gomez', '1991-11-15', 'M', 'B4129ATF', 'S4321m', 2, 1);

-- 9
DELETE FROM generoxcancion
WHERE IdGenero =9;


-- 10
UPDATE artista
SET imagen = 'Imagen faltante'
WHERE imagen is null or imagen= "";


-- Por error 1175, otorga permisos
-- SET SQL_SAFE_UPDATES = 0




