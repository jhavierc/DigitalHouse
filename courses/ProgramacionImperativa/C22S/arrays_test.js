let vehiculos = [
    { "marca": "Dodge", "modelo": "Caravan", "anio": 2011, "precio": 317621, "patente": "RDH130", "vendido": true },
    { "marca": "Dodge", "modelo": "Caravan", "anio": 2001, "precio": 317621, "patente": "RDH130", "vendido": true },
    { "marca": "Dodge", "modelo": "Caravan", "anio": 2008, "precio": 317621, "patente": "RDH130", "vendido": true }
];

//Aqui comparten memoria, cada elemento de copia apunta a la misma posicion de memoria de vehiculos (array original)
let copia = vehiculos;
//se modifica la marca del primer elementro del array para comprobar que comparten memoria
copia[0].marca = 'Mazda';
//se imprime el primer objeto de los dos array (origina y copia) para comprobar que el cambio de la linea 10 aplica para los dos arrays
console.log(copia[0]);
console.log(vehiculos[0]);

console.log("----------------");
//Aqui se crea un nuevo array, se asigna el valor (no posicion)
let nuevo = copiarArray(vehiculos);
//modificamos la marca del primer elementro del array para comprobar que son diferentes posiciones de memoria
nuevo[0].marca = 'Mazda 3 Modificado';
//aqui se imprime el nuevo array y se nota que el cambio solo le aplica al primer elemento
console.log(nuevo);


//funcion que permite copiar un array NUEVO el cual se puede iterar de forma independiente que el ORIGINAL
function copiarArray(arrayOriginal) {
    let arrayNuevo = [];
    arrayOriginal.forEach(element => {
        arrayNuevo.push(element);
    });
    return arrayNuevo;
}

console.info("----------------");
nuevo.sort((a, b) => a.anio - b.anio);
console.log(nuevo);

console.log("----------------");
nuevo.sort((a, b) => b.anio - a.anio);
console.log(nuevo);