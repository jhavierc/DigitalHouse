let str = "un string cualquiera"

let grupoDeAmigos = [
    [45, 89, 0],
    ["Digital", "House", true],
    ["string", "123", "false", 54, true, str]
]
console.log(grupoDeAmigos[2][grupoDeAmigos[2].length - 1])



//Colecciones de peliculas
console.log("----- Colecciones de peliculas  ----");
//1.
let peliculas = ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"]
console.log(peliculas[1]);

//2 y 3.
let extras = ["toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"]

function unirArrays(array1, array2) {
    return array1.concat(array2);
}

function convertirAMayusculas(lista) {
    for (i = 0; i < lista.length; i++) {
        lista[i] = lista[i].toUpperCase();
    }
    lista.pop()
    return lista;
}
let listaPelicuas = convertirAMayusculas(unirArrays(peliculas, extras));
console.log("\n\nResultado de unir los dos arrays y pasarlos a mayúsculas");
console.log(listaPelicuas);

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 4];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 5];

function compararCalificaciones(array, array2) {
    let arrayFinal = []
    for (let i = 0; i < array.length; i++) {
        let dato = listaPelicuas[i] + (array[i] === array2[i] ? " >> Score iguales" : " >> Score diferentes");
        arrayFinal[i] = dato;
    }
    return arrayFinal;
}

console.log("\n\nResultado comparación de calificacion de scores");
console.log(compararCalificaciones(asiaScores, euroScores))

console.log("\n----- Extra Bonus ----");

let miarray = [1, 2, 3, 4, 5, 6, 7, 8, 9]

function imprimirInverso(array) {
    console.log(array.reverse());
}
imprimirInverso(miarray)

function inversor(array) {
    let arrayInverso = []
    let cont = 0
    for (let i = array.length - 1; i >= 0; i--) {
        arrayInverso[cont] = array[i]
        cont++
    }
    return arrayInverso;
}
let miarray2 = [11, 12, 13, 14, 15, 16, 17, 18, 19]

console.log(inversor(miarray2));


console.log("\n----- Suma Array ----");

function sumaArray(array) {
    let suma = 0;
    for (let i = 0; i < array.length; i++) {
        suma += array[i];
    }
    return suma;
}
console.log(sumaArray([1, 3, 4]));
console.log(sumaArray([10, 3, 10]));
console.log(sumaArray([-5, 100, 19]));


console.log("\n----- Simulacion de Array.join()----");

function join(array) {
    let cadena = '';
    for (let i = 0; i < array.length; i++) {
        cadena += array[i];
    }
    return cadena;
}
console.log(join(['h', 'o', 'l', 'a']));
console.log(join(['c', 'h', 'a', 'o']));