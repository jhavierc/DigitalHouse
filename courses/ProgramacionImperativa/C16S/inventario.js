const fs = require('fs')


//1 leer archivos
function leerArchivo(archivo) {
    let contenido = fs.readFileSync(archivo, 'utf-8')
    if (contenido) {
        return JSON.parse(contenido);
    }
    return [];
}

//2 escribir archivos
function escribirArchivo(contenido, archivo) {
    fs.writeFileSync(archivo, JSON.stringify(contenido))
}



const jsonHelper = {
    leerJson: function(nombreArchivo) {
        return leerArchivo(nombreArchivo)
    },
    escribirJson: function(nombreArchivo, datos) {
        escribirArchivo(datos, nombreArchivo)
    }
}

module.exports = jsonHelper;